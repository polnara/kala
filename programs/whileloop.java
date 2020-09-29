 class whileloop {
     public static void main(String[] args) {
         int a = 10;
         while (a>=0){
             System.out.println(a);
             a--;
         }
         add(4,7);
         add(7,9);
         add(3,7);
         add(6,8);
         add(2,8);
     }
    public static void add(int a, int b){
        //a = 3 b=5 3+4+5  return 12
        int num = 0;
        while(a<=b){
            num = num + a;
            a++;
        }
        System.out.println(num);
       // return num;
   
   }
    }

