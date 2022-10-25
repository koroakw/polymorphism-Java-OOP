package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date ManufactureDate;


    public UsedProduct() {

    }

    public UsedProduct(Double price, String name, Date manufactureDate) {
        super(price, name);
        ManufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return ManufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        ManufactureDate = manufactureDate;
    }

    @Override
    public String toString() {
        return getName()+ "(used)" + " $ " + getName() + " Manufacture Date: ( " + sdf.format(ManufactureDate)+ " )";//o sdf.format imprime a data formatada na classe principal
    }
}
