class SwitchDemo{

	public static void main(String[] args){
		System.out.println("Day is :: " + getDay(5));
		System.out.println("Day is :: " + getDay(7));
		System.out.println("Day is :: " + getDay(80));


	}
	
	public static String getDay(int number){
		String day = "";
		
		/*if(number == 1 ){
			day = "Sunday";
		}else if(number == 2){
			day = "Monday";
		}else if(number == 3){
			day = "Tuesday";
		}else if(number == 4){
			day = "Wednsday";
		}else if(number == 5){
			day = "thursday";
		}else if(number == 6){
			day = "Friday";
		}else if(number == 7){
			day = "Saturday";
		}else{
			day = "Invaid day";
		}
		
		*/
		
		switch(number) :
		
			case 1 : 
				day = "Sunday";
				break;
			case 2 : 
				day = "Monday";
				break;
			case 3 : 
				day = "Tuesday";
				break;
			case 4 : 
				day = "Wednsday";
				break;
			case 5 : 
				day = "Thursday";
				break;
			case 6 : 
				day = "Friday";
				break;
			case 7 : 
				day = "Saturday";
				break;
			default :
				day = "Invalid Day";
				
		return day;
		
	}
}