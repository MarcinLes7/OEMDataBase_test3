package pl.wszib.oemdatabase_test3.data.entities;
import jakarta.persistence.*;
@Entity
@Table(name = "factors")
public class FactorEntity {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "nds")
    private double nds;
    @Column(name = "unit")
    private String unit;
    @Column(name = "description")
    private String description;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getNds() {
        return nds;
    }
    public void setNds(double nds) {
        this.nds = nds;
    }
    public String getUnit() {
        return unit;
    }
    public void setUnit(String unit) {
        this.unit = unit;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
