import java.util.ArrayList;
import java.util.List;

class Transaction{

    private String transactionId;
    private String senderWalletId;
    private String receiverWalletId;
    private double amount;

    public Transaction(String senderWalletId, String receiverWalletId, double amount) {
        this.senderWalletId = senderWalletId;
        this.receiverWalletId = receiverWalletId;
        this.amount = amount;
    }
    public String getTransactionId() {
        return transactionId;
    }
    public String getSenderWalletId() {
        return senderWalletId;
    }
    public String getReceiverWalletId() {
        return receiverWalletId;
    }
    public double getAmount() {
        return amount;
    }
}