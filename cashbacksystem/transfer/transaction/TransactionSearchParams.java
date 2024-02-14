package cashbacksystem.transfer.transaction;

import cashbacksystem.transfer.card.CardDTO;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;

import java.time.ZonedDateTime;

/**
 * Параметры для поиска транзакций.
 * Будут найдены все транзакции по карте, в промежутке времени [startTime, endTime].
 *
 * @param card      - карта
 * @param startTime - минимальная дата транзакции
 * @param endTime   - максимальная дата транзакции
 */
@Builder(setterPrefix = "with")
public record TransactionSearchParams(
    @NotNull
    CardDTO card,

    @NotNull
    ZonedDateTime startTime,

    @NotNull
    ZonedDateTime endTime
) {
}
