
import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCar {
    static int quantityToys;
    static double shoppingInToys;
    static Boolean discountDay;

//    Scanner keyboard = new Scanner(System.in);

    public ShoppingCar(Scanner keyboard) {
        startShopping(keyboard);
    }

    int paymentMethod;
    //1. Efectivo 2. Tarjeta Credito 3. Tarjeta Debito

    public int getPaymentMethod() {
        return paymentMethod;
    }

    public void startShopping(Scanner keyboard) {
        System.out.println("Bienvenido a la tienda, a continuacion se desplegara sus opciones: ");
        ArrayList<Product> productos = new ArrayList<Product>();
        int continuar = 1;

        while (continuar == 1) {
            menuProductos(keyboard, productos);
            System.out.println("\nPor favor, marque \n\t1. Desea continuar comprando" + "\n\t2. Desea pagar");
            continuar = keyboard.nextInt();
        }
        printTicket (keyboard, productos);


    }

    public void menuProductos(Scanner keyboard, ArrayList<Product> productos) {
        System.out.println("\n Que Tipo de producto desea:" +
                "\n\t 1. Food  " +
                "\n\t 2. Tools " +
                "\n\t 3. Clothes" +
                "\n\t 4. Toys");
        int type = keyboard.nextInt();
        switch (type) {
            case 1:
                Product food = new Food();
                food.calculatePrice();
//                food.calculateDiscount();
                productos.add(food);
                break;
            case 2:
                Product tool = new Tools();
                tool.calculatePrice();
                tool.setTDC(paymentMethod(keyboard));
                tool.calculateDiscount();
                productos.add(tool);
                break;
            case 3:
                Product clothe = new Clothes();
                clothe.calculatePrice();
                clothe.calculateDiscount();
                productos.add(clothe);
                break;
            case 4:
                Product toy = new Toys();
                toy.calculatePrice();
                countToys(toy.getPrice());
                toy.des(quantityToys, shoppingInToys);
                toy.calculateDiscount();
                productos.add(toy);
                break;
            default:
                System.out.println("No ha ingresado una opcion valida");
                break;
        }
    }

    private boolean paymentMethod(Scanner keyboard) {
        Boolean TDCpayment = false;
        System.out.println("Ingrese su metodo de pago: " +
                            "\n\t 1. Tarjeta Debito" +
                            "\n\t 2. Tarjeta Credito" +
                            "\n\t 3. Tarjeta Debito" +
                            "\n\t 4. Cheque" );
        int type = keyboard.nextInt();
        if (type == 2) {
            TDCpayment = true;
        }
        return TDCpayment;
    }

    private void dayOfWeek(Scanner keyboard){

        System.out.println("\nConfirme que dia de la semana es hoy:" +
                "\t 1. Domingo" +
                "\t 2. Lunes" +
                "\t 3. Martes" +
                "\t 4. Miercoles" +
                "\t 5. Jueves"+
                "\t 6. Viernes" +
                "\t 7. Sabado"
        );
        int day  = keyboard.nextInt();
        switch (day) {
            case 3:
            case 5:
                discountDay = true;
                break;
            default:
                discountDay = false;
                break;
        }
    }

    public void printTicket(Scanner keyboard,ArrayList<Product> productos){
        paymentMethod(keyboard);
        dayOfWeek(keyboard);

        System.out.println("A continuacion su factura: ");
       Double totalPrice=0d;
       Double totalDiscount =0d;

        System.out.println("\t - - - - -\n");

        for (Product producto : productos) {
            totalPrice+=producto.getPrice();
            totalDiscount+= producto.getDiscount()*producto.price;
            System.out.println(producto.toString());
            System.out.println("\t - - - - -\n");
        }

        System.out.println("El monto total de su compra (sin descuento) es: $" + totalPrice );
        System.out.println("El descuento total de su compra es: $" + totalDiscount );
        System.out.println("El monto a cancelar (con descuento) es: $" + (totalPrice-totalDiscount) );
    }


    public void countToys(double price){
        quantityToys= quantityToys+1;
        shoppingInToys= shoppingInToys + price;
    }

    public int getQuantityToys() {
        return quantityToys;
    }

    public double getShoppingInToys() {
        return shoppingInToys;
    }
}
