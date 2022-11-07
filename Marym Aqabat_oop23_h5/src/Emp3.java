public class Emp3 {

    private  String name;
    private  double salary;
    public Emp3(String name, double salary)
    {
        this.name=name;
        this.salary=salary;
    }
    public Emp3(){
        this("",0);}
    public  String getName()
    {return  name;}
    public  double getSalary()
    {return  salary;}
    public void  raiseSalary(double byPercent)
    {
        salary=salary+salary*(byPercent/100);
    }
}

