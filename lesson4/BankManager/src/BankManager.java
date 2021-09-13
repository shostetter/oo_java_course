import java.util.Calendar;

public class BankManager {
    public static void main(String[] args) {
        CheckingAccount checking = new CheckingAccount();
        SavingsAccount savings = new SavingsAccount();
        CertificateOfDeposit cod = new CertificateOfDeposit();

        checking.account = "test";
        checking.balence = 100.00;
        checking.limit = 10;

        savings.account = "test2";
        savings.balence = 1000.01;
        savings.rate = 1.4;

        cod.account="test3";
        cod.balence= 10;

        System.out.println(checking.account);
        System.out.println(checking.balence);
        System.out.println(checking.limit);

        System.out.println(savings.account);
        System.out.println(savings.balence);
        System.out.println(savings.rate);
    }
}

