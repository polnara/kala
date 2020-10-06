class Student{

	String name;
	int age;
	int fee;
	String address;
	
	//constructor : It contains class name.
	
	Student(){
		System.out.println("welcome to constructor");
	}
	
	// we can create multiple constructors
	Student(int a){
		age = a;
		System.out.println("Constructor with parameter "+a);
	}
	
	Student(String n, int a, int f, String ad){
		name = n;
		age = a;
		fee = f;
		address = ad;
		System.out.println(name + " "+ age + " " + fee + " " +address);
	}
	public int monthlyFee(){
		return fee / 12;
	}
	
	public int weeklyFee(){
		return monthlyFee() / 4;
	}
	// Harish Monthly Fee is 40000 
	// Mahesh Monthly Fee is 80000
	// Ganesh Monthly Fee is 50000
	
	public static void main(String[] args){
		Student std1 = new Student("Harish",10,500000,"Bengalore");
		System.out.println("Monthly fee "+std1.monthlyFee());
		
		String n ="Mahesh";
		int age = 12;
		int fee = 700000;
		String address = "Hyderbad";
		Student std2 = new Student(n, age, fee, address);
		
		n  = "Genesh";
		age = 15;
		fee = 600000;
		address = "Tirupathi";
		Student std3 = new Student(n,age, fee, address);
	}
}