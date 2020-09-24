class Tax {
    public static void main(String[] args) {
        int age = 75;
        int salary = 20;
        int tax = 0;
        if (salary >= 1 && salary < 2){
            tax = 5;

        }
        else if(salary >=2 && salary <5){
            tax =10;
        }
        else if (salary>=5 && salary <10){
            if (age>= 60){
                tax = 5;
            }
            else {
                tax =15;
            }
          
        }
        else {
            if (age>= 60){
                tax = 10;
            }
            
        
            else {
                tax = 20;
            }
        }
        System.out.println("tax percentage is " +tax+"%");
    }
    
}









	
	
	
