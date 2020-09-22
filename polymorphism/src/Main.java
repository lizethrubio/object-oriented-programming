public class Main {
    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[12];

        vehicles [0] = new Vehicle("Suzuki", "Sedan", 2020);
        vehicles [1]  = new Vehicle("Mazda", "Hashbag", 1993);
        vehicles [2] = new Vehicle("Daewo", "Cielo", 2001);
        vehicles [3]  = new ElectricalVehicle("Tesla", "Hashbag", 2019, 500);
        vehicles [4]  = new ElectricalVehicle("MBW", "Sedan", 2020, 400);
        vehicles [5]  = new ElectricalVehicle("Tesla", "Sedan", 1998, 300);
        vehicles [6] = new SportsVehicle("Ferrari", "Descapotable", 2000, 360);
        vehicles [7]  = new SportsVehicle("Camaro", "Sedan", 2010, 900);
        vehicles [8]  = new SportsVehicle("Dos Puertas", "Hashbag", 2021, 50);
        vehicles [9] = new Truck("Caterpillar", "BMS 500", 2000, 150);
        vehicles [10] = new Truck("MAC", "RM6000", 1989, 80);
        vehicles [11]  = new Truck("MAC", "Cat 534", 2001, 120);


        for (Vehicle vehicle : vehicles) {
            System.out.println("\n --- Informacion del vehiculo: "+ vehicle.toString() + "--- \n");
            System.out.println(vehicle.technicalSheet());
        }
    }


}
