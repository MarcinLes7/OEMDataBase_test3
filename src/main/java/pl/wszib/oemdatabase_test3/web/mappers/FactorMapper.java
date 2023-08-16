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
}
