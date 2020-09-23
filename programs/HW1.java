public class HW1 {
    public static void main(String[] args) {
        int a = 25;
        int b = 10;
        int c = 15;
        int d = 5;
        boolean result1 = Greaterthan(a, b);
        System.out.println("Greaterthan = " +result1);
        boolean result2  = lessthan(c, d);
        System.out.println("lessthan = "+result2);
        boolean result3 = equalsto(a, b);
        System.out.println("equalsto = "+result3);
        greater(a,b);
            
    }
    public static boolean Greaterthan(int a, int b){
        return a>b;
    }
    public static boolean lessthan(int c, int d){
        return d<c;
    }
    public static boolean equalsto(int a, int b){
        return a==b;
    }

    public static void greater(int a, int b){
         if (a>b){
            System.out.println("a");
         }
         else if (b>a){
             System.out.println("b");
         }
         else{
             System.out.println("a==b");
         }
    }

    
}
