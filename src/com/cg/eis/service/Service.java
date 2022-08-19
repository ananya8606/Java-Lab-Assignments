package com.cg.eis.service;
import com.cg.eis.bean.Employee;
interface EmployeeService{
	int getId();
	String getName();
	double getSalary();
	String getDesignation();
	String getInsuranceScheme();
	
}
public class Service implements EmployeeService{
	Employee e=new Employee();
    public Service(int id,String name,double salary,String designation,String insuranceScheme){
		e.id=id;	
		e.name=name;
		e.salary=salary;
		e.designation=designation;
		e.insuranceScheme=insuranceScheme;
	}
	  void setId(int id){
	   e.id=id;	
	    		}
	    void setName(String name) {
	    	e.name=name;
	    		}
	    void setSalary(double salary) {
	    	e.salary=salary;
	    		}
	   void setDesignation(String designation) {
	    	e.designation=designation;
	    }
	    void setInsuranceScheme(String insuranceScheme) {
	    e.insuranceScheme=insuranceScheme;
	    }
      public int getId(){
    	return e.id;	
    		}
    public String getName() {
    	return e.name;
    		}
    public double getSalary() {
    	return e.salary;
    		}
    public String getDesignation() {
    	return e.designation;
    }
    public String getInsuranceScheme() {
    	return e.insuranceScheme;
    }
    
}