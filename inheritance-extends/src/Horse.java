import java.util.Objects;

public class Horse extends Animal {

    private String name;
    private Integer power;

    public Horse() {
    }

    public Horse(String breed, String name, Integer power) {
        super(breed);
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return String.format("Horse { name= %s, power= %d, breed= %s }", name, power, this.getBreed());
    }

    @Override
    public int hashCode() {
        return -10 * Objects.hash(name, power, this.getBreed());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Horse that = (Horse) obj;
        return (name.equals(that.name) && power.equals(that.power));
    }
}
