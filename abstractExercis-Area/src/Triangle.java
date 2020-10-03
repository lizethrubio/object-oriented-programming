import java.util.Objects;

public class Triangle extends Figure{
    public Double base;
    public Double height;

    public Triangle () { }

    public Triangle (Double base, Double height){
        this.base = base;
        this.height = height;
    }

    @Override
    public void calculateArea() {
       Double area;
       area = getBase()*getHeight()/2;
       setArea(area);
    }

    public Double getBase() {
        return base;
    }

    public Double getHeight() {
        return height;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return String.format("Triangle { Area = %f, Base = %f, Altura= %f }", getArea(), this.base, this.height);
    }

    @Override
    public int hashCode() {
        return 10 * Objects.hash(super.hashCode(), this.base, this.height);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Triangle that = (Triangle) obj;
        return super.equals(obj)&&
                Objects.equals(getBase(), that.getBase()) &&
                Objects.equals(getHeight(), that.getHeight());
    }
}
