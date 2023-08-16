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
    @Column(name = "nds")
    private double nds;

    @Column(name = "measurement_result")
    private double measurement_result;
    @Column(name = "date")
    private String date;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "workplace_id")
    private WorkplaceEntity workplace;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFactor_name() {
        return factor_name;
    }

    public void setFactor_name(String factor_name) {
        this.factor_name = factor_name;
    }

    public double getNds() {
        return nds;
    }

    public void setNds(double nds) {
        this.nds = nds;
    }

    public double getMeasurement_result() {
        return measurement_result;
    }

    public void setMeasurement_result(double measurement_result) {
        this.measurement_result = measurement_result;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public WorkplaceEntity getWorkplace() {
        return workplace;
    }

    public void setWorkplace(WorkplaceEntity workplace) {
        this.workplace = workplace;
    }
}
