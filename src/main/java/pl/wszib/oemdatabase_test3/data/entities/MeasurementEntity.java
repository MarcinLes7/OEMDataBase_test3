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
    private String factorName;
    @Column(name = "nds")
    private double nds;
    @Column(name = "measurement_result")
    private double measurementResult;
    @Column(name = "date")
    private String date;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "workplace_id")
    private WorkplaceEntity workplaceId;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFactorName() {
        return factorName;
    }
    public void setFactorName(String factor_name) {
        this.factorName = factor_name;
    }
    public double getNds() {
        return nds;
    }
    public void setNds(double nds) {
        this.nds = nds;
    }
    public double getMeasurementResult() {
        return measurementResult;
    }
    public void setMeasurementResult(double measurement_result) {
        this.measurementResult = measurement_result;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public WorkplaceEntity getWorkplaceId() {
        return workplaceId;
    }
    public void setWorkplaceId(WorkplaceEntity workplace) {
        this.workplaceId = workplace;
    }
}
