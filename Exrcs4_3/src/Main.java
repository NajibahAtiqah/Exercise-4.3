
public class Main {

	public static void main(String[] args) {
		System.out.println("<<<<<<<<<<<<<<< APPLE'S DETAILS >>>>>>>>>>>>>>>");
		Apple A = new Apple(3.0,6);
		System.out.print(A);//print using overriding method
		System.out.println("\n");


		System.out.println("<<<<<<<<<<<<<<< GRANNY SMITHS'S DETAILS >>>>>>>>>>>>>>>");
		GrannySmith GS = new GrannySmith( 2, 2, 0.1);
		System.out.print(GS);
		System.out.println("\n");


		System.out.println("<<<<<<<<<<<<<<<< FUJI APPLE'S DETAILS >>>>>>>>>>>>>>>>");
		FujiApple FA = new FujiApple( 5, 10, 152,7, 24, 13);
		System.out.print(FA);
		System.out.println("\n");
		
		System.out.println("<<<<<<<<<<<<<<<<< GRAPE'S DETAILS >>>>>>>>>>>>>>>>>");
		Grape G = new Grape("Grape", "Purple", 104, 27);
		System.out.println(G);
		

		
		System.out.println("<<<<<<<<<<<<<<<<< MANGO'S DETAILS >>>>>>>>>>>>>>>>>");		
		Mango M = new Mango("Mango", 0.3);
		System.out.println(M);
		System.out.println();

	}

	}


