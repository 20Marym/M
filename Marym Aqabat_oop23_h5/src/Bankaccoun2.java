public class Bankaccoun2 {
    private  double balance;
    public Bankaccoun2(double initialbalance){
        balance=initialbalance;}
    public Bankaccoun2(){
        this(0);}
    public void mystery(Bankaccoun2 that, double amount)
    {this.balance=this.balance-amount;
        that.balance=that.balance+amount;
    }
    public void  deposit(double balance){
        this. balance=this.balance+balance;
    }
    public void  withdraw(double amount){
        balance=balance-amount;
    }
    public double  getbalance(){
        return balance;
    }
    public  void addInsert(double rate)
    {
        balance=balance+balance*(rate/100);
    }
    public  void deduct(int n)
    {   if (n>5)
        balance=balance-n+5;}
}
