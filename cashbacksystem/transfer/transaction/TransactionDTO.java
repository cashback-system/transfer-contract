package cashbacksystem.transfer.transaction;

import cashbacksystem.transfer.card.CardDTO;
import cashbacksystem.transfer.category.CategoryDTO;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

/**
 * DTO-модель транзакции.
 *
 * @param time     - время
 * @param card     - карта
 * @param category - категория
 * @param cost     - сумма
 */
public record TransactionDTO(
    ZonedDateTime time,
    CardDTO card,
    CategoryDTO category,
    BigDecimal cost
) {
}
