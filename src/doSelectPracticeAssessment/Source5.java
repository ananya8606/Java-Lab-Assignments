package doSelectPracticeAssessment;
import java.util.*;
import java.util.regex.*;
class TransactionParty {
    String seller;
    String buyer;
    public TransactionParty(String seller,String buyer){
      this.seller=seller;
      this.buyer=buyer;
    }
}

class Receipt{
    TransactionParty transactionParty;
    String productsQR;
    public Receipt(TransactionParty transactionParty,String productsQR){
      this.transactionParty=transactionParty;
      this.productsQR=productsQR;
    }
}


class GenerateReceipt{
    public int verifyParty(Receipt r){
  String pattern="^([a-z]|[A-Z])(([a-z]|[A-Z])|\\s|-|')*([a-z]|[A-Z])$";
  String input=r.transactionParty.buyer;
  String input1=r.transactionParty.seller;
  Pattern p=Pattern.compile(pattern);
  Matcher m=p.matcher(input);
  Matcher m1=p.matcher(input1);
  if(m.matches() && m1.matches())
  return 2;
  else if(m.matches()||m1.matches())
  return 1;
  else
  return 0;
    }
    public String calcGST(Receipt r1){
   String s=r1.productsQR;
   String[] str=new String[3];
   String[] r=new String[6];
   String pattern="^[0-9][0-9]*,[0-9][0-9]*@[0-9][0-9]*,[0-9][0-9]*@[0-9][0-9]*,[0-9][0-9]*$";
    Pattern p=Pattern.compile(pattern);
   Matcher m=p.matcher(s);
   if(m.matches()==false)
   return "";
    int k=0;
    str[0]="";
  for(int i=0;i<s.length();i++){
    if(s.charAt(i)=='@'){
    k++;
    str[k]="";
    continue;
    }
    str[k]=str[k]+s.charAt(i);
  }
  int u=0;
  for(int j=0;j<3;j++)
  {
   r[u]="";
   for(int i=0;i<str[j].length();i++)
   {
     if(str[j].charAt(i)==',')
     {
     u++;
     r[u]="";
     continue;
     }
     r[u]=r[u]+str[j].charAt(i);
   }
   u++;
    }
int GST=(Integer.parseInt(r[0])*Integer.parseInt(r[1])+Integer.parseInt(r[2])*Integer.parseInt(r[3])+Integer.parseInt(r[4])*Integer.parseInt(r[5]))*12/100;
 return Integer.toString(GST);
    }
}
class Source5{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String buyer=sc.nextLine();
    String seller=sc.nextLine();
    String productsQR=sc.nextLine();
    TransactionParty t=new TransactionParty(buyer,seller);
    Receipt r=new Receipt(t,productsQR);
    GenerateReceipt g=new GenerateReceipt();
    int f=g.verifyParty(r);
    String s=g.calcGST(r);
    System.out.println(f);
    System.out.println(s);
    sc.close();
  }
}