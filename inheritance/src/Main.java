public class Main {
    public static void main(String[] args) {
        Person laura = new Person("Laura", "Rubio");
        Person juan = new Person("Juan", "Arboleda");
        Person santiago = new Person("Santiago", "Patino");
        Person roni = new Person("Roni", "Bolana");

        System.out.println("-----Informacion de " + laura.getName() + " -----");
        System.out.println("toString: ");
        System.out.println(laura.toString());

        System.out.println("hashCode: ");
        System.out.println(laura.hashCode());

        System.out.println("toEquals: ");
        System.out.println(laura.equals(juan));

        System.out.println("-----Informacion de " + juan.getName() + " -----");
        System.out.println("toString: ");
        System.out.println(juan.toString());

        System.out.println("hashCode: ");
        System.out.println(juan.hashCode());

        System.out.println("toEquals: ");
        System.out.println(juan.equals(santiago));

        System.out.println("-----Informacion de " + santiago.getName() + " -----");
        System.out.println("toString: ");
        System.out.println(santiago.toString());

        System.out.println("hashCode: ");
        System.out.println(santiago.hashCode());

        System.out.println("toEquals: ");
        System.out.println(santiago.equals(roni));

        System.out.println("-----Informacion de " + roni.getName() + " -----");
        System.out.println("toString: ");
        System.out.println(roni.toString());

        System.out.println("hashCode: ");
        System.out.println(roni.hashCode());

        System.out.println("toEquals: ");
        System.out.println(roni.equals(roni));
    }
}
