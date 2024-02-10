package cashbacksystem.transfer.api;

import cashbacksystem.transfer.category.CategoryDTO;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.UUID;

/**
 * Api сервиса категорий.
 */
@Headers({
    "Accept: application/json",
    "Content-Type: application/json"
})
@FeignClient(
    value = "category-api",
    url = "${microservice.category-api.url}"
)
public interface CategoryApi {

    /**
     * Получение категории по id.
     *
     * @param id - идентификатор категории
     * @return найденная категория
     */
    @GetMapping(value = "/api/v1/category/{id}", produces = "application/json")
    CategoryDTO getCategoryById(@PathVariable UUID id);
}
