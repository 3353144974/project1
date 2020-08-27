package operation.As7._06;

public class Company implements Money{
    double zj=1000000;
    public void paySalary(Employee employee){
        zj=(zj-employee.xz);
      System.out.println("给"+employee.name+"发工资 "+employee.xz+" 元，公司剩余"+zj);
  }
}
