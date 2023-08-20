import java.util.Scanner;  
public class SumOfNumbers5  
{  
public static void main(String args[])  
{  
int x, y, z, sum;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the first number: ");  
x = sc.nextInt();  
System.out.print("Enter the second number: ");  
y = sc.nextInt();  
System.out.print("Enter the third number: ");  
z = sc.nextInt();  
sum = sum(x, y, z);  
System.out.println("The sum of three numbers x, y, and z is: " + sum);  
}  
public static int sum(int a, int b, int c)  
{  
int sum = a + b + c;  
return sum;  
}  
}  