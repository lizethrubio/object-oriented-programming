import java.util.Objects;

public class Truck extends Vehicle {
    private Integer maxLoad;

    public Truck() {
    }

    public Truck(Integer maxLoad) {
        this.maxLoad = maxLoad;
    }

    public Truck(String brand, String model, Integer year, Integer maxLoad) {
        this.maxLoad = maxLoad;
        super.setBrand(brand);
        super.setModel(model);
        super.setYear(year);
    }

    public Integer getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(Integer maxLoad) {
        this.maxLoad = maxLoad;
    }

    public String technicalSheet() {
        String info = "\n { Brand = " + brand + ", " +
                ", Model = " + model + ", " +
                ", Year = " + year+ " } ";

        return maxLoad < 100 ? " Para iniciar un negocio de flete, está muy bien este auto " + info :
                " Tienes que usar este auto en el campo, es una máquina de trabajo!! " + info;
    }

    @Override
    public String toString() {
        return " Truck{ " +
                " maxLoad = " + maxLoad +
                ", brand = " + brand + ", " +
                ", model = " + model + ", " +
                ", year = " + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck that = (Truck) o;
        return Objects.equals(maxLoad, that.maxLoad) && Objects.equals(getBrand(), that.getBrand()) &&
                Objects.equals(getModel(), that.getModel()) && Objects.equals(getYear(), that.getYear());
    }

    @Override
    public int hashCode() {
        return 10 * Objects.hash(super.hashCode(), this.maxLoad, getBrand(), getModel(), getYear());
    }

}
