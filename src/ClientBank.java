public class ClientBank {
    private final String nameClient;
    private final int ageClient;
    private final String cpfClient;
    protected BankAccount bankAccount;

    ClientBank (String nameClient, int ageClient, String cpfClient){
        this.nameClient = nameClient;
        this.ageClient = ageClient;
        this.cpfClient = cpfClient;
    }

    public void setBankAccount(BankAccount bankAccount){this.bankAccount = bankAccount;}

    public String getNameClient() {return nameClient;}

    public int getAgeClient() {return ageClient;}

    public String getCpfClient() {return cpfClient;}

    public String getAccountNumber() {return bankAccount.getAccountNumber();}

    public float getBankBalance(){return bankAccount.getBankBalance();}

    public BankAccount getBankAccount() {return this.bankAccount;}

    public void showClientBankAllData(){
        System.out.printf("Nome: %s\nIdade: %d\nConta: %s\nCPF: %s", nameClient, ageClient, bankAccount.getAccountNumber(), cpfClient);
    }
}
