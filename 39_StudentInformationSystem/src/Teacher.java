public class Teacher {
    String name;
    int mpno;
    String branch;

    Teacher(String name, int mpno, String branch){
        this.branch = branch;
        this.name = name;
        this.mpno = mpno;
    }

    void print(){
        System.out.println("Adı : " + this.name);
        System.out.println("Telefon Numarası : " + this.mpno);
        System.out.println("Branşı : " + this.branch);
    }
}
