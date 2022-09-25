package classesWithAttribute;

public class Main {

	public static void main(String[] args) {
		Product product= new Product();
		product.name= "Laptop";
		product.id=1;
		product.description= "Asus Laptop";
		product.price=5000;
		product.stockAmount=3; 
		
		/* product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);
		
		System.out.println(product.getName());
		System.out.println(product.getId());
		System.out.println(product.getDescription());
		System.out.println(product.getPrice());
		System.out.println(product.getStockAmount()); */
		
		ProductManager productManager = new ProductManager ();
		
		productManager.Add(product);

	}

}
