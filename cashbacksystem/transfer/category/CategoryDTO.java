package cashbacksystem.transfer.category;

import java.util.UUID;

/**
 * Категория покупки.
 *
 * @param id   - идентификатор
 * @param name - название категории
 */
public record CategoryDTO(
    UUID id,
    String name
) {
}
