 class KarnatakaBank {

    SbiBank b;
	
	public KarnatakaBank(SbiBank b) {
		this.b = b;
	}
	
	public void withdraw(int amount){
		b.withdraw(amount);
	}
	
	public void deposit(int amount){
		b.deposit(amount);
	}
	
	public int getCurrentAmount(){
		return b.amount;
	}
	
}
