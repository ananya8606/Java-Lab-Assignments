package com.cg.eis.pl;
import java.util.Scanner;
import com.cg.eis.service.Service;
public class Output {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
int id=sc.nextInt();
String name=sc.next();
double salary=sc.nextDouble();
String designation=sc.next();
String insuranceScheme=sc.next();
Service s=new Service(id,name,salary,designation,insuranceScheme);
System.out.println(s.getId());
System.out.println(s.getName());
System.out.println(s.getSalary());
System.out.println(s.getDesignation());
System.out.println(s.getInsuranceScheme());
sc.close();
}
}
