package cashbacksystem.transfer.card;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * DTO-модель карты.
 *
 * @param id              - идентификатор
 * @param cardType        - тип карты
 * @param name            - наименование типа карты
 * @param cashbackPercent - процент кэшбека
 */
@Builder(setterPrefix = "with")
public record CardDTO(
    @NotNull
    UUID id,
    CardType cardType,
    String name,
    BigDecimal cashbackPercent
) {
}
