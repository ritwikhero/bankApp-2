public class SBIBankAccount implements BankAccount{
    private String accountNumber;
    private int balance;
    private int minBalance;
    private int roi;



    @Override
    public Boolean withdrawMoney(int money) {
        return null;
    }

    @Override
    public Boolean addMoney(int money) {
        return null;
    }

    @Override
    public int checkBalance() {
        return 0;
    }

    @Override
    public int getROI() {
        return 0;
    }

    @Override
    public int getTotalInterest(int amount, int timeInYears) {
        return 0;
    }
}
