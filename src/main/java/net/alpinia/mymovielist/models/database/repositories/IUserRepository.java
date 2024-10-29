package net.alpinia.mymovielist.models.database.repositories;

import net.alpinia.mymovielist.models.database.entities.Movie;
import net.alpinia.mymovielist.models.database.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IUserRepository extends JpaRepository<User, Long> {


    Optional<User> getByUsername(String username);
}
