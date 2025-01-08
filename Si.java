import java.util. Scanner;
public class Si
{
	public static void main(String[] args) {
	    
		Scanner sc= new Scanner(System.in);
		double Principal  = sc.nextDouble();
		double Rate  = sc.nextDouble();
		double Time  = sc.nextDouble();
		double si=(Principal * Rate * Time) / 100 ;
		System.out.println("The Simple interest is   "+ si);
	}
}