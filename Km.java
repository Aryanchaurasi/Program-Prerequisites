import java.util. Scanner;
public class Km
{
	public static void main(String[] args) 
	{
	    
		Scanner sc= new Scanner(System.in);
		double Kilometers  = sc.nextInt();
		double Miles = Kilometers * 0.621371;
		System.out.println("The Converted value is   "+ Miles);
	}
}
