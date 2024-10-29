package net.alpinia.mymovielist.services.crud;

import net.alpinia.mymovielist.models.api.mappers.ISimpleMapper;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public abstract class AbstractCRUDService<E, D, M extends ISimpleMapper<E, D>, R extends JpaRepository<E, I>, I> {

    protected R repository;

    protected M mapper;

    protected AbstractCRUDService(R repository, M mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    /* This method save or update an entity from dto, and returns dto.
     *
     * @param d DTO
     *
     * @return DTO
     */
    public D save(D d) {
        E entity = mapper.toEntity(d);
        return mapper.toDto(repository.save(entity));
    }

    /* This method save or update an entity, and returns dto.
     *
     * @param entity E
     *
     * @return DTO
     */
    public D saveEntity(E entity) {
        // Return response in DTO Format.
        return mapper.toDto(repository.save(entity));
    }

    /* This method save or update a List<DTO>, and returns List<DTO>.
     *
     * @param d List<DTO>
     *
     * @return List<DTO>
     */
    public List<D> saveAll(List<D> d) {

        //Convert to Entity to save in BBDD
        List<E> entity = mapper.toEntities(d);

        // Return response in DTO Format.
        return mapper.toDTOs(repository.saveAll(entity));
    }

    /* This method save or update a List<E>, and returns List<DTO>.
     *
     * @param entities List<E>
     *
     * @return List<DTO>
     */
    public List<D> saveAllEntities(List<E> entities) {

        // Return response in DTO Format.
        return mapper.toDTOs(repository.saveAll(entities));
    }

    /* This method return an Optional<DTO> by id.
     *
     * @param id
     *
     * @return Optional<DTO>
     */
    public Optional<D> findById(I id) {
        Optional<E> entity = repository.findById(id);

        return entity.map(e -> mapper.toDto(e));
    }

    /* This method return all DTOs.
     *
     * @return List<DTO>
     */
    public List<D> findAll() {

        return mapper.toDTOs(repository.findAll());
    }

    /* This method check if an entity exists by id.
     *
     * @param id
     *
     * @return Boolean
     */
    public Boolean existsById(I id) {
        return repository.findById(id).isPresent();
    }

    /* This method delete a dto.
     *
     * @param d
     */
    public void delete(D d) {
        repository.delete(mapper.toEntity(d));
    }

    /* This method delete a dto by id.
     *
     * @param id
     */
    public void deleteById(I id) {
        repository.deleteById(id);
    }

}
