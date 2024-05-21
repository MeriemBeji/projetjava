import java.util.ArrayList;
import java.util.List;


class User{

    private String userId;
    private String username;
    private String password;

    public User(String userId,String username, String password) {
        this.userId=userId;
        this.username = username;
        this.password = password;
    }
    public String getUserId() {
        return userId;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public Wallet createWallet(String walletId) {
        return new Wallet(walletId,userId);
    }
}


public class Main {
    public static void main(String[] args) {
        User u1=new User("1","Samer","Notthatnasty");
        User u2=new User("2","Mouadh","15236mm");

        Wallet w1=u1.createWallet("wallet1");
        Wallet w2=u2.createWallet("wallet2");

        w1.deposit(2000);
        double transferAmount=500;
        boolean transferSuccessful=w1.transfer((w2.getWalletId()), transferAmount);

        if(transferSuccessful){
            System.out.println("Transfer of $"+transferAmount+" from "+w1.getWalletId()+" to "+w2.getWalletId()+" was successful");
    
        }
        else{
            System.out.println("Transfer failed. Insufficient funds or invalid wallet ID");
        }

        System.out.println("Final Balance of "+w1.getWalletId()+": $ "+w1.getBalance());
        System.out.println("Final Balance of "+w2.getWalletId()+": $ "+w2.getBalance());
}}