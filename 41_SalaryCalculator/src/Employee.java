public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    double bonus;
    double tax;
    double raiseSalary;

    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    /*
    Maaşa uygulanan vergiyi hesaplayacaktır.
    Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
    Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.
     */
    void tax(){
        if(this.salary < 1000){
            System.out.println(0.0);
        }else{
            this.tax = this.salary * 0.03;
            System.out.println(this.tax);
        }
    }


    /*
    Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı
    her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
     */
    void bonus(){
        if(this.workHours < 40){
            System.out.println(0.0);
        }else{
            this.bonus = (this.workHours - 40) * 30;
            System.out.println(this.bonus);
        }
    }

    /*
    Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
    Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
    Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
    Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
     */
    void raiseSalary(){
        if((2021 - this.hireYear) < 10){
            this.raiseSalary = this.salary * 0.05;
        }else if((2021 - this.hireYear) < 20){
            this.raiseSalary = this.salary * 0.10;
        }else{
            this.raiseSalary = this.salary * 0.15;
        }
    }

    // Çalışana ait bilgileri ekrana bastıracaktır.
    void print(){
        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Baslangıc Yılı: " + this.hireYear);
        System.out.println("Vergi Tutar: " + this.tax);
        System.out.println("Bonus: " + this.bonus);
        System.out.println("Maas Artışı: " + this.raiseSalary);
        System.out.println("Vergi ve Bonuslarla Maaş: " + ((this.salary - this.tax) + this.raiseSalary));
        System.out.println("Toplam Maaş: " + ((this.salary - this.tax) + this.bonus + this.raiseSalary));
    }
}
