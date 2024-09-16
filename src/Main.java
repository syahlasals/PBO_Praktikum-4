import com.polban.jtk.sales.Product;
import com.polban.jtk.sales.Sales;

public class Main {
    
    public static void main(String[] args){
        Product product = new Product("Laptop", 25000000, 10);
        Sales sales = new Sales(product);
        
        sales.sellProduct(3);
        sales.restockProduct(7);
        sales.updateProductPrice(30000000);
        sales.updateProductPrice(-5000000);
    
    }
}