package pl.wszib.oemdatabase_test3.data.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "measurements")
public class MeasurementEntity {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Column(name = "factor_name")
    private String factor_name;
    @Column(name = "measurement_result")
    private double measurement_result;
    @Column(name = "workplace_name")
    private String workplace_name;
    @Column(name = "date")
    private String date;
}
