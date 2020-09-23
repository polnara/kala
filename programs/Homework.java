class Homework {
    public static void main(String[] args) {
        int a = 25;
        int b = 10;
        int c = 15;
        int d = 5;
        int result1 = Division(a, b);
        System.out.println("Division = " +result1);
        int result2  = multiplication(a, b, c, d);
        System.out.println("multiplication = "+result2);
        int result3 = remainder(a, b);
        System.out.println("remainder = "+result3);
    
    }
    public static int Division(int a, int b){
        return a/b;
    }
    public static int multiplication(int a, int b, int c, int d){
        return a*b*c*d;
    }
    public static int remainder(int a, int b){
        return a%b;
    }
}
