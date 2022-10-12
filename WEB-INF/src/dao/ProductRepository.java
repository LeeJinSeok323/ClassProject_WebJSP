package dao;
import java.util.ArrayList;
import dto.Product;

public class ProductRepository{
    private ArrayList<Product> listOfProducts = new ArrayList<Product>();
	private static ProductRepository instance = new ProductRepository();

    public static ProductRepository getInstance(){
		return instance;
    }

    public ProductRepository(){
        Product ggobukchip = new Product("P1234", "꼬북칩", 1500 );
    	ggobukchip.setDescription("꼬북칩");
    	ggobukchip.setCategory("Snack");
        ggobukchip.setManufacturer("오리온");
        ggobukchip.setUnitsInStock(1000);
        ggobukchip.setCondition("New");
    	ggobukchip.setFilename("P1234.jpg");
        
		Product ohgamja = new Product("P1235", "오감자", 1500 );
    	ohgamja.setDescription("오감자");
    	ohgamja.setCategory("Snack");
        ohgamja.setManufacturer("오리온");
        ohgamja.setUnitsInStock(2000);
        ohgamja.setCondition("New");
    	ohgamja.setFilename("P1235.jpg");

		Product sunchip = new Product("P1236", "썬칩", 1500 );
    	sunchip.setDescription("썬칩");
    	sunchip.setCategory("Snack");
        sunchip.setManufacturer("오리온");
        sunchip.setUnitsInStock(3000);
        sunchip.setCondition("New");
    	sunchip.setFilename("P1236.jpg");

        
		listOfProducts.add(ggobukchip);
		listOfProducts.add(ohgamja);
		listOfProducts.add(sunchip);
		// listOfProducts.add(상품명);

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


	public void addProduct(Product product) {
		listOfProducts.add(product);
	}

}