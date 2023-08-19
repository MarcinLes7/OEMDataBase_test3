package pl.wszib.oemdatabase_test3.web.mappers;

import pl.wszib.oemdatabase_test3.data.entities.WorkplaceEntity;
import pl.wszib.oemdatabase_test3.web.models.WorkplaceModel;

public class WorkplaceMapper {
    public static WorkplaceEntity toEntity(WorkplaceModel model) {
        WorkplaceEntity entity = new WorkplaceEntity();
        entity.setDepartment(model.getDepartment());
        entity.setPhase(model.getPhase());
        entity.setRoom(model.getRoom());
        entity.setActivity(model.getActivity());
        entity.setPpe(model.getPpe());
        entity.setFirstName(model.getFirstName());
        entity.setLastName(model.getLastName());
        return entity;
    }
}
