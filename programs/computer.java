class Computer {
	
	public static void main(String[] args){
		// It is method call
		int addResult = add(40,60);
		System.out.println("print addition result *******  "+addResult);
		
		multiply(30,40);
	}
	
	
	// It is Method implementation
	public static int add(int a, int b){
		return a + b;
	}
	
	public static void multiply(int a, int b){
		int multiResult = a * b;
		System.out.println("Multipication is =========== "+multiResult);
	}
	
}