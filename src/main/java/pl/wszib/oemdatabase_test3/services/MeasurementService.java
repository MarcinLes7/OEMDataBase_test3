package pl.wszib.oemdatabase_test3.services;

import org.springframework.stereotype.Service;
import pl.wszib.oemdatabase_test3.data.repositories.MeasurementRepository;

@Service
public class MeasurementService {
    private final MeasurementRepository measurementRepository;

    public MeasurementService(MeasurementRepository measurementRepository) {
        this.measurementRepository = measurementRepository;
    }



}
