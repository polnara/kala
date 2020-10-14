public class CalculatorComputerTestcase {
 public static void main(String[] args) {
   calculatorbase cb = new calculatorbase(10);
   Computerclass cpc = new Computerclass(cb);
   System.out.println("add value  = " + cpc.add(10,30));
   System.out.println("multiply value  = " + cpc.multiply(20,15));
   System.out.println("division value = " + cpc.division(100,25));
   System.out.println("substraction value = " + cpc.substraction(80,30));

    }
}
