package patterns;
import java.util.*;
public class pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		int i,j;
		for(i=0 ; i<n ; i++) {
			//space
			for(j=0 ; j<i ; j++) {
				System.out.print(" ");
			}
			//star
			for(j=0 ; j<2*n-(2*i+1) ; j++) {
				System.out.print("*");
			}
			//space
			for(j=0 ; j<i ; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		

	}

}
