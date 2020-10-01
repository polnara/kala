class loopshomework {
        public static void main(String[] args){
            doubleForloop(4,7);
            doubleForloop(5,8);
            doubleForloop(3,8);
            doubleForloop(2,9);
            stars();
            star2();
        }
        
        public static void doubleForloop(int a, int b){
            for(int i=a; i<=b; i++){
                for(int j=1; j<=10; j++){
                    System.out.println(i+ "*"+j+ "="+(i*j));
                }
            }
        }

        public static void stars(){
            for(int i = 0; i <5; i++){
                for(int j = 0; j < i; j++){
                    System.out.print("* ");
                }
                System.out.println(); 
            }
        }
        
        public static void star2(){
            for(int i = 0; i < 7; i++){
                for(int j = 7-i; j > 1; j--){
                    System.out.print(" ");
                }

                for(int j = 0; j <= i; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }