import java.util.Objects;

public abstract class Figure {
    protected Double area;

    public Figure(){}

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public abstract void calculateArea();

    @Override
    public String toString() {
        return String.format("Figure{ area=" + area + "  }");
    }

    @Override
    public int hashCode() {
        return 10* Objects.hash(hashCode(), getArea());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Figure that = (Figure) obj;
        return Objects.equals(area, that.area);
    }
}

