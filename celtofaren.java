import java.util.Scanner;
public class celtofaren
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Celsius value");

		double Celsius=sc.nextDouble();
		Double Fahrenheit = (Celsius * 9/5) + 32;
		System.out.println("The converted Vallue of Celsius is = " + Fahrenheit );
	}
}