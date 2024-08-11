public class CashRegister {
    public static final double QUARTER_VALUE = 0.50;
    public static final double DINE_VALUE = 0.1;
    public static final double NICKEL_VALUE = 0.05;
    public static final double PENNY_VALUE = 0.01;

    private double purchase;
    private double payment;

    public CashRegister(double purchase,double payment) {
        this.purchase = purchase;
        this.payment = payment;
    }
    public CashRegister()
    {
        purchase =0.0;
        payment = 0.0;
    }
    public void recordPurchase(double amount)
    {
        purchase = purchase + amount;
    }
    public void recievePayment(int dollars, int quarters, int dines, int nickels, int pennies)
    {
      payment = dollars + quarters * QUARTER_VALUE + dines * DINE_VALUE + nickels * NICKEL_VALUE + pennies * PENNY_VALUE;
    }
    public double giveChange()
    {
        double change = payment - purchase;
        purchase = 0.0;                       //purchase ekhn 0
        return change;
    }

    public static void main(String[] args) {
        CashRegister cashRegister1 = new CashRegister();
        CashRegister cashRegister2 = new CashRegister(3.0,2.0);

        cashRegister1.recordPurchase(20);
        cashRegister1.recordPurchase(20);
        cashRegister1.recordPurchase(20);
        //cashRegister1.recievePayment(9,2,5,6);

        double change = cashRegister1.giveChange();
        System.out.printf("%.2f\n",change);

        cashRegister2.recordPurchase(2);
        cashRegister2.recordPurchase(2.3);
        cashRegister2.recordPurchase(1.67);
        cashRegister2.recordPurchase(3.67);
        cashRegister2.recievePayment(20,4,5,3,6);

        change = cashRegister2.giveChange();
        System.out.printf("%.2f",change);

    }
}
