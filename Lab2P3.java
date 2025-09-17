import java.util.Scanner;
class Lab2P3{
	public static void main(String...args){
		Scanner s=new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		String op = s.next();
		varstr = switch(op){
			case "==" -> "hello";
			case "--","=","-" ->"not good";
			default -> "sorry";
	 	};
		System.out.println("result is:" + str);
	}
}
