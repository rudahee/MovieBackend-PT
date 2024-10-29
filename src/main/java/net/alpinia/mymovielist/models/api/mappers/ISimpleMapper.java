package net.alpinia.mymovielist.models.api.mappers;

import java.util.List;

public interface ISimpleMapper<E, D> {

    E toEntity(D dto);
    D toDto(E entity);

    default List<E> toEntities(List<D> dtos) {
        return dtos.stream().map(this::toEntity).toList();
    }
    default List<D> toDTOs(List<E> entities) {
        return entities.stream().map(this::toDto).toList();
    }

}
