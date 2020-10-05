class kalatest{
    public static void main(String[] args) {
        int age = 30;
        int salary = 1000000;
        int z = 0;
        
        Tax(age, salary);
        z = Tax2(65,1400000);
        System.out.println("tax is " +z);
		
		Tax2(20,100000);
    }
    public static void Tax(int age, int salary){
		int tax = 0;
        if (salary >= 100000 && salary < 200000){
            tax = salary * 5/100;

        }
        else if(salary >=200000 && salary <500000){
            tax = salary * 10/100;
        }
        else if (salary>=500000 && salary <1000000){
            if (age>= 60){
                tax = salary * 5/100;
            }
            else {
                tax = salary * 15/100;
            }
          
        }
        else {
            if (age>= 60){
                tax = salary * 10/100;
            }
            
        
            else {
                tax = salary * 20/100;
            }
        }
        System.out.println("tax is " +(tax));
    }
    
    public static int Tax2(int age, int salary){
		int tax = 0;
        if (salary >= 100000 && salary < 200000){
            tax = salary * 5/100;
            
        }
        else if(salary >=200000 && salary <500000){
            tax = salary * 10/100;
        }
        else if (salary>=500000 && salary <1000000){
            if (age>= 60){
                tax = salary * 5/100;
            }
            else {
                tax = salary * 15/100;
            }
          
        }
        else {
            if (age>= 60){
                tax = salary * 10/100;
            }
            
        
            else {
                tax = salary * 20/100;
                            }
        }
        return tax;
        //System.out.println("tax is " +(tax));
    }
}
