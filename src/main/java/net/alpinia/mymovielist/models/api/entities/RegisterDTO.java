package net.alpinia.mymovielist.models.api.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RegisterDTO {

    private String username;
    private String password;

    private String fullName;
    private String email;

}
