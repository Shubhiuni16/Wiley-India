import java.util.*;
abstract class BankAccount{
    abstract void withdrawAmount(int money);
    abstract void displayAccountBalance();
    abstract void depositMoney(int money);

    final String showCurrencyType(){
        final String currencyType="INR";
        return currencyType;
    }
}

class SBIbank extends BankAccount{
    int accountBalance;
    private int charges=10;
    SBIbank(){
        this.accountBalance=10000;
    }
    SBIbank(int accountBalance){
        this.accountBalance=accountBalance;
    }
    @Override
    void displayAccountBalance(){
        System.out.println("AVAILABLE BALANCE IS: "+accountBalance+showCurrencyType());
    }
    @Override
    void depositMoney(int money){
        accountBalance+=money;
        System.out.println("MONEY ADDED TO ACCOUNT: "+money+showCurrencyType());

    }
    @Override
    void withdrawAmount(int money){
        accountBalance=accountBalance-money-charges;
        System.out.println("MONEY WITHDRAWN FROM ACCOUNT: "+money+showCurrencyType()+" CHARGES: "+charges+showCurrencyType());
    }
}

class PNBbank extends BankAccount{
    private int accountBalance;
    private int charges=50;
    PNBbank(){
        this.accountBalance=20000;
    }
    PNBbank(int accountBalance){
        this.accountBalance=accountBalance;
    }
    @Override
    void displayAccountBalance(){
        System.out.println("AVAILABLE BALANCE IS: "+accountBalance+showCurrencyType());
    }
    @Override
    void depositMoney(int money){
        accountBalance+=money;
        System.out.println("MONEY ADDED TO ACCOUNT: "+money+showCurrencyType());
    }
    @Override
    void withdrawAmount(int money){
        accountBalance=accountBalance-money-charges;
        System.out.println("MONEY WITHDRAWN FROM ACCOUNT: "+money+showCurrencyType()+" CHARGES: "+charges+showCurrencyType());
    }
}

public class Bank{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("TYPE INITIAL AMOUNT FOR PNB: ");
        int pnb_initialDeposit=sc.nextInt();
        sc.close();

        PNBbank pnb=new PNBbank(pnb_initialDeposit);
        SBIbank sbi=new SBIbank();

        sbi.displayAccountBalance();
        sbi.withdrawAmount(500);
        sbi.displayAccountBalance();
        sbi.depositMoney(1000);
        sbi.displayAccountBalance();
        System.out.println();
        pnb.displayAccountBalance();
        pnb.withdrawAmount(500);
        pnb.displayAccountBalance();
        pnb.depositMoney(1000);
        pnb.displayAccountBalance();
        
    }
}