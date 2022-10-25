package programs;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.*;

public class Venda {
    public static void main (String args[])  throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        List <Product> list = new ArrayList<>();
        System.out.print("Enter number of the products: ");
        int n = sc.nextInt();
        for (int i=1; i<=n; i++){
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported? (c,u,i) ");
            char resp = sc.next().charAt(0);
            if (resp == 'c'){
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                list.add(new Product(price, name));

            }else if(resp=='i'){
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                System.out.print("Customs fee: ");
                double customsfee = sc.nextDouble();
                list.add(new ImportedProduct(price, name, customsfee));

            }else if(resp=='u'){
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                System.out.print("Manufacturated date: (DD/MM/YYYY) ");
                Date data = sdf.parse(sc.next());

                list.add(new UsedProduct(price, name, data));

            }


            }
        System.out.println();
        System.out.println();
            for (Product prod : list) {
                System.out.println(prod);
        }



    }
}
