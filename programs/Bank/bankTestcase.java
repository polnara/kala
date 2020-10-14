class BankTestCase {
	public static void main(String[] args){
		
		Bank bank = new Bank(2000000);
		
		HDFCBank hdfc = new HDFCBank(bank);
		System.out.println("Current Amount :: " + hdfc.getCurrentAmount());
		
		hdfc.withdraw(10000);
		System.out.println("After withdraw , Current Amount :: " + hdfc.getCurrentAmount());
		
		hdfc.deposit(5000000);
		System.out.println("After deposit,Current amount :: " + hdfc.getCurrentAmount());
	}
}