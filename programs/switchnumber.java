class switchnumber {
    public static void main(String[] args) {
		int num = getnumber("asdf");
		if(num == 10){
			System.out.println("Invalid Day");
		}else{
			System.out.println(num);

		}
		System.out.println(getnumber("Friday"));
		System.out.println(getnumber("Wednesday"));
    }
    public static int getnumber(String day){
        int number = 0;
        switch (day) {
            case "Monday":
                number = 1;
                break;
            case "Tuesday":
                number  = 2;
                break;
            case "Wednesday":
                number = 3;
                break;
            case "Thursday":
                number = 4;
                break;
            case "Friday":
                number = 5;
                break;
            case "Saturday":
                number = 6;
                break;
            case "Sunday":
                number = 7;
                break;

            default:
				number = 10;
                break;
        }
        return number;
        
    }

      }
