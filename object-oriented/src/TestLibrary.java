import com.digite.lib.Book;
import com.digite.lib.LibraryException;
import com.digite.lib.Member;

public class TestLibrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m = new Member("Nyx");
		Book b = new Book("La La Land");
		
		try {
			b.issueBook(m);
		} catch (LibraryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		b.status();
		m.status();
		try {
			b.returnBook(m);
		} catch (LibraryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		b.status();
		m.status();
		
		Book b1 = new Book("X Files");
		Member m1 = new Member("Alice");
		
		/*b.issueBook(m);
		b.status();
		b1.issueBook(m);
		b1.status();
		b.issueBook(m1);
		b1.issueBook(m1);
		b1.status();
		b1.returnBook(m1);
		b1.returnBook(m);
		b1.status();
		b.returnBook(m1);
		b1.returnBook(m1);*/
		try {
			b.issueBook(m1);
		} catch (LibraryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			b1.issueBook(m);
		} catch (LibraryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			b.returnBook(m);
		} catch (LibraryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			b1.returnBook(m1);
		} catch (LibraryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
