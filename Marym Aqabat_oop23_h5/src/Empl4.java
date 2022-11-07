import java.util.Scanner;

public class Empl4 {
    public static void main(String[] args) {
        double salary,byPercent;
        String name;
        Scanner in=new Scanner(System.in);
        System.out.println("Input name:");
        name=in.next();
        System.out.println("Input salary:");
        salary=in.nextDouble();
        System.out.println("Input by percent:");
        byPercent=in.nextDouble();
        Emp3 emp=new Emp3(name,salary);
        emp.raiseSalary(byPercent);
        System.out.println("Name:"+emp.getName()+"      Salary="+emp.getSalary());
    }
}
