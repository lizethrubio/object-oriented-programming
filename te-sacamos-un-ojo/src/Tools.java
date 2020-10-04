import java.util.Scanner;

public class Tools extends Product{

    public String typeTool;

    Scanner keyboard = new Scanner (System.in);

    @Override
    public Double calculatePrice() {
        System.out.println("\n Que herramienta desea" +
                "\t 1. Llave Inglesa 5 pulg - $4.50" +
                "\t 2. Taladro Electrico 100hsp- $44.0" +
                "\t 3. Martillo del Medio Oriente - $15.0");
        int type = keyboard.nextInt();
        switch (type) {
            case 1:
                typeTool = "Llave Inglesa 5 pulg ";
                this.price = 4.50d;
                break;
            case 2:
                typeTool = "Taladro Electrico 100hsp";
                this.price = 44.0d;
                break;
            default:
                typeTool = "Martillo del Medio Oriente";
                this.price = 15.0d;
                break;
        }
        return  price;
    }

    @Override
    public Double calculateDiscount(){
        if (super.getTDC()){
            discount=0.05d;
        }else discount=0d;
        return  discount;
    }




    @Override
    public Double getPrice() {
        return super.getPrice();
    }

    @Override
    public Double getDiscount() {
        return calculateDiscount();
    }

    public String getTypeTool() {
        return typeTool;
    }

    @Override
    public String toString() {
        return String.format(
        "Herramientas: \t * "+ typeTool + " *"+
                "\n\tPrecio: $  " + price +
                "\t\t Descuento: $ " + (discount*price) );
    }
}
