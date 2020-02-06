
package mobileappws.Dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import mobileappws.constants.MessagesPortuguese;

/**
 * UserResquestDTO
 */
public class UserRestDTO {

    @NotNull(message = MessagesPortuguese.MESSAGE_FIRST_NAME_REQUIRED)
    private String firstName;

    @NotNull(message = MessagesPortuguese.MESSAGE_LAST_NAME_REQUIRED)
    private String lastName;

    @Email(message = MessagesPortuguese.MESSAGE_EMAIL_INVALID)
    @NotNull(message = "E-mail cannot be null.")
    private String email;

    @NotNull(message = MessagesPortuguese.MESSAGE_PASSWORD_REQUIRED)
    @Size(min=8, max=16, message = MessagesPortuguese.MESSAGE_PASSWORD_SIZE_INVALID)
    private String password;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}