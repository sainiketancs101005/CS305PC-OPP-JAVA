import java.util.Scanner;
class Lab1P4{
	public static void main(String...args){
		Scanner s = new Scanner(System.in);
		try{
			int a= s.nextInt();
			int b= s.nextInt();
			var c= a/b;
			System.out.println(c);
		}
		catch(Exception e){
			System.out.println("check your input:");
		}		
	}		
	
}
