package ar.com.ada.online.second.myfirstobject;
//2da parte)
//        En el metodo main de la clase Main, crear un objeto de cada clase, asignar valores a los atributos y
//        mostrarlos por pantalla.
//        Tambien en se debe ejecutar al menos un metodo de cada instancia.



public class Main {

    public static void main(String[] args) {
        Animal burro = new Animal();
        burro.breed = "salvaje";
        burro.color = "gris";
        burro.name ="Pepo";

        System.out.println("El nombre dela animal es: "+ burro.name + ", su color es: " + burro.color + ", su raza" + burro.breed+ ". ");
        System.out.println("¿Què esta haciendo el burro? ... ");
        burro.eat();

        Person juan = new Person();
        juan.age = 23;
        juan.lastName = "Gomez";
        juan.name = "Juan";
        System.out.println("El nombre de la persona es: " + juan.name + ", su apellido es: " + juan.lastName + ", su edad" + juan.age+". ");
        System.out.println("Què esta haciendo Juan? ..");
        juan.sing();

        Vehicule aurelio = new Vehicule();
        aurelio.brand = "Kia";
        aurelio.color = "Rojo salvaje";
        aurelio.maxSpeed = 200;

        System.out.println("La marca del carro es: " + aurelio.brand + ", su color es: " + aurelio.color + ", su velocidad maxima es" + aurelio.maxSpeed+". ");
        System.out.println("Què esta haciendo Aurelio?... ");
        aurelio.moveOn();

    }
}
