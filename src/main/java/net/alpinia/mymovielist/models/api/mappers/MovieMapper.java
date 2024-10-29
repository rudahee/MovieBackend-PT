package net.alpinia.mymovielist.models.api.mappers;

import net.alpinia.mymovielist.models.api.entities.MovieDTO;
import net.alpinia.mymovielist.models.database.entities.Movie;
import org.springframework.stereotype.Service;

@Service
public class MovieMapper implements ISimpleMapper<Movie, MovieDTO> {
    @Override
    public Movie toEntity(MovieDTO dto) {
        return null;
    }

    @Override
    public MovieDTO toDto(Movie entity) {
        return null;
    }
}
