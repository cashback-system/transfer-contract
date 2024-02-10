package cashbacksystem.transfer.api;

import cashbacksystem.transfer.card.CardDTO;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.UUID;

/**
 * Api сервиса карт.
 */
@Headers({
    "Accept: application/json",
    "Content-Type: application/json"
})
@FeignClient(
    value = "card-api",
    url = "${microservice.card-api.url}"
)
public interface CardApi {

    /**
     * Получение карты по id.
     *
     * @param id - идентификатор карты
     * @return найденная карта
     */
    @GetMapping(value = "/api/v1/card/{id}", produces = "application/json")
    CardDTO getCardById(@PathVariable UUID id);
}
