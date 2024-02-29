//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Bank bank = new Bank("BB");
            ClientBank client = new ClientBank("Raul", 18, "123456790");
            BankAccount bankAccount = new BankAccount();
            bank.setClient(client);

            if (bank.checkAge(client.getAgeClient())){
                System.out.println("Bem vindo, " + client.getNameClient());
                client.setBankAccount(bankAccount);
                System.out.println(client.getBankBalance());
                client.getBankAccount().deposit(1000);
                System.out.println(client.getBankBalance());
                if (bank.checkWithdraw(client.getBankBalance(), 250.90F)){
                    client.getBankAccount().withdrawal(250.90F);
                    System.out.println("Saque realizado com sucesso, novo saldo: " + client.getBankBalance());
                } else {
                    System.out.println("Saque indisponível, saldo da conta inferior.");
                }

            } else {
                System.out.println("Acesso negado!");
            }

        }
}