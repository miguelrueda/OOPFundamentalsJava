import java.util.UUID;

public class Payment {

    private final CreditCard creditCard;
    private final UUID transactionId;
    private int value;

    public Payment(CreditCard creditCard, UUID transactionId, int value) {
        this.creditCard = creditCard;
        this.transactionId = transactionId;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "creditCard=" + creditCard +
                ", transactionId=" + transactionId +
                ", value=" + value +
                '}';
    }
}
