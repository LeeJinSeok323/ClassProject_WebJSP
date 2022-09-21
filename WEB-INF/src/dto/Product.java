package dto;
import java.io.Serializable;
import java.security.KeyStore.PrivateKeyEntry;

public class Product implements Serializable{
    
    private static final long serialVersionUID = -4274700572038677000L;
    
    private String productId; //상품 아이디
    private String pname;		// 상품이름
    private Integer uniPrice; //상품가격
    private String description; // 상품설명
    private String manufacturer; //제조사
    private String category; //카테고리
    private long unitsInStock; // 재고수
    private String condition; // 신상품 or 중고품 or 재생품
 
    public Product(){
        super();
    }

    public Product(String productId, String pname, Integer uniPrice){
        this.productId = productId;
        this.pname = pname;
        this.uniPrice = uniPrice;
    }
    
    public String getProductId(){
        return productId;
    }
    public void setProductId(String productId){
        this.pname = productId;
    }
    
    public String getPname(){
		return pname;
    }

        
    public void setPname(String pname){
        this.pname = pname;
    }

    
    public Integer getUniPrice(){
        return uniPrice;
    }
    public void setUniPrice(Integer uniPrice){
        this.uniPrice = uniPrice;
    }
    
    public String getDescription(){
        return description;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
    public String getManufacturer(){
        return manufacturer;
    }
    
    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }
    
    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category = category;
    }
    
    public long getUnitsInStock(){
        return unitsInStock;
    }
    public void setUnitsInStock(long unitsInStock){
        this.unitsInStock = unitsInStock;
    }
    
    public String getCondition(){
        return condition; 	
    }
    public void setCondition(String condition){
        this.condition = condition;
    }
    

}