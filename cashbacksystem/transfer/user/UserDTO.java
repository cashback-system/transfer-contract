package cashbacksystem.transfer.user;

import java.util.UUID;

/**
 * DTO-модель пользователя.
 *
 * @param id        - идентификатор
 * @param firstName - имя
 * @param lastName  - фамилия
 */
public record UserDTO(
    UUID id,
    String firstName,
    String lastName
) {
}
