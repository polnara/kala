// It not recommanded implemetation. Use methods for reusablility. repeated code put it in method and call it with different values; 
 class forloop {
     public static void main(String[] args) {
         int num =0;
         for (int a = 4; a<=7; a++){
             num = num + a;
         }
         System.out.println(num);
         num = 0; 
         for (int a =7; a<=9; a++){
             num = num+a;
         }
         System.out.println(num);
        num = 0;
        for (int a =3; a<=7; a++){
            num = num + a;
        }
         System.out.println(num);
      
    
    }
}
