
class Tax

 {
    String name;
    int age;
    int salary;
   
    Tax2(String n, int a, int s){
        name = n;
        age = a;
        salary = s;
    }
    public void Tax(){
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
        System.out.println(name +" salary is " + salary + " and age is " + age + ", so tax is " + (tax*salary));
    }
    public static void main(String[] args) {

        //harry 50 1000000
        //john 45 700000	->	john salary is 700000 and age is 45, so tax is 5000
        //Mical 75 900000	->	Mical salary is 900000 and age is 75, so tax is 10000
        //Robert 65 1200000 - Robert salary is 1200000 and age is 65 so tax is 12000
        Tax2 tx1 = new Tax2("Harry", 50, 1000000);
        tx1.Tax();

        Tax2 tx2 = new Tax2("John", 45, 700000);
        tx2.Tax();

        Tax2 tx3 = new Tax2("Michael", 75, 900000);
        tx3.Tax();

        Tax2 tx4 = new Tax2("Robert", 65, 1200000);
        tx4.Tax();
		
    }
    
    
}
