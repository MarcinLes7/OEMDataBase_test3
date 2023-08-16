package pl.wszib.oemdatabase_test3.web.models;

public class FactorModel {
    private Long id;
    private String name;
    private double nds;
    private String unit;
    private String description;

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
    public String getName() {
        return name;
    }
    public double getNds() {
        return nds;
    }
    public String getUnit() {
        return unit;
    }
    public String getDescription() {
        return description;
    }
}
