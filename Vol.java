import java.util. Scanner;
public class Vol
{
	public static void main(String[] args) {
	    
		Scanner sc= new Scanner(System.in);
		double radius = sc.nextDouble();
		double hieght = sc.nextDouble();
		double Vol = 3.14 * Math.pow(radius,2) * hieght;
		System.out.println("The Volume is  "+ Vol);
	}
}