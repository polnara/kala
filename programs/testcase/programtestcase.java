package testcase;

import Methods.InstanceMethods.Department;
class ProgramTestcase{

	public static void main(String[] args){
		Department dept = new Department();
		System.out.println("Monthly Spent :: " + dept.monthlySpent());
		System.out.println("Weekly spent :: "+ dept.weeklySpent());
	}
}