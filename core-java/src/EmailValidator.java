
public class EmailValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email = "mirrrtra@xyrrz.rrrcom";
		int len = email.length(), ind_at = email.indexOf("@"), ind_dot = email.indexOf(".");
		if (len-email.replace("@", "").length()==1 && len-email.replace(".", "").length()==1 && ind_at>3 && email.substring(ind_at,ind_dot).length()>=3 && email.length()-ind_dot>3)
			System.out.println("Valid");
		else
			System.out.println("Invalid");
	}

}
