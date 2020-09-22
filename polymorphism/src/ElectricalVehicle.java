import java.util.Objects;

public class ElectricalVehicle extends Vehicle {
    private Integer potency;

    public ElectricalVehicle() {
    }

    public ElectricalVehicle(Integer potency) {
        this.potency = potency;
    }

    public ElectricalVehicle(String brand, String model, Integer year, Integer potency) {
        this.potency = potency;
//      super(brand, model, year);
        super.setBrand(brand);
        super.setModel(model);
        super.setYear(year);
    }

    public Integer getPotency() {
        return potency;
    }

    public void setPotency(Integer potency) {
        this.potency = potency;
    }

    public String technicalSheet() {
        return getYear() < 2007 ?
                " No existe modelo para este año" :
                " Es un auto de última tecnología!" +
                        "\n ElectricalVehicle { Brand: " + getBrand()
                        + ", Model: " + getModel() +
                        ", Year:  " + getYear()+ " }";
    }

    @Override
    public String toString() {
        return String.format(
                "ElectricalVehicle { Brand: %s, Model: %s, Year: %d, Potency: %d }",
                getBrand(),
                getModel(),
                getYear(),
                this.potency);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ElectricalVehicle that = (ElectricalVehicle) o;
        return Objects.equals(potency, that.potency);
    }

    @Override
    public int hashCode() {
        return 10 * Objects.hash(super.hashCode(), potency);
    }
}
