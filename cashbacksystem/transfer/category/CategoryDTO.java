package cashbacksystem.transfer.category;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * Категория покупки.
 *
 * @param id              - идентификатор
 * @param name            - название категории
 * @param cashbackPercent - процент кэшбэка
 */
@Builder(setterPrefix = "with")
public record CategoryDTO(
    @NotNull
    UUID id,
    String name,
    BigDecimal cashbackPercent
) {
}
