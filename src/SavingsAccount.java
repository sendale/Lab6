public class SavingsAccount extends BankAccount{
    private double rate = 0.025;
    private int savingsNumber = 0;
    private String accountNumber;

    SavingsAccount(String name, double amount){
        super(name, amount);
        accountNumber=super.getAccountNumber()+"-"+this.savingsNumber;
    }

    public void postInterest() {
        double monthlyRate=rate/12;
        double monthlyInterest=getBalance()*monthlyRate;
        this.setBalance(this.getBalance()+monthlyInterest);
    }

    @Override
    public String getAccountNumber() {
        return super.getAccountNumber()+"-"+this.savingsNumber;
    }

    SavingsAccount(SavingsAccount oldAccount, double amount){
        super(oldAccount, amount);
        this.savingsNumber++;
        this.accountNumber= super.getAccountNumber()+"-"+this.savingsNumber;
    }
}