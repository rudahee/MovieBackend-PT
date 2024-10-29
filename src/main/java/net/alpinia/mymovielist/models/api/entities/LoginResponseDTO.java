package net.alpinia.mymovielist.models.api.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class LoginResponseDTO {
    private String token;

    private long expiresIn;


}
