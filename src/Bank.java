import sun.font.TrueTypeFont;

public class Bank {

    private String bankName;
    private ClientBank client;

    Bank(String bankName){
        this.bankName = bankName;
    }

    void setClient(ClientBank client){this.client = client;}

    boolean checkWithdraw(float balance, float value){return balance >= value;}

    boolean checkAge(int age){return age >= 18; }


}
