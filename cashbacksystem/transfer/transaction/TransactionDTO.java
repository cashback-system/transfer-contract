package cashbacksystem.transfer.transaction;

import cashbacksystem.transfer.card.CardDTO;
import cashbacksystem.transfer.category.CategoryDTO;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

/**
 * DTO-модель транзакции.
 *
 * @param time     - время
 * @param card     - карта
 * @param category - категория
 * @param sum      - сумма
 */
@Builder(setterPrefix = "with")
public record TransactionDTO(
    @NotNull
    ZonedDateTime time,

    @NotNull
    CardDTO card,

    @NotNull
    CategoryDTO category,

    @NotNull
    BigDecimal sum
) {
}
