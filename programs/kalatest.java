class kalatest {
    public static void main(String[] args) {
        int age = 30;
        int salary = 1000000;
        int tax = salary * 0/100;
        Tax(age, salary, tax);
    }
    public static void Tax(int age, int salary, int tax){
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
    
}
