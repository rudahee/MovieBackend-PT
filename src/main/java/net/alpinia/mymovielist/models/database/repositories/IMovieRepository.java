package net.alpinia.mymovielist.models.database.repositories;

import net.alpinia.mymovielist.models.database.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IMovieRepository extends JpaRepository<Movie, UUID> {
}
