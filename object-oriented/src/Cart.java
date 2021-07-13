
public class Cart {
	private final int MAX_PRODUCTS = 10;
	private Product products[];
	private int index = 0;
	private int quantity[];
	
	public Cart() {
		// TODO Auto-generated constructor stub
		this.products = new Product[MAX_PRODUCTS];
		this.quantity = new int[MAX_PRODUCTS];
	}
	
	public void addItem(Product P, int quantity) throws ShoppingException {
		if (quantity == 0) {
			throw new ShoppingException("Quantity is zero, "+P.getName()+" not ordered!");
		}
		else if (quantity <= P.getStock() && P.getStock()>=0) {
			int count = 0;
			for (Product Pr: this.products) {
				if (Pr != null && Pr.getName().equals(P.getName())) {
					this.quantity[count] += quantity;
					P.setStock(P.getStock()-quantity);
					System.out.println(P.getName()+" (x"+quantity+") successfully added to cart!");
					return;
				}
				count++;
			}
			this.products[index%10] = P;
			this.quantity[index++%10] = quantity;
			System.out.println(P.getName()+" (x"+quantity+") successfully added to cart!");
			P.setStock(P.getStock()-quantity);
		}
		else if (P.getStock() == 0)
			throw new ShoppingException(P.getName()+" out of stock!");
		else
			throw new ShoppingException(P.getName()+" has only "+P.getStock()+" items in stock!");
	}
	
	public void removeItem (Product P) throws ShoppingException {
		int count = 0;
		for (Product Pr: this.products) {
			if (Pr != null && Pr.getName().equals(P.getName())) {
				this.products[count] = null;
				System.out.println(P.getName()+" (x"+this.quantity[count]+") sucessfully removed from cart!");
				this.quantity[count] = 0;
				return;
			}
			count++;
		}
		throw new ShoppingException(P.getName()+" not found in cart!");
	}
	
	public void showCart() {
		int count = 0;
		for (Product Pr: this.products) {
			if (Pr != null)
				count++;
		}
		if (count == 0)
			System.out.println("Cart is empty!");
		else {
			double total_price = 0.0;
			for (int i=0;i<quantity.length;i++) {
				if (this.products[i] != null) {
					System.out.print("Product: "+this.products[i].getName());
					System.out.print(", Price per unit: "+this.products[i].getPrice());
					System.out.println(", Quantity: "+this.quantity[i]+"\n");
					total_price += this.products[i].getPrice()*this.quantity[i];
				}
			}
			System.out.println("\nCart total: "+total_price);
		}
	}
	
	public void order() throws ShoppingException {
		int count = 0;
		for (Product Pr: this.products) {
			if (Pr != null)
				count++;
		}
		if (count == 0)
			throw new ShoppingException("Cart is empty!");
		else {
			this.products = new Product[MAX_PRODUCTS];
			this.quantity = new int[MAX_PRODUCTS];
			System.out.println("Cart ordered successfully!");
		}
	}
}
