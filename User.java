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