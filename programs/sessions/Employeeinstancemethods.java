// class contains properties and methods 
 class EmployeeInstance {
        //  properties    
        String name = "Harish";
        int age = 30;
        int annualsalary = 5000000;
        
		
		// Methods
        public int monthlySalary(){
            int monthSalary = annualsalary / 12;	
            return monthSalary;
        }
        
        public int weeklySalary(){
            int weeklySalary = monthlySalary() / 4;
            return monthlySalary() / 4;
        }
        
        public static void main(String[] args){
            EmployeeInstance ei = new EmployeeInstance();
            int monthSalary = ei.monthlySalary();
            System.out.println("age is::"+ ei.age++);
            System.out.println("age is ::"+ ei.age);
            System.out.println("Anual Salary :: "+ ei.annualsalary);
            System.out.println("Monthly Salary = "+monthSalary);
            System.out.println("Weekly salary :: "+ei.weeklySalary());
            
            System.out.println("===========================");
            
            ei.annualsalary = 2500000;
            System.out.println("Anual Salary :: "+ei.annualsalary);
            System.out.println("Monthly Salary = "+ei.monthlySalary());
            System.out.println("Weekly salary :: " + ei.weeklySalary());
            
            System.out.println("===========================");
    
            ei.annualsalary = 7500000;
            System.out.println("Anual Salary :: "+ei.annualsalary);
            System.out.println("Monthly Salary = "+ei.monthlySalary());
            System.out.println("Weekly salary :: "+ei.weeklySalary());
            
        }
        
        
    }

