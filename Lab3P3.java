class Lab3P3{
	public static void main(String...args){
		Lab3P3 l =new Lab3P3();
		l.show();
		l.show(10);
		l.show("strings");
		l.show(22,"hello");
	}
		public void show(){
			System.out.println("M O L: ");
		}
		public void show(int x){
			System.out.println("M O L 2: " + x );
		}
		public void show( String y){
			System.out.println("M O L 3: " + y);			
	 	}
	 	public void show(int x, String s){
	 		System.out.println("M O L 4: "+ x + " "+s);
	 	}
}
