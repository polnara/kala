class Bank{
	
	public int amount ;
	
	public Bank(int input){
		this.amount = input;
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