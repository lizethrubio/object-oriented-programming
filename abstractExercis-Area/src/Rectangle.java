import java.util.Objects;

public class Rectangle extends Figure {
    public Double base;
    public Double height;

    @Override
    public void calculateArea() {
        this.base = getBase();
        this.height = getHeight();
        double area = this.base * this.height;
        setArea(area);
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getBase() {
        return base;
    }

    public Double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return String.format("Rectangle{ Area = %f.00, Base = %f.00, Heigh = %f.00}", getArea(), this.base, this.height);
    }

    @Override
    public int hashCode() {
        return 10 * Objects.hash(super.hashCode(), this.base, this.height);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Rectangle that = (Rectangle) obj;
        return super.equals(obj) &&
                Objects.equals(getBase(), that.getBase()) &&
                Objects.equals(getHeight(), that.getHeight());
    }
}
