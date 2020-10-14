class Hello {
	public static void main(String[] args){
		int a = 10;
		int b = 20;
		int c = 25;
		int result1 = add(a , b, c);
		System.out.println(result1);
		int result2 = substraction(a, b);
		System.out.println(result2);
		int result3 = multiplication(a,b);
		System.out.println(result3);
	}
	public static int add(int a, int b,int c){
		return a+b+c;
	}

	public static int multiplication(int a, int b){
		return a*b ;
	}
	public static int substraction(int a, int b){
		return a-b;
	}
}