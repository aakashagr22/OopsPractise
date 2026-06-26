import java.util.ArrayList;
class Account {
    private final String accountHolder;
    private final int customerId;
     private final int accountNumber;
    private int money =0;
Account(String name, int accNo, int custId){
    this.accountHolder = name;
    this.accountNumber = accNo;
    this.customerId = custId;
}
    public String getAccountHolder() {
        return accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getBalance() {
        return money;
    }

    public void setBalance(int money) {
        this.money = money;
    }
}

public class BankCollection {
    //    Write a Java program to create a class called "Bank" with a collection of accounts and
//    methods to add and remove accounts, and to deposit and withdraw money.
//    Also define a class called "Account" to maintain account details of a particular customer.
    ArrayList<Account> collection = new ArrayList<>();

    public void addAccount(String accountHolder, int accountNumber, int customerId) {
        collection.add(new Account(accountHolder, accountNumber, customerId));
    }

    public void removeAccount(int accountNumber) {
        for (Account acc : collection) {
            if (acc.getAccountNumber() == accountNumber) {
                collection.remove(acc);
            }
        }
    }
    public void depositMoney(int userMoney,int accountNumber){
        for(Account acc: collection){
            if( acc.getAccountNumber() == accountNumber){
                int totalMoney=  acc.getBalance() + userMoney;
                acc.setBalance(totalMoney);
                break;
            }
        }
    }
    public int withdrawMoney(int accountNumber,int userMoney){

        for(Account acc: collection){
            if( acc.getAccountNumber() == accountNumber){
                if(acc.getBalance()>=userMoney){
                    acc.setBalance(acc.getBalance()- userMoney);
                    return acc.getBalance();
                }
                else return 0;
            }
        }
        return 0;
    }

    public void getAccountDetails(int accountNumber) {
        for (Account acc : collection) {
            if (acc.getAccountNumber() == accountNumber) {
                System.out.println("Account Number: " + acc.getAccountNumber() + ", CustomerId " + acc.getCustomerId() + ", AccountHolder: " + acc.getAccountHolder());
            }
        }
    }
}