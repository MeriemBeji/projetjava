import java.util.ArrayList;
import java.util.List;

public class Wallet {
    private String walletId;
    private String ownerId;
    private double balance_wallet;
    private String type_wallet;



    public Wallet(String walletId , String ownerId){
        this.walletId=walletId;
        this.ownerId= ownerId;

    }
    public double getBalance_wallet() {
        return balance_wallet;
    }

    public String getType_wallet() {
        return type_wallet;
    }


    public String getWalletId(){
        return walletId;
    }
    public String getOwnerId(){
        return ownerId;
    }
    public double getBalance(){
        return balance_wallet;
    }
    public void deposit(double amount){
        balance_wallet +=amount;
    }
    public boolean withdraw(double amount){
        if(amount<=balance_wallet){
            balance_wallet -=amount;
            return true;
        }else{
            return false;
        }
    }
    public boolean transfer(String toWalletId,double amount){
        return true;
    }
    public List<Transaction> getTransactionsHistory(){
        return new ArrayList<>();
    }
}
