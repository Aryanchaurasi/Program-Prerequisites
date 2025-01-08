import java.util. Scanner;
public class perimeter
{
	public static void main(String[] args) {
	    
		Scanner sc= new Scanner(System.in);
		int length  = sc.nextInt();
		int width = sc.nextInt();
		int perimeter=(length+width)*2 ;
		System.out.println("The perimeter of rectangle is   "+ perimeter);
	}
}