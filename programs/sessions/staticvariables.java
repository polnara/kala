public class staticvariables {
      
    static int a = 10;
    static int b = 40;
    public static int addition(){
        int addvalue = a+b;
        return addvalue;
    }
 public static int multiplication(){
     int multiplyvalue = a*b;
     return multiplyvalue;
 }
 public static int division(){
     int divisionvalue = a/b;
     return divisionvalue;
 }
 public static int substraction(){
     int substractionvalue = a-b;
     return substractionvalue;
 }
 public static void main(String[] args){
     int addvalue = addition();
     System.out.println("addition value is ::" + addvalue);
     int multiplyvalue = multiplication();
     System.out.println("multiplication value is ::" + multiplyvalue);
     int divisionvalue = division();
     System.out.println("division value is ::" + divisionvalue);
     int substractionvalue = substraction();
     System.out.println("substraction value is: :"+ substractionvalue);
 }

}
