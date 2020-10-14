class Calculator{
	
	// A class can contain multiple methods.
	// A class will be contain only one main method
	/*
	operators
	
		=	assignment
		+	addition
		-	substraction
		*	multiplication
		>	greater than
		<	less than
		>=	greater than or equals to
		<=	less than or equals to 
		++	increment
		--	decrement
		&&	and
		||	or
		
		==	equals
		%   modulus
		/   division
		
		public - access specifier ( optional)
		static - keyword ( optional)
		int 	-	return type	(Mandatory);
		add		-	Method Name (Mandatory);
		(int i, int j)	-	Parameters	(Optional)
		
		
		Method implementation
		
		Method will be executed only when you call the method
		

	*/
	
	public static void main(String[] args){
		int i = 100;
		int j = 50;
		int k = 100;
		
		
		
		int result1 = add(i , j);
		System.out.println("additon result :: ["+ i + ","+j+"] = "+result1);
		
		int result5 = add(i , k);
		System.out.println("additon result :: ["+ i + ","+k+"] = "+result5);
		
		int result6 = add( j, k);
		System.out.println("additon result :: ["+ j + ","+k+"] = "+result6);

		int result2 = i - j;
		System.out.println("Substraction result :: ["+ i + ","+j+"] = "+result2);
		
		int result3 = i * j;
		System.out.println("Multipication result :: ["+ i + ","+j+"] = "+result3);
		
		boolean greatStatus = i > j;

		boolean lessStatus = i < j;
		
		boolean greatEqals = i >= k;
		
		boolean lessEqals = i <= j;
		
		int incVal = i++;
		
		int decVal = i--;
		
		boolean andVal = i>j&& i<j;	// T && F = F
		boolean trVal = i>j && i>=k;	//	T && T = T
		
		boolean orVal = i>j || i<j;	// T || F = F
		boolean trorVal = i<j && i>k;	//	F || F = F
		
		boolean eqResult = i == k;
		boolean eqFResult = i == j;
		
	}
	
	public static int add(int i, int j){
		return i + j;
	}
	
}