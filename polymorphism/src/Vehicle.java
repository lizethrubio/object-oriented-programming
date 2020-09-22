import java.util.Objects;

public class Vehicle {
    protected String brand;
    protected String model;
    protected Integer year;

    public Vehicle() {
    }

    public Vehicle(String brand, String model, Integer year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String technicalSheet() {
        return String.format("Marca: %s, Model: %s, Year: %d, .\n Este vehículo no tiene categoría asignada ", brand, model, year);
    }

    @Override
    public String toString() {
        return String.format("Vehicle{brand = %s, model = %s, year = %d  }", brand, model, year);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(brand, vehicle.brand) &&
                Objects.equals(model, vehicle.model) &&
                Objects.equals(year, vehicle.year);
    }

    @Override
    public int hashCode() {
        return 10 * Objects.hash(brand, model, year);
    }
}
