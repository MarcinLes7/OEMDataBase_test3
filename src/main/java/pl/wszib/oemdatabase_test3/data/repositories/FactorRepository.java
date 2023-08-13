package pl.wszib.oemdatabase_test3.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.wszib.oemdatabase_test3.data.entities.FactorEntity;

public interface FactorRepository extends JpaRepository<FactorEntity, Long> {
}
