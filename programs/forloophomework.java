// class contain methods
/* public class ClassName {
		public int method1(){
		}
		public int method2(int a, int b){
		}
	}
*/

class forloophomework {
    public static void main(String[] args) {
       int a  = 4;
       int b = 7;
	   int total = 0;
	   
	   total = sum(a,b);// 4 + 5 + 6 + 7 = 22
	   System.out.println(total);

       total = sum(7,9);	// 7 + 8 + 9 = 24
       System.out.println(total);
	   
       total= sum(3,7);	// 3 + 4 + 5 +6 + 7 = 25
       System.out.println(total);
		
    }
      

    
    public static int sum(int a, int b){
        int result = 0;
        for(; a<=b; a++){
            result = a+ result;
        }
        return result;
    }
}

