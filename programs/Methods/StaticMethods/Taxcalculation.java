// Class Name should start with capital letter
// variable name should start with small letter
// method name should start with small letter

class Taxcalculation {
    public static void main(String[] args) {
        int age = 65;
        int salary = 1500000;
        Tax(age, salary);
		Tax(30,400000);
		Tax(25,700000);
		Tax(70,700000);
		Tax(40,1300000);//2,60,000
		Tax(70,1500000);//1,50,000
		Tax(25,10000);
		
    }
    public static void Tax(int age, int salary){
        double tax = 0;
		if(salary<=100000){
			tax = 0 ;
		}else if (salary >= 100000 && salary < 200000){
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
            }else {
                tax = 0.2;
            }
        }
        System.out.println("tax is " +(salary * tax));
    }
    
}
