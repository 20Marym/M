public class Savingsaccounttester7 {

    public static void main(String[] args) {
        Bankaccoun2 s=new Bankaccoun2(1000);
        s.addInsert(10);
        System.out.println("Resulting balance="+s.getbalance());
        System.out.println("Expected result="+1100);

    }



}
