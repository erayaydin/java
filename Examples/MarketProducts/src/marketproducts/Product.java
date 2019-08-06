package marketproducts;

public class Product {
	private int productID;
	private String name;
	private double price;
	private double quantity;
	private boolean isPartial;
	
	/**
	 * Constructor of Product
	 * 
	 * @param id         ID of created product
	 * @param name       The name of product
	 * @param price      Price of product (amountly)
	 * @param quantity   Initial Quantity of product.
	 * @param isPartial  Product is partitial or not.
	 * @throws Exception Checking quantity whole if product isn't partitial.
	 */
	public Product(int id, String name, double price, double quantity, boolean isPartial) throws Exception {
		this.productID = id;
		this.name = name;
		this.price = price;
		
		// Checking is whole quantity
		if(!isPartial && !isWhole(quantity))
			throw new Exception("Product's quantity should be whole number.");
		
		this.quantity = quantity;
		this.isPartial = isPartial;
	}
	
	/**
	 * Return product's ID
	 * 
	 * @return productID
	 */
	public int getID()
	{
		return this.productID;
	}
	
	/**
	 * Changes product's current ID
	 * 
	 * @param id Product's new ID
	 */
	public void setID(int id)
	{
		this.productID = id;
	}
	
	/**
	 * Return product's name
	 * 
	 * @return name
	 */
	public String getName()
	{
		return this.name;
	}
	
	/**
	 * Change product's name
	 * 
	 * @param name Product's new name
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * Returns product's current price
	 * 
	 * @return price
	 */
	public double getPrice()
	{
		return this.price;
	}
	
	/**
	 * Changes product's price
	 * 
	 * @param price Product's new price
	 * @throws Exception Checking price if positive.
	 */
	public void setPrice(double price) throws Exception
	{
		if(price > 0){
			this.price = price;
		} else {
			throw new Exception("Price number can only be positive.");
		}
	}
	
	/**
	 * Returns product's current quantity
	 * 
	 * @return quantity
	 */
	public double getQuantity()
	{
		return this.quantity;
	}
	
	/**
	 * Reducing product's current quantity.
	 * 
	 * @param amount Reduce amount
	 * @return Result of reducing. If everything okay, then true
	 * @throws Exception Checking for amount is positive, fit to product and whole(if not partial)
	 */
	public boolean reduceQuantity(double amount) throws Exception
	{
		if(amount > 0) {
			if(amount <= this.quantity) {
				if(!this.isPartial && !isWhole(amount))
					throw new Exception("Amount of reduce shouldn't be partial.");
				this.quantity -= amount;
				return true;
			} else {
				throw new Exception("Amount of reduce should be less or equal to quantity of product");
				// Because of exception throw, there is no need for returning boolean
				//return false;
			}
		} else {
			throw new Exception("Amount of reduce should be positive.");
			// Because of exception throw, there is no need for returning boolean
			//return false;
		}
	}
	
	/**
	 * Increase product's current quantity.
	 * 
	 * @param amount Amount of increase
	 * @return Result of increasing. 
	 * @throws Exception Checking amount
	 */
	public boolean increaseQuantity(double amount) throws Exception
	{
		if(amount > 0) {
			if(!this.isPartial && !isWhole(amount))
				throw new Exception("Amount of increase shouldn't be partial.");
				// Because of exception throw, there is no need for returning boolean
				//return false;
			this.quantity += amount;
			return true;
		} else {
			throw new Exception("Amount of increase should be positive.");
			// Because of exception throw, there is no need for returning boolean
			//return false;
		}
	}
	
	/**
	 * Change product's current quantity
	 * 
	 * @param amount New quantity of product
	 * @throws Exception Checking amount for positive and whole(if not partial)
	 */
	public void setQuantity(double amount) throws Exception {
		if(amount >= 0) {
			if(!this.isPartial && !isWhole(amount))
				throw new Exception("Amount of increase shouldn't be partial.");
			this.quantity = amount;
		} else {
			throw new Exception("Amount of product shouldn't be negative.");
		}
	}
	
	/**
	 * Toggle partial status of product. If its partial then new status is not partial, vice versa.
	 * @return New partial status of product
	 * @throws Exception Checking product's status for toggling partial status.
	 */
	public boolean togglePartitial() throws Exception {
		if(!this.isPartial && !isWhole(this.quantity))
			throw new Exception("Product's partitial status can not be changed. Quantity should be whole number.");
		this.isPartial = !this.isPartial;
		return this.isPartial;
	}
	
	/**
	 * Set partial status of product.
	 * 
	 * @param partial New partial status of product
	 * @throws Exception Checking product's status for toggling partial status.
	 */
	public void setPartial(boolean partial) throws Exception {
		if(!partial && !isWhole(this.quantity))
			throw new Exception("Product's partitial status can not be changed. Quantity should be whole number.");
		this.isPartial = partial;
	}
	
	/**
	 * Checking number is whole.
	 * 
	 * @param number Which number will check for whole
	 * @return If number is whole then true, if not return false
	 */
	private boolean isWhole(double number) {
		return number == Math.ceil(number);
	}
}
