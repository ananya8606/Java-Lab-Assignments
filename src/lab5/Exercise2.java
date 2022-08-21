package lab5;
import java.util.*;
public class Exercise2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String f=sc.nextLine();
	String l=sc.nextLine();
	try {
	if(f=="" && l=="")
		throw new UserDefinedException("Not valid");
	}
	catch(UserDefinedException e) {
		e.printStackTrace();
	}
		if(f!="" || l!="")
	System.out.println("User is valid");
		sc.close();
}
}
class UserDefinedException extends Exception{

	UserDefinedException(String message){
		super(message);
	}
}

