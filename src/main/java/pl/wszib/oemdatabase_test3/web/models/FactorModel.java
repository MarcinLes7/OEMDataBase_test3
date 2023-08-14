package pl.wszib.oemdatabase_test3.web.models;

public class FactorModel {
    private Long id;
    private String name;
    private double NDS;
    private String unit;
    private String description;

    public FactorModel(Long id, String name, double NDS, String unit, String description) {
        this.id = id;
        this.name = name;
        this.NDS = NDS;
        this.unit = unit;
        this.description = description;
    }

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getNDS() {
        return NDS;
    }
    public String getUnit() {
        return unit;
    }
    public String getDescription() {
        return description;
    }
}
