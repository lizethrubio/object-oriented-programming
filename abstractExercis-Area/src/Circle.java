import java.lang.Math;
import java.util.Objects;


public class Circle extends Figure{
    public Double radio;

    @Override
    public void calculateArea() {
        this.radio = getRadio();
        area = Math.PI * Math.sqrt(radio);
        setArea(area);
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return String.format("Circle { Area = %f, Radio = %f }", getArea(), this.radio);
    }

    @Override
    public int hashCode() {
        return 10* Objects.hash(super.hashCode(), this.radio);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Circle that = (Circle) obj;
        return radio.equals(that.radio);
    }


}
