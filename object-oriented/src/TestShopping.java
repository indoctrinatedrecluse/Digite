
public class TestShopping {
	public static void main(String[] args) {
		Product Pen = new Product("Pen", 150, 15);
		//Product Medicine = new Product("Medicine", 500, 10);
		//Product Balloon = new Product("Balloon", 3, 20);
		
		Cart C1 = new Cart();
		
		/*C1.addItem(Pen, 2);
		System.out.println("Pen Stock: "+Pen.getStock());
		C1.addItem(Medicine, 1);
		C1.addItem(Balloon, 3);
		C1.showCart();
		C1.order();
		C1.showCart();*/
		
		try {
			C1.addItem(Pen, 10);
			C1.addItem(Pen, 3);
			C1.addItem(Pen, 1);
			System.out.println("Pen Stock: "+Pen.getStock());
			C1.showCart();
			
			Pen.setStock(10);
			//C1.addItem(Pen, 0);
			C1.removeItem(Pen);
			C1.showCart();
			C1.order();
		} catch (ShoppingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
