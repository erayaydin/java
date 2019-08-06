package marketproducts;

import java.util.Arrays;

public class Store {
	public String name;
	public Product[] products;
	
	/**
	 * Constructor of Store
	 * 
	 * @param name     Store's name
	 * @param products Initial product list of the store
	 */
	public Store(String name, Product[] products) {
		this.name = name;
		this.products = products;
	}
	
	/**
	 * Return of store's name.
	 * 
	 * @return name
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Changes store's name.
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Shows current product list of store.
	 */
	public void productList() {
		System.out.println("ID\t\tName\t\tQty\t\tPrice");
		for(Product product : this.products) {
			System.out.println(product.getID()+"\t\t"+product.getName()+"\t\t"+product.getQuantity()+"\t\t"+product.getPrice());
		}
	}
	
	/**
	 * Sell product in store and shows total pay.
	 * 
	 * @param productID Which product will be sell
	 * @param amount    Amount of product
	 * @return Total amount should be payed.
	 * @throws Exception Amount check on Product class
	 */
	public double sellProduct(int productID, double amount) throws Exception {
		Product product = findProduct(productID);
		
		product.reduceQuantity(amount);
		System.out.println(product.getName()+": "+amount+" sold at "+product.getPrice());
		return product.getPrice()*amount;
	}
	
	/**
	 * Add quantity to product in store.
	 * 
	 * @param productID Product's ID will be searched
	 * @param amount Adding amount to the product
	 * @return Result of adding quantity
	 * @throws Exception Amount check on Product class and check Product exists in Store
	 */
	public boolean addQuantity(int productID, double amount) throws Exception {
		Product product = findProduct(productID);
		
		product.increaseQuantity(amount);
		System.out.println(product.getName()+": "+amount+" added");
		return true;
	}
	
	/**
	 * Discount price on product in store
	 * 
	 * @param productID Product's ID will be discounted
	 * @param percentage Percentage of product (Should be double, %25 = 0.25)
	 * @throws Exception Amount check on Product class and check Product exists in Store
	 */
	public void discount(int productID, double percentage) throws Exception {
		Product product = findProduct(productID);
		
		product.setPrice(product.getPrice() * (1-percentage));
		System.out.println(product.getName()+"'s new price: " + product.getPrice());
	}
	
	/**
	 * Helper function to find product in store.
	 * 
	 * @param productID Product's ID will be searched
	 * @return Product in store
	 * @throws Exception Product doesn't exists in store
	 */
	private Product findProduct(int productID) throws Exception {
		Product selected = null;
		for(Product product : this.products)
			if(product.getID() == productID)
				selected = product;
		if(selected == null)
			throw new Exception("Product can not found in store.");
		return selected;
	}
	
	/**
	 * Returns all products in store
	 * 
	 * @return Array of products
	 */
	public Product[] getProducts() {
		return this.products;
	}
	
	/**
	 * Total products number in store
	 * 
	 * @return
	 */
	public int totalProducts() {
		return this.products.length;
	}
	
	/**
	 * Add new product to the store.
	 * @param newProduct Product will be added to store
	 * @throws Exception Checking product id is exists in store
	 */
	public void addProduct(Product newProduct) throws Exception {
		for(Product product : this.products)
			if(product.getID() == newProduct.getID())
				throw new Exception("Product already exists in Store");
		
		Product[] newProducts = Arrays.copyOf(this.products, this.products.length + 1);
		newProducts[this.products.length] = newProduct;
		this.products = newProducts;
	}
}
