package dao;
import java.util.ArrayList;
import dto.Product;

public class ProductRepository{
    private ArrayList<Product> listOfProducts = new ArrayList<Product>();
    
    public ProductRepository(){
        Product phone = new Product("P1234", "새우깡", 1500 );
    	phone.setDescription("새우깡");
    	phone.setCategory("Snack");
        phone.setManufacturer("오리온");
        phone.setUnitsInStock(1000);
        phone.setCondition("New");
    
		Product snack = new Product("P1234", "새우깡", 1500 );
    	phone.setDescription("새우깡");
    	phone.setCategory("Snack");
        phone.setManufacturer("오리온");
        phone.setUnitsInStock(1000);
        phone.setCondition("New");
    }    
    
    
    
    
    public ArrayList<Product> getAllProducts(){
        return listOfProducts;
    }
    
    	public Product getProductById(String productId) {
		Product productById = null;

		for (int i = 0; i < listOfProducts.size(); i++) {
			Product product = listOfProducts.get(i);
			if (product != null && product.getProductId() != null && product.getProductId().equals(productId)) {
				productById = product;
				break;
			}
		}
		return productById;
	}
}