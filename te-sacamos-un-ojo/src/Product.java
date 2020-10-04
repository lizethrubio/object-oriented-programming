import java.util.Objects;

public abstract class Product {

    public Double price;
    public Double discount;
    public boolean TDC = false;
    boolean desToy;

    public Product() {
    }

    public abstract Double calculatePrice();

    public abstract Double calculateDiscount();

    public void  des (int quantity, double amount){
        if (quantity>3 || amount>3000){ desToy = true;}
    }

    public Double getDiscount() {
        return calculateDiscount();
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setTDC(boolean TDC) {
        this.TDC = TDC;
    }

    public Boolean getTDC() {
        return TDC;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product that = (Product) obj;
        return Objects.equals(price, that.price) &&
                Objects.equals(discount, that.discount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, discount);
    }

    @Override
    public String toString() {
        return String.format("Product{" +
                "price=" + price +
                ", discount=" + discount +
                "}");
    }








}
