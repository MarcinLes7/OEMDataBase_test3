package pl.wszib.oemdatabase_test3.web.models;

import jakarta.validation.constraints.Pattern;

public class FactorModel {
    private Long id;
    private String name;
    @Pattern(regexp = "[0-9]{3}")
    private double nds;
    private String unit;
    private String description;

    public FactorModel() {

    }

    public FactorModel(Long id, String name, double nds, String unit, String description) {
        this.id = id;
        this.name = name;
        this.nds = nds;
        this.unit = unit;
        this.description = description;
    }

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
