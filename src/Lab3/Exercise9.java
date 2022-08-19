package Lab3;
import java.util.Scanner;
import java.time.Month;
import java.time.LocalDate;
public class Exercise9 {
void getDayMonthYear(String date)
{
LocalDate currentDate=LocalDate.parse(date);
int day=currentDate.getDayOfMonth();
Month month=currentDate.getMonth();
int year=currentDate.getYear();
System.out.println("Day:"+day);
System.out.println("Month:"+month);
System.out.println("Year:"+year);
}
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	String date=sc.nextLine();
	Exercise9 e=new Exercise9();
	e.getDayMonthYear(date);
	sc.close();
}
}
