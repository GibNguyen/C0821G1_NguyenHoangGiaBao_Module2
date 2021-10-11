package review.quanlytaikhoannganhang;

import java.text.NumberFormat;
import java.util.Locale;

public class Account {
    private long idAccount;//Số tk
    private String nameAccount;//Tên tk
    private double moneyAccount;//Số tiền trong tk
    public static final double INTEREST = 0.035;

    public Account() {
        this.moneyAccount = 50;
    }

    public Account(long idAccount, String nameAccount) {
        this.idAccount = idAccount;
        this.nameAccount = nameAccount;
        this.moneyAccount = 50;
    }

    public long getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(long idAccount) {
        this.idAccount = idAccount;
    }

    public String getNameAccount() {
        return nameAccount;
    }

    public void setNameAccount(String nameAccount) {
        this.nameAccount = nameAccount;
    }

    public double getMoneyAccount() {
        return moneyAccount;
    }

    public void setMoneyAccount(double moneyAccount) {
        this.moneyAccount = moneyAccount;
    }

    @Override
    public String toString() {
        NumberFormat currencyVN = NumberFormat.getCurrencyInstance();
        String str1 = currencyVN.format(moneyAccount);
        return idAccount+","+nameAccount+","+str1;
    }

    public double addMoneyAccount(double moneyAdd) {
        if (moneyAdd > 0) {
            return this.moneyAccount = this.moneyAccount + moneyAdd;
        } else {
            return Double.parseDouble("Số tiền bạn vừa nạp không hợp lệ");
        }
    }

    public double withdrawAccount(double moneyWithdraw) {
        if (moneyWithdraw > 0) {
            return this.moneyAccount = this.moneyAccount - moneyWithdraw;
        } else {
            return Double.parseDouble("Số tiền bạn vừa rút không hợp lệ");
        }
    }

    public double expireAccount() {
        return this.moneyAccount = this.moneyAccount + this.moneyAccount * INTEREST;
    }

    public void transMoney(Account account1, Account account2, double money) {
        account1.addMoneyAccount(money);
        account2.withdrawAccount(money);
    }

}
