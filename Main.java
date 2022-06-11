package Employee;

public class Main {


    public static void main(String[] args) {
        Employee kemal =new Employee("Kemal",2000,45,1985);
        Employee ali =new Employee("ali",1500,39,1990);
        Employee ayse =new Employee("ayse",1200,41,1998);
        Employee zeynep =new Employee("zeynep",999,30,2005);

        double vergi= ali.tax(ali.salary);
        double  bonus= ali.bonus(ali.workHours);
        double raiseSalary= ali.raiseSalary(ali.hireYear,ali.salary);
        double vergi_bonus =  ali.taxAndBonus(vergi,bonus,ali.salary);
        double toplamMaas= ali.totalPrice(vergi_bonus,raiseSalary);

       kemal.toString(ali.name, ali.salary, ali.workHours, ali.hireYear,vergi,bonus,raiseSalary,vergi_bonus,toplamMaas);


    }
}
