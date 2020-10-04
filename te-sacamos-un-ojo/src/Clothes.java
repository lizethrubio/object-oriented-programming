import java.util.Objects;
import java.util.Scanner;

public class Clothes extends Product{

    String typeClothes;
    public Clothes(){}
    Scanner keyboard = new Scanner (System.in);

    @Override
    public Double calculatePrice() {
        System.out.println("\n Que item de ropa desea" +
                "\t 1. Vestido de Mujer  - $36.0" +
                "\t 2. Enterizo de nino- $24.0" +
                "\t 3. Camisa de Hombre - $35.0");
        int type = keyboard.nextInt();
        switch (type) {
            case 1:
                typeClothes = "Vestido de Mujer";
                this.price = 36d;
                discount =0.15;
                break;
            case 2:
                typeClothes = "Enterizo de nino-";
                this.price = 24.0d;
                discount =0.15;
                break;
            default:
                typeClothes = "Camisa de Hombre";
                this.price = 35.0d;
                discount =0.0d;
                break;
        }
        return price;
    }

    @Override
    public Double calculateDiscount() {
        return this.discount;
    }

    @Override
    public Double getDiscount() {
        return super.getDiscount();
    }

    @Override
    public Double getPrice() {
        return super.getPrice();
    }

    public String getTypeClothes() {
        return typeClothes;
    }

    @Override
    public String toString() {
        return String.format(
                "Ropa: \t * " + typeClothes + " *"+
                " \n\t Precio: $ " + price +
                "\t\t Descuento: $ " + (discount*price) );
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Clothes that = (Clothes) obj;
        return Objects.equals(typeClothes, that.typeClothes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeClothes);
    }
}
