import java.util.Objects;

public class Dog extends Animal {

    private Integer legs;
    private Integer age;

    public Dog() {
    }

    public Dog(String breed, Integer legs, Integer age) {
        super(breed);
        this.legs = legs;
        this.age = age;
    }

    public Integer getLegs() {
        return legs;
    }

    public void setLegs(Integer legs) {
        this.legs = legs;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Dog { legs= %d, Age= %d, breed= %s }", legs, age, this.getBreed());
    }

    @Override
    public int hashCode() {
        return -10 * Objects.hash(legs, age, this.getBreed());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Dog that = (Dog) obj;
        return (legs.equals(that.legs)&&age.equals(that.age));
    }
}
