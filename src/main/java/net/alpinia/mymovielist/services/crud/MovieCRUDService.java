package net.alpinia.mymovielist.services.crud;

import net.alpinia.mymovielist.models.api.entities.MovieDTO;
import net.alpinia.mymovielist.models.api.mappers.MovieMapper;
import net.alpinia.mymovielist.models.database.entities.Movie;
import net.alpinia.mymovielist.models.database.repositories.IMovieRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class MovieCRUDService extends AbstractCRUDService<Movie, MovieDTO, MovieMapper, IMovieRepository, UUID> {

    protected MovieCRUDService(IMovieRepository repository, MovieMapper mapper) {
        super(repository, mapper);
    }

}

