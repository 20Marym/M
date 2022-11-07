public class Bankaccount1 {
    public static void main(String[] args) {
        Bankaccoun2 b=new Bankaccoun2();
        b.deposit(1000);
        b.withdraw(500);
        b.withdraw(400);
        System.out.println("The expected result=100");
        System.out.println(b.getbalance());
    }

}
