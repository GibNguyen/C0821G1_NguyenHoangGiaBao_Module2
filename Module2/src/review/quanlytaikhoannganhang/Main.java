package review.quanlytaikhoannganhang;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account(01,"Gia Bao");
        Account account2 = new Account();
        account1.transMoney(account1, account2, 20);
        account1.addMoneyAccount(30);
        System.out.println(account1);
        System.out.println(account2);
    }
}
