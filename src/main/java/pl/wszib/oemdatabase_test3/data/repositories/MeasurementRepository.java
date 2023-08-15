package pl.wszib.oemdatabase_test3.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.wszib.oemdatabase_test3.data.entities.MeasurementEntity;

public interface MeasurementRepository extends JpaRepository<MeasurementEntity, Long> {
}
