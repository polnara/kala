class Computer {
	public static void main(String[] args){
		// It is method call
		int addResult = add(40,60);
		System.out.println("print addition result *******  "+addResult);
		
		multiply(30,40);
		substraction(100,70);
		division(100,20);
		remainder(100,15);
		greaterthan(100,75);
		lessthan(125,150);
		
		boolean oddResult = OddOrEven(13);
		System.out.println("Print odd result = " + oddResult );
		
		boolean evenResult = OddOrEven(18);
		System.out.println("Print even result = " + evenResult);
	}
	
	
	// It is Method implementation
	public static int add(int a, int b){
		return a + b;
	}
	
	public static void multiply(int a, int b){
		int multiResult = a * b;
		System.out.println("Multipication is =========== "+multiResult);
	}
    public static void division(int a, int b){
		 int divisionresult = a/b;
		 System.out.println("Division result is ====="+divisionresult);
	 }
	public static void substraction(int a, int b){
		int substractionresult = a-b;
		System.out.println("substraction result is----"+substractionresult);
	}
	
	public static void remainder(int a, int b){
		int remainderresult =a%b;
		System.out.println("remainder result is ------"+remainderresult);
	}
	
	public static void greaterthan(int a, int b){
		boolean greaterthanresult = a>b;
		System.out.println("greaterthan result is*******"+greaterthanresult);
	}
	
	public static void lessthan(int a, int b){
		boolean lessthanresult = a<b;
		System.out.println("lessthan result is-----"+lessthanresult);
	}
	
	public static boolean OddOrEven(int number){
		int remainder = number % 2;
		
		if(remainder == 0 ){
			return true;
		}else if(remainder == 1){
			return false;
		}
		return false;
	}
}