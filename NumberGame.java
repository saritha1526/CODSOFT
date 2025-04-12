//Task-1,Number Game with 3 rounds
import java.util.*;

class NumberGame
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in); 
int random =  (int)(Math.random()*100)+1; //generate a random number
int guess;
int nooftries=0;

System.out.println("Welcome to number world where you can see all the numbers and alphabets");
System.out.println("Game Rules:1 st and 2nd round are almost same ,In round-1 you will have 5 trails to guess the correct number,in round-2 there will be only 3 trails to guess the number,round-3 contains basic math problem");
System.out.println("Round-1");
for(int i=0;i<=4;i++)
{
System.out.println("Enter your guess");
guess = sc.nextInt();
nooftries++;
if(guess < random)
{
System.out.println("Too low , Try again");
}
else if(guess > random)
{
System.out.println("Too high,Try again");
}
else 
{
System.out.println("Congrats!!!!!,you are selected .. Round 1 selected,R-1 score = 3");
break;
}
}
System.out.println("no of tries = "+nooftries);
System.out.println("Random Integer in Round 1 (1-100):"+random);

//round2
System.out.println("Round 2");
int g1,n1=0;
random = random+5;
for(int s=0;s<=2;s++)
{
System.out.println("Enter your guess:");
g1=sc.nextInt();
n1++;

if(g1 < random)
{
System.out.println("Too low , Try again");
}
else if(g1 > random)
{
System.out.println("Too high,Try again");
}
else 
{
System.out.println("Congrats!!!!!,you are selected .. Round 2 selected,R-2 score = 5");
break;
}
}
System.out.println("no of tries = "+n1);
System.out.println("Random Integer  (1-100):"+random);


//round3 
System.out.println("");
System.out.println("Round 3..Basic maths");
System.out.println("Note: In this round you need to solve the basic math problem,You can have only 1 trail");
int c,x,y,m;
System.out.println("c * 5 = 30");//basic maths
System.out.println("x + 20 = 36");
System.out.println("y /12 = 2");
System.out.println("m - 5 = 5");
System.out.println("Fill the blank with the correct answer: find c,x,y,m");
c= sc.nextInt();
x= sc.nextInt();
y= sc.nextInt();
m= sc.nextInt();
if(c==6 && x == 16 && y == 24 && m == 10)
{
System.out.println("Congrats!!,You made it,Round 3 Winner,R-3 score = 10");
}
else 
{
System.out.println("Sorry, you didn't pass round 3 ,try again");
}
}
}









