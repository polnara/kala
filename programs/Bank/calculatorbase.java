class calculatorbase{
    public int result;

    public calculatorbase(int result){
        this.result = result; 
    }
    
    public void add(int a, int b){
        this.result = (a+b);
    }
    public void multiply(int a, int b){
        this.result = (a*b);
    }
    public void division(int a,int b){
        this.result = (a/b);
    }
    public void substraction(int a, int b){
        this.result =(a-b);
    }
}
			