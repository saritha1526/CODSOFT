//Task-2,Student Grade Calculator ,calculates your grade on the Avg of all 3 subjects based on the marks you  have entered.

import java.util.*;
class StudentGrade
{
public static void main(String args[])
{
int Maths,Physics,Chemistry;// any 3 subjects
Scanner sc= new Scanner(System.in);
System.out.println("Enter the marks obtained in each subject");
System.out.println("Enter marks obtained in Maths:");
Maths = sc.nextInt();
System.out.println("Enter marks obtained in Physics:");
Physics = sc.nextInt();
System.out.println("Enter marks obtained in Chemistry:");
Chemistry = sc.nextInt();
int Total,Avg;
Total = Maths + Physics + Chemistry;
System.out.println("total marks in Maths,Physics,Chemistry is :"+Total);
Avg = Total /3;
System.out.println("Average of all subjects is:"+Avg);
if(Avg > 90)
{
System.out.println("Congrats!!!,You have passed in O grade");
}
else if(Avg > 80 && Avg < 90)
{
System.out.println("Congrats!!!,You have passed in A grade");
}
else if(Avg > 60 && Avg <80)
{
System.out.println("Congrats!!!,You have passed in B grade");
}
else if(Avg > 50 && Avg < 60)
{
System.out.println("Congrats!!!,You have passed in C grade");
}
else 
{
System.out.println("Sorry,you have failed the test,received an F grade");
}
}
}
