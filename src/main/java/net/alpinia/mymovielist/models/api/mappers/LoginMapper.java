package net.alpinia.mymovielist.models.api.mappers;

import net.alpinia.mymovielist.models.api.entities.LoginDTO;
import net.alpinia.mymovielist.models.database.entities.User;

public class LoginMapper implements ISimpleMapper<User, LoginDTO> {

    @Override
    public User toEntity(LoginDTO dto) {
        return null;
    }

    @Override
    public LoginDTO toDto(User entity) {
        return null;
    }
}
