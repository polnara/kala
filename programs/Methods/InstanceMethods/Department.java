package Methods.InstanceMethods;
public class Department{
	// Instance variables. We cannot access in any static methods
	// we can create multiple objects for a class
	String deptName = "IT";
	int budget = 500000;
	
	// Instance method. It doesn't have static. Instance methods called through object
	protected int monthlySpent(){
		// non-static variable budget cannot be referenced from a static context
		int monthlyBudget = budget/ 12;
		return monthlyBudget;
	}
	
	protected int weeklySpent(){
		int weekSpent = monthlySpent() / 4;
		return weekSpent;
	}
	public static void main(String[] args){
		
		Department dpt = new Department();
		System.out.println("Monthly Spent :: " + dpt.monthlySpent());
		System.out.println("Weekly spent :: " + dpt.weeklySpent());
	}
	
}