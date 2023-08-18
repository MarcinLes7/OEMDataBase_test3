package pl.wszib.oemdatabase_test3.services;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import pl.wszib.oemdatabase_test3.data.entities.FactorEntity;
import pl.wszib.oemdatabase_test3.data.entities.MeasurementEntity;
import pl.wszib.oemdatabase_test3.data.entities.WorkplaceEntity;
import pl.wszib.oemdatabase_test3.data.repositories.FactorRepository;
import pl.wszib.oemdatabase_test3.data.repositories.MeasurementRepository;
import pl.wszib.oemdatabase_test3.web.mappers.WorkplaceMapper;
import pl.wszib.oemdatabase_test3.web.models.WorkplaceModel;

@Service
public class MeasurementService {
    private final MeasurementRepository measurementRepository;
    private final FactorRepository factorRepository;

    public MeasurementService(MeasurementRepository measurementRepository, FactorRepository factorRepository) {
        this.measurementRepository = measurementRepository;
        this.factorRepository = factorRepository;
    }

    @Transactional
    public Long saveMeasurement(Long factorId, WorkplaceModel workplaceModel) {
        FactorEntity factorEntity = factorRepository.findById(factorId)
                .orElseThrow(EntityNotFoundException::new);

        WorkplaceEntity workplaceEntity = WorkplaceMapper.toEntity(workplaceModel);

        MeasurementEntity measurementEntity = new MeasurementEntity();
        measurementEntity.setFactorName(factorEntity.getName());
        measurementEntity.setNds(factorEntity.getNds());
        measurementEntity.setMeasurementResult(measurementEntity.getMeasurementResult());
        measurementEntity.setDate(measurementEntity.getDate());
        measurementEntity.setWorkplaceId(workplaceEntity);

        final var savedMeasurement = measurementRepository.save(measurementEntity);
        return savedMeasurement.getId();

    }

}















