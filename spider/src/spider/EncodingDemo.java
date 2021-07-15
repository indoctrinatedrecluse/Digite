package spider;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class EncodingDemo {
	public static void main(String[] args) {
		String password = "Password";
		System.out.println("Original password: "+password);
		
		Encoder encoder = Base64.getEncoder();
		byte[] bytes = encoder.encode(password.getBytes());
		System.out.println("Encoded password: "+new String(bytes));
		
		Decoder decoder = Base64.getDecoder();
		byte[] debytes = decoder.decode(bytes);
		System.out.println("Decoded password: "+new String(debytes));
	}
}
