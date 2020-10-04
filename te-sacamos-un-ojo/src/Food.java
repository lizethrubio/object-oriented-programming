import com.sun.codemodel.internal.JCase;
import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.Objects;
import java.util.Scanner;
import java.util.function.ToDoubleFunction;

public class Food extends Product {
    Scanner keyboard = new Scanner (System.in);



    Integer day;
    public Food() {
    }
    
    String typeFood;

    public Food(Integer day) {
        this.day= day;
    }




    @Override
    public Double calculatePrice() {
        System.out.println("\n Que alimento desea:" +
                "\t 1. Tofu  - $6.0" +
                "\t 2. Seitan - $4.0" +
                "\t 3. Soya texturizada - $2.0");
        int type = keyboard.nextInt();
        switch (type) {
            case 1:
                typeFood = "Tofu";
                this.price = 6.0d;
                break;
            case 2:
                typeFood = "Seitan";
                this.price = 4.0d;
                break;
            default:
                typeFood = "Soya Texturizada";
                this.price = 2.0d;
                break;
        }
        return price;
    }

    @Override
    public Double calculateDiscount() {
        if (ShoppingCar.discountDay){
            this.discount= 0.1d;
        } else this.discount = 0d;
//        System.out.println("\nConfirme que dia de la semana es hoy:" +
//                "\t 1. Domingo" +
//                "\t 2. Lunes" +
//                "\t 3. Martes" +
//                "\t 4. Miercoles" +
//                "\t 5. Jueves"+
//                "\t 6. Viernes" +
//                "\t 7. Sabado"
//        );
//        this.day  = keyboard.nextInt();
//        switch (day) {
//            case 3:
//            case 5:
//                this.discount= 0.1d;
//                break;
//            default:
//                this.discount = 0.00d;
//                break;
//        }
        return discount;
    }

    @Override
    public Double getDiscount() {
        return super.getDiscount();
    }

    @Override
    public void setDiscount(Double discount) {
        super.setDiscount(discount);
    }

    @Override
    public Double getPrice() {
        return super.getPrice();
    }

    public String getTypeFood() {
        return typeFood;
    }

    public void setTypeFood(String typeFood) {
        this.typeFood = typeFood;
    }

    @Override
    public String toString() {
        return String.format(
                "Comida: \t  * "+ typeFood + " *"+
                        "\n\tPrecio: $  " + price +
                        "\t\t Descuento: $ " + (discount*price) );
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Food that = (Food) obj;
        return Objects.equals(day, that.day) &&
                Objects.equals(typeFood, that.typeFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), day, typeFood);
    }
}
