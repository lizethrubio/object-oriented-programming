import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil;

import java.util.Objects;
import java.util.Scanner;

public class Toys extends Product{


    public Toys() {
    }

    Scanner keyboard = new Scanner (System.in);
    String typeToy;

    @Override
    public Double calculatePrice() {
        System.out.println("\n Que juguete desea:" +
                "\t 1. Sonajero  - $600.0" +
                "\t 2. Carro control remoto - $3400.0" +
                "\t 3. Barbie - $1100.0");
        int type = keyboard.nextInt();
        switch (type) {
            case 1:
                typeToy = "Sonajero";
                this.price = 600.0d;
                break;
            case 2:
                typeToy = "Carro control remoto";
                this.price = 3400.0d;
                break;
            default:
                typeToy = "Barbie";
                this.price = 1100.0d;
                break;
        }
        return price;
    }

    @Override
    public Double calculateDiscount() {
        if (ShoppingCar.quantityToys>3 || ShoppingCar.shoppingInToys>3000){
            super.discount=0.25d;
        } else {super.discount=0d;}
        return  super.discount;
    }



    @Override
    public Double getDiscount() {
        return calculateDiscount();
    }

    @Override
    public void setDiscount(Double discount) {
        super.setDiscount(discount);
    }

    @Override
    public Double getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(Double price) {
        super.setPrice(price);
    }


    @Override
    public String toString() {
        return String.format(
                "Juguetes:  \t * "+ typeToy+ " *"+
                        "\n\tPrecio: $  " + price +
                        "\t\t Descuento: $ " + (discount*price) );

    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Toys that = (Toys) obj;
        return Objects.equals(typeToy, that.typeToy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeToy);
    }
}
