class Taxcalculation {
    public static void main(String[] args) {
        int age = 65;
        int salary = 1500000;
        Tax(age, salary);
    }
    public static void Tax(int age, int salary){
        double tax = 0;
        if (salary >= 100000 && salary < 200000){
            tax = .05;

        }
        else if(salary >=200000 && salary <500000){
            tax = 0.1;
        }
        else if (salary>=500000 && salary <1000000){
            if (age>= 60){
                tax = 0.05;
            }
            else {
                tax =0.15;
            }
          
        }
        else {
            if (age>= 60){
                tax = 0.1;
            }
            
        
            else {
                tax = 0.2;
            }
        }
        System.out.println("tax is " +(salary * tax));
    }
    
}
