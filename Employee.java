package Employee;

public class Employee {

    String name;      //Çalışanın adı ve soyadı
    int salary;         //Çalışanın maaşı
    int workHours;        // Haftalık çalışma saati
    int   hireYear;      // İşe başlangıç yılı

    public Employee(String name,int salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
        }


    public double tax(double tx){
        if (tx>1000){
             tx *= 0.03;
             return tx;
        }
        else
            return 1;
    }


    public double bonus(double bns){
        if (bns>40){
            bns=(bns-40)*30;
        return bns;
        }
        else return 0;

    }
    public double raiseSalary(double raise,double a){
         if ((2021-raise)<=9)
         {
             raise=a*0.05;
        return raise;
        } else if ((2021-raise)>10 &&(2021-raise)<=19) {
             raise=a*0.10;
             return raise;
         }
         else {
             raise=a*0.15;
             return raise;
         }
        }
        public double taxAndBonus(double tx,double bns , double c)
        {
            c =c+(bns-tx);
            return c;
        }

        public double totalPrice(double a ,double c){
                c+=a;
        return c ;
        }
    public String toString(String name,double a,int b,int c,double d,double e,double f,double g,double h){
         System.out.println("Adı :"+name+"\n" +
                ""+"Maasi :"+a+"\n" +
                ""+"Calısma Saati :"+ b+"\n"+
                 "Baslangıc Yılı :"+ c+"\n"+"Vergi :"+d+"\n"+
                 "Bonus :"+e+"\n"+"Maas Artisi :"+f+"\n"+
                 "Vergi ve Bonuslar ile birlikte maas :"+g+"\n"+
                 "Toplam Maas :"+h);

        return name;
    }

}
   /* public String ToString(String name,double a,double b,double c,double d,double e,double f,double g,double h){
        System.out.println("Adı :"+name+"\n"+"Maasi :"+a+"\n"+"Calısma Saati :"+ b+"\n"+"Başlangıç Yılı :"+ c+"\n"+"Vergi"+d+"\n"+"Bonus :"+e+"\n"+"Maaş Artisi :"+f+"\n"+"Vergi ve Bonuslar ile birlikte maaş :"+g+"\n"+"Toplam Maaş :"+h);
        return toString();

    */