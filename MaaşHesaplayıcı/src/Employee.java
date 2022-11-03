public class Employee {
    String name;
    double salary,hireYear;
    int workHours;
    Employee(String name,double salary,int workHours,double hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    double tax(){
        double vergi;
        if(this.salary < 1000){
            vergi =0;
        }else
            vergi =  this.salary *0.03;
        return vergi;
    }
    double bonus(){
        double bonus;
        if(this.workHours >40){
            bonus = ((this.workHours-40) * 30);
        }
        else
            bonus =0 ;
        return bonus;
    }
    double raiseSalary(){
        int year = 2021;
        if(year - this.hireYear <=9){
            return this.salary *0.05;
        }
        else if (10<= year-this.hireYear && year-this.hireYear <=19){
           return   this.salary *0.10;
        }
        else if(19< year-this.hireYear){
            return this.salary *0.15;
        }
        return this.salary;
    }
    void print(){
        System.out.println("Adı: "+this.name);
        System.out.println("Maaşı: "+this.salary);
        System.out.println("Çalışma Saati: "+this.workHours);
        System.out.println("Başlangıç yılı: "+this.hireYear);
        System.out.println("Vergi: "+tax());
        System.out.println("Bonus: "+bonus());
        System.out.println("Maaş Artışı: "+raiseSalary());
        System.out.println("vergi ve bonuslar ile maaş: "+(this.salary+bonus()-tax() ));
        System.out.println("Toplam maaş: "+(this.salary+bonus()+raiseSalary()-tax()));
    }
}
