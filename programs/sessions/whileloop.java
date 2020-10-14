 class whileloop {
     public static void main(String[] args) {
		 System.out.println("display reverse numbes");
		 System.out.println("==========================");
         int a = 10;
         while (a>=0){
             System.out.println(a);
             a--;
         }
		 
		 System.out.println("Display total between the range" );
		 System.out.println("=================================");
        
		 add(4,7);
         add(7,9);
         add(3,7);
         add(6,8);
         add(2,8);
		 
		 System.out.println("Displaying reverse number ");
		 System.out.println("==========================");
		 int rev = reverse(2445652);
		 System.out.println(" reverse number => "+ rev);
		 
     }
    public static void add(int a, int b){
        //a = 3 b=5 3+4+5  return 12
		// (4 , 7 ) => 4 + 5 + 6 + 7 = 22
		System.out.print("("+a+","+b+") => ");
        int num = 0;
        while(a<=b){
            num = num + a;
			if(a!=b){
				System.out.print(a + " + ");
			}else{
				System.out.print(a);
			}
            a++;
        }
        System.out.println( " = " + num);
       // return num;
   
   }
   
   
   public static int reverse(int num){
	   System.out.println("number is "+ num);
	   int reverseNum = 0;
	   while(num%10 != 0 ){
		   System.out.print(num);
		   int remainder = num % 10 ;
		   System.out.print(" => remainder "+ remainder);
		   num = num / 10;
		   System.out.print(" , quotient " + num+ ", ");
		   reverseNum = (reverseNum  + remainder ) * 10;
		   System.out.print(" , reverse => "+reverseNum+" , ");
	   }
	   return reverseNum;
   }
    }

