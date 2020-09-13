public class Main {

    public static void main(String[] args) {

        System.out.println("Instance:");

        // two intances
        XWingStarfighter ship1 = new XWingStarfighter();
        XWingStarfighter ship2 = new XWingStarfighter();

        //Set state
        ship1.model = "T-65";
        ship1.maxAceleration = 16;

        ship2.model = "T-75";
        ship2.maxAceleration = 22;

        ship1.shootLaser();
        ship2.shootLaser();

        // copy reference of variable
        XWingStarfighter shipRef1 = ship1;

        // set state from shipRef1
        shipRef1.model = "T-75"; // tecnicamente le estoy cambiando el valor de model a ship1 tambien.

        // excecute method
        shipRef1.shootLaser();
        ship1.shootLaser();




    }



}
