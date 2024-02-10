package cashbacksystem.transfer.user;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;

import java.util.UUID;

/**
 * DTO-модель пользователя.
 *
 * @param id        - идентификатор
 * @param firstName - имя
 * @param lastName  - фамилия
 */
@Builder(setterPrefix = "with")
public record UserDTO(
    @NotNull
    UUID id,
    String firstName,
    String lastName
) {
}
