					//project -> banking application

package projects;
import java.util.*;

class Bank{
	int balance;
	int previousTransation;
	String name;
	int id;
	public Bank(String cname, int cid) {
		name = cname;
		id = cid;
	}
	void deposite(int amount)
	{if(amount !=0)
		balance=balance+amount;
		previousTransation=amount;
	}
	
	void witdraw(int amount)
	{	if(amount<=balance)
			{balance=balance-amount;
		     previousTransation=-amount;
			}
		else
			{
				System.out.println("not sufficient balance in your account");
			}	
	}
	
	void getPreviousTransation(){
		if(previousTransation>0)
		{
			System.out.println("deposite:"+previousTransation);
		}
		else if (previousTransation<0) 
		{
			System.out.println("witdraw:"+Math.abs(previousTransation));
		}
		else
		{
			System.out.println("No transation occured");
		}
	}
	
	void show()
	{
		Scanner obj1=new Scanner(System.in);
		int n=0;
		System.out.println("***********************************************");
		System.out.println("\t\t\tWelcome");
		System.out.println("***********************************************");
		System.out.println();
		System.out.println("name:"+name);
		System.out.println("id:"+id);
		System.out.println();
		
		System.out.println("-----------------------------------------------");
		System.out.println("1.Check balance");
		System.out.println("2.Deposite");
		System.out.println("3.Witdraw");
		System.out.println("4.PreviousTransation");
		System.out.println("5.Exit");
		System.out.println("-----------------------------------------------");

		System.out.println();
		do
		{    
			 System.out.println();
		     System.out.println("Enter option");
			 n=obj1.nextInt();
			 System.out.println();
			 System.out.println("-----------------------------------------------");

			
			 switch(n)
			 {
			 	case 1:
			 		System.out.println();
			 		System.out.println("your balance:"+balance);
			 		System.out.println();
			 		System.out.println("-----------------------------------------------");
			 		break;
			 		
			 	case 2:
			 		System.out.println();
			 		System.out.println("enter an amount to deposite");
			 		int amount=obj1.nextInt();
			 		deposite(amount);
			 		System.out.println();
			 		System.out.println("-----------------------------------------------");
			 		break;
			 		
			 	case 3:
			 		System.out.println();
			 		System.out.println("enter amount to witdraw");
			 		int amount2=obj1.nextInt();
			 		witdraw(amount2);
			 		System.out.println();
			 		System.out.println("-----------------------------------------------");
			 		break;
			 		
			 	case 4:
			 		System.out.println();
			 		getPreviousTransation();
			 		System.out.println();
			 		System.out.println("-----------------------------------------------");
			 		break;
			 		
			 	case 5:
			 		System.out.println();
			 		System.out.println("***********************************************");
			 		System.out.println("\t\tthank you for visited");
			 		System.out.println("***********************************************");
			 		break;
			 		
			 	default:
			 		System.out.println();
			 		System.out.println("you entered wrong option");
			 	    System.out.println();
			 		System.out.println("-----------------------------------------------");

			 	    
			 }
			
		}while(n!=5);
		
		
	}
}

public class BankingApplication {

	public static void main(String[] args) {

		Bank obj=new Bank("akash",1019);
		obj.show();
	}

}
