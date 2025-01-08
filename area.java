import java.util. Scanner;
public class area
{
	public static void main(String[] args) {
	    
		Scanner sc= new Scanner(System.in);
		double radius = sc.nextDouble();
		double Area = 3.14 * Math.pow(radius,2);
		System.out.println("The Area is  "+ Area);
	}
}