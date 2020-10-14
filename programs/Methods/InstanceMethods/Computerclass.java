package Methods.InstanceMethods;
import bank.calculatorbase;
class Computerclass {
    calculatorbase b;
    public int a;
    public int c; 

    public Computerclass(calculatorbase b){
        this.b = b; 
    }

    public int add(int a, int c){
        this.a = a; 
        this.c = c; 
        this.b.add(a,c);
        return this.b.result;
    }
    public int multiply(int a, int c){
        this.a = a; 
        this.c = c;
        this.b.multiply(a,c);
        return this.b.result;
    }
    public int division(int a, int c){
        this.a = a; 
        this.c = c;
        this.b.division(a,c);
        return this.b.result;
    }
    public int substraction(int a, int c){
        this.a = a; 
        this.c = c;
        this.b.substraction(a,c);
        return this.b.result;
    }
}
