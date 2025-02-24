public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Bahriye", 777, "TRH");
        //t1.print();
        Teacher t2 = new Teacher("Cengiz", 111, "FZK");
        Teacher t3 = new Teacher("Rümeysa", 555, "MAT");

        Course tarih = new Course("Tarih", "101", "TRH", t1);
        Course fizik = new Course("Fizik", "102", "FZK", t2);
        fizik.printTeacher();
        Course matematik = new Course("Matematik", "103", "MAT", t3);
        //tarih.printTeacher();

        tarih.addTeacher(t1);

        Student s1 = new Student("Elif", "123", "4", tarih, fizik, matematik);
        s1.addBulkExamNote(100,200,50, 40, 40, 40);
        s1.printNote();
        s1.isPass();
    }
}