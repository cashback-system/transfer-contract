package cashbacksystem.transfer.cashback;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;

import java.math.BigDecimal;

/**
 * DTO-модель кэшбека.
 *
 * @param cashbackValue - значение кэшбека
 */
@Builder(setterPrefix = "with")
public record CashbackDTO(
    @NotNull
    BigDecimal cashbackValue
) {
}
