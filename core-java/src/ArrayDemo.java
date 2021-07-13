
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {10, 20, 30, 40, 50};
		int[][] jag = {{1,2},{3,4,5},{6,7,8,9}};
		for (int[] i:jag) {
			for (int j:i)
				System.out.print(j+"\t");
			System.out.println();
		}
	}

}
