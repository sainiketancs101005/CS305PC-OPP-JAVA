import java.util.Scanner;
class Lab3P4{
	public static void main(String...args){
		Lab3P4 l = new Lab3P4();
		Lab3P4 l1 = new Lab3P4();
		Lab3P4 l2 = new Lab3P4();
		Lab3P4 l3 = new Lab3P4();
		l.show(); 
		l1.show(10);
		l2.show("string"); 
		l3.show(10, "string");
	}
	Lab3P4(){
		System.out.println("constructor without params");
	}
	Lab3P4(int x){
		System.out.println("constructor with 1 param:" + x);
	}
	Lab3P4(String s){
		System.out.println("constructor with string param:" + s);
	}
	Lab3P4(int x, String s){
		System.out.println("constructor with string and int param:"+ x + " "+s);
	}
}
