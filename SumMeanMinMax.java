import java.util.Scanner;


public class SumMeanMinMax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int sum = a+b+c;
		double mean = sum /3;
		
		System.out.println("sum  " +sum);
		
		System.out.println("mean  " +mean);
		
		if(a>b && a>c) {
		System.out.println("Max  " +a);
		}
		else if(b>a && b>c) {
		System.out.println("Max  " +b);
		}
		
		else if (c>a && c>b) {
			System.out.println("Max  " +c);
		}
		
		if(a<b && a<c) {
			System.out.println("Min  " +a);
			}
			else if(b<a && b<c) {
			System.out.println("Min   " +b);
			}
			
			else if (c<a && c<b) {
				System.out.println("Min  " +c);
			}
		
		/*
		 * Todo: Print the sum, mean, max Value and min Value of a, b and c.
		 * */
		

	}

}
