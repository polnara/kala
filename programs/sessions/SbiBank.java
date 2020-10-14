class SbiBank {
    public int amount;
    public SbiBank(int amount){
        this.amount = amount;
    }
    public void deposit(int depositAmount){
        this.amount = this.amount + depositAmount;
    }

    public void withdraw(int withdrawAmount){
        if(this.amount >= withdrawAmount){
            this.amount =  this.amount - withdrawAmount;
        }
    }
}