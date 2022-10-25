package entities;

public class ImportedProduct extends Product {
    private Double customsfee;


    public ImportedProduct() {
    super();
    }

    public ImportedProduct(Double price, String name, Double customsfee) {
        super(price, name);
        this.customsfee = customsfee;
    }
    public double Totalprice(){
        return super.getPrice() + customsfee;
    }
    public String toString() {
        return getName() + " $ " + Totalprice() + " (Customs fee: $ " + customsfee + ")";
    }
}
