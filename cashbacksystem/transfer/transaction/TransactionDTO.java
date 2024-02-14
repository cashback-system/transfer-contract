package cashbacksystem.transfer.transaction;

import cashbacksystem.transfer.card.CardDTO;
import cashbacksystem.transfer.category.CategoryDTO;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.UUID;

/**
 * DTO-модель транзакции.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(setterPrefix = "with")
public class TransactionDTO {
    @NotNull
    private UUID id;

    /**
     * Время.
     */
    @NotNull
    private ZonedDateTime time;

    /**
     * Карта.
     */
    @NotNull
    private CardDTO card;

    /**
     * Категория.
     */
    @NotNull
    private CategoryDTO category;

    /**
     * Сумма.
     */
    @NotNull
    private BigDecimal amount;
}
