import java.util.UUID;

public class SBIBankAccount implements BankAccount{
    private String accountNumber;
    private int balance;
    private int minBalance = 500;
    private int roi;

    private int age;

    public SBIBankAccount(int balance) {
        this.balance = balance;
        this.accountNumber = String.valueOf(UUID.randomUUID());
//        this.minBalance = 500;
        this.roi = 5;
    }

    public SBIBankAccount(String accountNumber, int balance, int roi, int age) {
        this.accountNumber = String.valueOf(UUID.randomUUID());
        this.balance = balance;
        this.roi = roi;
        this.age = age;
    }

    @Override
    public Boolean withdrawMoney(int money) {
        if(balance > minBalance && money <= balance){
            this.balance -= money;
            return true;
        }
        return false;
    }

    @Override
    public Boolean addMoney(int money) {
        this.balance += money;
        return true;
    }

    @Override
    public int checkBalance() {
        return this.balance;
    }

    public void setRoi(int roi) {
        if(1 < age && age <= 18){
            this.roi = 5;
        }
        else if (19 <= age &&  age <= 25) {
            this.roi = 7;
        }
        else if(26 <= age && age <= 40){
            this.roi = 10;
        }
        else if (41 <= age && age <= 60) {
            this.roi = 12;
        }
        else{
            this.roi = 16;
        }
    }

    @Override
    public int getROI() {
        return this.roi;
    }

    @Override
    public int getTotalInterest(int amount, int timeInYears) {
        return 0;
    }
}
