package cashbacksystem.transfer.api;

import cashbacksystem.transfer.cashback.CashbackDTO;
import cashbacksystem.transfer.transaction.TransactionDTO;
import cashbacksystem.transfer.transaction.TransactionSearchParams;
import feign.Headers;
import jakarta.validation.Valid;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Headers({
    "Accept: application/json",
    "Content-Type: application/json"
})
@FeignClient(
    value = "transaction-api",
    url = "${microservice.transaction-api.url}"
)
public interface TransactionApi {

    /**
     * Рассчитать кэшбек по транзакции.
     *
     * @param transaction - данные транзакции
     * @return данные о кэшбеке
     */
    @PostMapping(value = "/calculate-cashback", produces = "application/json")
    CashbackDTO getCardById(@Valid @RequestBody TransactionDTO transaction);

    /**
     * Поиск транзакций по параметрам.
     *
     * @param transactionSearchParams - параметры поиска
     * @return найденные транзакции
     */
    @PostMapping(value = "/search", produces = "application/json")
    List<TransactionDTO> searchByParams(@Valid @RequestBody TransactionSearchParams transactionSearchParams);
}
