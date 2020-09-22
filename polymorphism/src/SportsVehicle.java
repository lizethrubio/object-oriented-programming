import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Objects;

public class SportsVehicle extends Vehicle {
    private Integer rpm;

    public SportsVehicle() {
    }

    public SportsVehicle(Integer rpm) {
        this.rpm = rpm;
    }

    public SportsVehicle(String brand, String model, Integer year, Integer rpm) {
        this.rpm = rpm;
        super.setBrand(brand);
        super.setModel(model);
        super.setYear(year);
    }

    public Integer getRpm() {
        return rpm;
    }

    public void setRpm(Integer rpm) {
        this.rpm = rpm;
    }

    public String technicalSheet() {
        String info = "\n { Brand= " + brand + ", " +
                ", Model= " + model + ", " +
                ", Year= " + year+ " } ";
        return rpm > 0 && rpm < 50 ? "El auto es muy bonito, pero solo sirve para salir a pasear" + info :
                rpm < 300 ? "Con este auto puedes desafiar a cualquiera en la pista" + info :
                        rpm < 600 ? "si tienes este auto, debe considerar participar en NASCAR" +
                                info : "¿Eres parte del elenco de rápidos y furiosos?" + info;
    }

    @Override
    public String toString() {
        return "SportsVehicle{" +
                "rpm=" + rpm +
                ", brand='" + brand + ", " +
                ", model='" + model + ", "+
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SportsVehicle that = (SportsVehicle) o;
        return Objects.equals(rpm, that.rpm) && Objects.equals(getBrand(), that.getBrand()) &&
                Objects.equals(getModel(), that.getModel()) && Objects.equals(getYear(), that.getYear());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), rpm, getBrand(), getModel(), getYear());
    }
}
