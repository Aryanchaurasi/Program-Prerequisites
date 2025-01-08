import java.util. Scanner;
public class Average
{
	public static void main(String[] args) {
	    
		Scanner sc= new Scanner(System.in);
		double num1  = sc.nextInt();
		double num2 = sc.nextInt();
		double num3 = sc.nextInt();
		double Average=(num1+num2+num3)/3 ;
		System.out.println("The Average is "  + Average);
	}
}