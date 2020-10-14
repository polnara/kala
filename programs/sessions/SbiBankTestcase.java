class SbiBankTestcase {
    public static void main(String[] args){
                
        SbiBank sbi = new SbiBank(100000);
        KarnatakaBank ktb = new KarnatakaBank(sbi);
        System.out.println("Current Amount :: " + ktb.getCurrentAmount());
                
        ktb.withdraw(10000);
        System.out.println("After withdraw , Current Amount :: " + ktb.getCurrentAmount());
                
        ktb.deposit(30000);
        System.out.println("After deposit,Current amount :: " + ktb.getCurrentAmount());
    }
}

