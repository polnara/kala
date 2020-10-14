class Greaterthan {
public static void main(String [] args) {
    
    int A = 100;
    int B = 150;
    int C = 200;
    int D = 250;

    if (B>A){
        System.out.println("B>A");
    }

    if (C>B) {
        System.out.println("C>A");
    }
    if (A<B) {
        System.out.println("A<B");
        
    }

    boolean result3 = A<B;
    System.out.println(result3);

    boolean result4 = D>C;
    System.out.println(result4);

    boolean result5 = A<D;
    System.out.println(result5);

    boolean result6 = D<A;
    System.out.println(result6);

    boolean result7 = B>D;
    System.out.println(result7);
}
}


