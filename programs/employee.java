class Employee{
	// we can access only static variables in static methods.
	// we cannot access instance or (non-static) variables in static methods
	
	
	// instance variables (Dynamic)
	String name = "Harish";
	int age = 30;
	
	// static variables (Dynamic)
	static int salary = 5000000;
	
	public static int monthlySalary(){
		int monthSalary = salary / 12;	
		return monthSalary;
	}
	
	public static int weeklySalary(){
		//return salary/65;
		int weeklySalary = monthlySalary() / 4;
		return weeklySalary;
	}
	
	public static void main(String[] args){
		int monthSalary = monthlySalary();
		System.out.println("Anual Salary :: "+salary);
		System.out.println("Monthly Salary = "+monthSalary);
		System.out.println("Weekly salary :: "+weeklySalary());
		
		System.out.println("===========================");
		
		salary = 2500000;
		System.out.println("Anual Salary :: "+salary);
		System.out.println("Monthly Salary = "+monthlySalary());
		System.out.println("Weekly salary :: "+weeklySalary());
		
		System.out.println("===========================");

		salary = 7500000;
		System.out.println("Anual Salary :: "+salary);
		System.out.println("Monthly Salary = "+monthlySalary());
		System.out.println("Weekly salary :: "+weeklySalary());
		
	}
	
	
}