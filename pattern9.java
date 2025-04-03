package patterns;

public class pattern9 {

	public static void main(String[] args) {
		int i,j;
		for(i = 0; i<5; i++) {
			//space
			for(j=0 ; j<5-i-1 ; j++) {
				System.out.print(" ");
			}
			//stars
			for(j=0 ; j<2*i+1 ; j++) {
				System.out.print("*");
			}
			//space
			for(j=0 ; j<5-i-1 ; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
			for(i=0 ; i<5 ; i++) {
				//space
				for(j=0 ; j<i ; j++) {
					System.out.print(" ");
				}
				//star
				for(j=0 ; j<2*5-(2*i+1) ; j++) {
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