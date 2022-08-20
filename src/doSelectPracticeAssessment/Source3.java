package doSelectPracticeAssessment;
import java.util.*;
class CompanyJobRepository {
static String getJobPrediction(int age,String highestQualification){
	try{
	if(age<19)
	throw new NotEligibleException("You are underage for any Job");
	else if(age>=19 && (highestQualification!="B.E"||highestQualification!="M.S"||highestQualification!="PhD"))
	throw new NotEligibleException("We do not have any job that matches your qualifications");
	}
	catch(NotEligibleException e){
			e.printStackTrace();
		}
	if(age>=21 && highestQualification=="B.E")
	return "We have openings for junior developer";
	if(age>=26 && (highestQualification=="M.S"||highestQualification=="PhD"))
	return "We have openings for senior developer";
	return "Sorry we have no openings for now";
}
}
public class Source3 {
	String searchForJob(int age,String highestQualification){
		try{
   if(age>=200 || age<=0)
  throw new NotEligibleException("The age entered is not typical foe a human being");}
  catch(NotEligibleException e){
			e.printStackTrace();
		}
		return CompanyJobRepository.getJobPrediction(age,highestQualification);
	}
	public static void main(String args[] )  {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		String highestQualification=sc.nextLine();
		String s=CompanyJobRepository.getJobPrediction(age,highestQualification);
		Source3 d=new Source3();
		String f=d.searchForJob(age,highestQualification);
		System.out.println(s);
		System.out.println(f);
		sc.close();
	}
}
class NotEligibleException extends Exception {
	NotEligibleException(String message){
		super(message);
	}
}