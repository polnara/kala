public class calc2 {
    
    static int a = 50;
    static int b = 30;
    public int addition(){
        int addvalue = a+b;
        return addvalue;
    }
    public int multiplication(){
         int multiplyvalue = a*b;
         return multiplyvalue;
     }
     public int division(){
         int divisionvalue = a/b;
         return divisionvalue;
     }
     public int substraction(){
         int substractionvalue = a-b;
         return substractionvalue;
     }
     public static void main(String[] args){
         calc2 calc = new calc2();
         int addvalue = calc.addition();
         System.out.println("addition value is ::" + addvalue);
         int multiplyvalue = calc.multiplication();
         System.out.println("multiplication value is ::" + multiplyvalue);
         int divisionvalue = calc.division();
         System.out.println("division value is ::" + divisionvalue);
         int substractionvalue = calc.substraction();
         System.out.println("substraction value is: :"+ substractionvalue);
     }
    
}
    
      

