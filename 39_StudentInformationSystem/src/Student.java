public class Student {
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;
    Course c1, c2, c3;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        avarage = 0.0;
        isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3, int verbalNote1, int verbalNote2, int verbalNote3){
        if(note1 >= 0 && note1 <= 100){
            this.c1.note = note1;
        }

        if(note2 >= 0 && note2 <= 100){
            this.c2.note = note2;
        }

        if(note3 >= 0 && note3 <= 100){
            this.c3.note = note3;
        }

        if(verbalNote3 >= 0 && verbalNote3<= 100){
            this.c3.verbalNote = verbalNote3;
        }

        if(verbalNote2 >= 0 && verbalNote2<= 100){
            this.c2.verbalNote = verbalNote2;
        }

        if(verbalNote1 >= 0 && verbalNote1<= 100){
            this.c1.verbalNote = verbalNote1;
        }


    }
// Fizik Ortalaması : (90 * 0.20) + (60* 0.80);
    void calcAvarage(){
        double course1 = (this.c1.verbalNote * 0.20) + (this.c1.note * 0.80);
        double course2 = (this.c2.verbalNote * 0.20) + (this.c2.note * 0.80);
        double course3 = (this.c3.verbalNote * 0.20) + (this.c3.note * 0.80);
        this.avarage = (course1+course2+course3) / 3.0;

    }

    void isPass(){
        calcAvarage();
        if(this.avarage > 60){
            System.out.println("Sınıfı Geçti");
            this.isPass = true;
        }else{
            System.out.println("Sınıfta kaldı");
            this.isPass = false;
        }
        printNote();

    }

    void printNote(){
        System.out.println( c1.name + " Sınav Notu: " + this.c1.note);
        System.out.println( c2.name + " Sınav Notu: " + this.c2.note);
        System.out.println( c3.name + " Sınav Notu: " + this.c3.note);
        System.out.println( c1.name + " Sözlü Notu: " + this.c1.verbalNote);
        System.out.println( c2.name + " Sözlü Notu: " + this.c2.verbalNote);
        System.out.println( c3.name + " Sözlü Notu: " + this.c3.verbalNote);
        System.out.println( "Ortalama : " + this.avarage );

    }

}
