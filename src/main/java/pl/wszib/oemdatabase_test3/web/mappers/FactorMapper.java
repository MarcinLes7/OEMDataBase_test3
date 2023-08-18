package pl.wszib.oemdatabase_test3.web.mappers;

import pl.wszib.oemdatabase_test3.data.entities.FactorEntity;
import pl.wszib.oemdatabase_test3.web.models.FactorModel;

public class FactorMapper {
    public static FactorModel toModel(FactorEntity entity) {
        return new FactorModel(entity.getId(),
                entity.getName(),
                entity.getNds(),
                entity.getUnit(),
                entity.getDescription()
        );
    }

    public static FactorEntity toEntity(FactorModel model) {
        final var entity = new FactorEntity();
        entity.setName(model.getName());
        entity.setNds(model.getNds());
        entity.setUnit(model.getUnit());
        entity.setDescription(model.getDescription());

        return entity;
    }







}
