import java.util.*;

 class ATM
{
double balance = 5000;
int pin = 1234;
Scanner sc= new Scanner(System.in);
public void withdraw()
{
System.out.println("Enter PIN :");
int enteredpin = sc.nextInt();

if(enteredpin != pin)
{
System.out.println("Incorrect pin");
return;
}
System.out.println("Enter amount to withdraw:");
int amount = sc.nextInt();

if(amount < 100 || amount >10000)
{
System.out.println("Withdraw amount must be greater than 100 or less than 10000");
}
else if(balance < 50)
{
System.out.println("Insufficient balance cannot withdraw");
}
else if(amount > balance)
{
System.out.println("Not enough balance to  withdraw that amount");
}
else 
{
balance -= amount;
System.out.println("Amount withdraw : " +amount);
System.out.println("Remaining balance: " +balance);
}
sc.nextLine();
System.out.println("Please wait a moment...Transaction in progress");
System.out.println("Do you want a receipt ? (yes/no):");
String receipt = sc.nextLine();
System.out.println("Thanks for visiting");
}

public void deposit()
{
System.out.println("Enter PIN :");
int enteredpin = sc.nextInt();

if(enteredpin != pin)
{
System.out.println("Incorrect pin");
return;
}
System.out.println("Enter amount to withdraw:");
int amount = sc.nextInt();

if(amount < 100 || amount >10000)
{
System.out.println("Deposit amount must be greater than 100 or less than 10000");
}
else 
{
System.out.println("Checking all the amount ....please wait");
balance += amount;
System.out.println("New balance: " +balance);
}
sc.nextLine();
System.out.println("Do you want a receipt ? (yes/no):");
String receipt = sc.nextLine();
System.out.println("Thanks for visiting");
}

public void checkbalance()
{
System.out.println("Enter PIN :");
int enteredpin = sc.nextInt();

if(enteredpin != pin)
{
System.out.println("Incorrect pin");
return;
}
System.out.println("Your current balance is:"+balance);
sc.nextLine();
System.out.println("Do you want a receipt ? (yes/no):");
String receipt = sc.nextLine();
System.out.println("Thanks for visiting");
}
}
public class UserAccount extends ATM
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
UserAccount a = new UserAccount();
System.out.println("Welcome to the ATM: ");
System.out.println("1.Withdraw ");
System.out.println("2.Deposit ");
System.out.println("3.Check Balance ");
System.out.println("4.Exit ");

System.out.println("Enter your choice:");
int choice = sc.nextInt();
switch(choice)
{
case  1: 
a.withdraw();
break;
case 2:
a.deposit();
break;
case 3:
a.checkbalance();
break;
case 4:
System.out.println("Exiting ...Thank you!!");
break;
default:
System.out.println("Invalid choice.Please try again");
}
sc.close();
}
}

