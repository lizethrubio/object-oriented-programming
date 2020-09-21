public class Main {
    public static void main(String[] args) {

        Dog labrador = new Dog ("Labrador", 4, 1);
        //Dog golden = new Dog ("Labrador", 4, 1);
        Dog golden = new Dog ("GoldenRetriever", 3, 5);
        Horse marron = new Horse("Frison", "Pepe", 20);
        Horse blanco = new Horse ("Percheron", "Rosa", 25);


        System.out.println("\nInformacion de Labrador: ");
        System.out.println("toString: ");
        System.out.println(labrador.toString());
        System.out.println("hashCode: ");
        System.out.println(labrador.hashCode());
        System.out.println("toEquals: golden? ");
        System.out.println(labrador.equals(golden));

        System.out.println("\nInformacion de Golden: ");
        System.out.println("toString: ");
        System.out.println(golden.toString());
        System.out.println("hashCode: ");
        System.out.println(golden.hashCode());
        System.out.println("toEquals: golden?");
        System.out.println(golden.equals(golden));

        System.out.println("\nInformacion de Marron: ");
        System.out.println("toString: ");
        System.out.println(marron.toString());
        System.out.println("hashCode: ");
        System.out.println(marron.hashCode());
        System.out.println("toEquals: blanco? ");
        System.out.println(marron.equals(blanco));

        System.out.println("\nInformacion de Blanco: ");
        System.out.println("toString: ");
        System.out.println(blanco.toString());
        System.out.println("hashCode: ");
        System.out.println(blanco.hashCode());
        System.out.println("toEquals: blanco? ");
        System.out.println(blanco.equals(blanco));
    }

}
