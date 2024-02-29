import java.util.Random;

public class BankAccount {
    private float bankBalance = 0f;
    private String accountNumber;

    BankAccount() {this.accountNumber = this.generateAccountNumber();}

    public void deposit(float value) {bankBalance += value;}

    public String getAccountNumber(){return accountNumber;};

    public void withdrawal(float value) {bankBalance -= value;}

    protected float getBankBalance(){return bankBalance;}

    private String generateAccountNumber(){
        Random random = new Random();
        StringBuilder accountNumberStringBuilder = new StringBuilder();

        for (int i=0; i<10; i++){
            int randomDigit = random.nextInt(10);
            accountNumberStringBuilder.append(randomDigit);
        }
        return accountNumberStringBuilder.toString();
    }
}
