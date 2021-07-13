
public class GenericChild<Z, Y> extends GenericDemo<Z> {
	private Y data;
	
	public GenericChild(Z data, Y data1) {
		super(data);
		this.data = data1;
		// TODO Auto-generated constructor stub
	}

	public Z getData() {
		return (Z)(this.data+" , "+super.getData());
	}

	public void setData(Z data, Y data1) {
		this.data = data1;
		super.setData(data);
	}
	
	public static void main(String[] args) {
		GenericChild<String, String> d1 = new GenericChild<String, String>("Hello","Hi");
		d1.setData("Hey","Hola");
		System.out.println(d1.getData());
		
		GenericChild<Integer, Integer> d2 = new GenericChild<Integer, Integer>(100,200);
		System.out.println(d2.getData());
		
		GenericChild d3 = new GenericChild("Bonjour",200);
		d3.setData(1000,"Yahoo");
		System.out.println(d3.getData());
	}
}
