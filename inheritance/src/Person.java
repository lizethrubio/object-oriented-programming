import java.util.Objects;

public class Person {

    private String name;
    private String lastname;

    public Person () {}
    public Person (String name) {
        this.name = name;
    }

    public Person (String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getName() {
        return name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return String.format(
                "Person { name= %s, lastname= %s, }", name, lastname);
    }

    @Override
    public int hashCode(){
        return 30 * Objects.hash(this.name, this.lastname);
    }

    @Override
    public boolean equals (Object o){
        if (this == o) return true;
        if (o==null|| this.getClass() != o.getClass()) return false;
        Person that = (Person) o;
        return (this.name.equals(that.name) && this.lastname.equals(that.lastname));
    }
}
