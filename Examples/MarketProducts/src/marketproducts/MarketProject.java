package marketproducts;

public class MarketProject {

	/**
	 * WARNING!
	 * 
	 * In Product class removed 'return false' lines because of Exception throw.
	 * So, there is no 'return false' in Product class reduceQuantity and increaseQuantity methods,
	 * there is exception throw for handling errors. Its better way for handle.
	 */
	
	/**
	 * Testing script for Store and Product.
	 * 
	 * @param args Its not used in script. (Its can be used for initialize store)
	 */
	public static void main(String[] args) {
		
		try {
			/**
			 * Products array for initialize Store
			 */
			Product[] products = {
					new Product(123, "Bread", 0.75, 15, false),
					new Product(456, "Tomato", 0.5, 20, true),
					new Product(789, "Milk", 2.75, 20, false),
					new Product(135, "Sprite", 1.75, 22, false),
					new Product(246, "Coffee", 3.75, 20, true),
					new Product(579, "Cookies", 4.75, 20, false),
			};
			
			/**
			 * Create example store
			 */
			Store myMarket = new Store("myMarket", products);
			
			/**
			 * Testing for get name of store
			 */
			System.out.println("Store Name: " + myMarket.getName());
			
			/**
			 * Testing for set name of store
			 */
			myMarket.setName("yourMarket");
			System.out.println("Store New Name: " + myMarket.getName());
			
			/**
			 * Shows products in store
			 */
			myMarket.productList();
			
			/**
			 * Sell product in store
			 */
			// Testing non-partial product with whole number
			myMarket.sellProduct(123, 10);
			// Testing non-partial product with not whole number
			try {
				myMarket.sellProduct(123, 2.1);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			// Testing partial product with whole number
			myMarket.sellProduct(456, 10);
			// Testing partial product with not whole number
			myMarket.sellProduct(456, 1.1);
			
			/**
			 * Add quantity to product
			 */
			// Testing non-partial product with whole number
			myMarket.addQuantity(123, 10);
			// Testing non-partial product with not whole number
			try {
				myMarket.addQuantity(123, 2.1);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			// Testing partial product with whole number
			myMarket.addQuantity(456, 10);
			// Testing partial product with not whole number
			myMarket.addQuantity(456, 1.1);
			
			/**
			 * Discount for price
			 */
			myMarket.discount(123, 0.50);
			
			/**
			 * Testing get products in store
			 */
			for(Product product : myMarket.getProducts())
				System.out.println("("+product.getID()+") "+product.getName());
			
			/**
			 * Shows total products in store
			 */
			System.out.println("Total Product: " + myMarket.totalProducts());
			
			/**
			 * Add new product to the store
			 */
			myMarket.addProduct(new Product(555, "Product", 10.0, 55.1, true));
			
			/**
			 * New total product in store
			 */
			System.out.println("Total Product: " + myMarket.totalProducts());
			
			/**
			 * Shows result of testing
			 */
			myMarket.productList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
