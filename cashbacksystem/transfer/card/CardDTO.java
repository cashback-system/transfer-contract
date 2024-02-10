package cashbacksystem.transfer.card;

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
public record CardDTO(
    UUID id,
    CardType cardType,
    String name,
    BigDecimal cashbackPercent
) {
}
