package lab5;
import java.util.*;
public class Exercise1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int age=sc.nextInt();
	try {
	if(age<=15)
		throw new UserException("Not valid");
	}
	catch(UserException e) {
		e.printStackTrace();
	}
		if(age>15)
	System.out.println("Age is valid");
		sc.close();
}
}
class UserException extends Exception{

	UserException(String message){
		super(message);
	}
}
