import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> que = new LinkedList<String>();
		
		que.offer("Nyx");
		que.offer("Hell");
		que.offer("Hey");
		
		System.out.println(que);
		System.out.println(que.peek());
		System.out.println(que.poll());
		System.out.println(que);
	}
}
