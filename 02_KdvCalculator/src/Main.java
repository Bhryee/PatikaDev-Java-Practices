import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar, kdvTutar, kdvOran = 0.18, kdvliTutar ;
        Scanner input = new Scanner(System.in);
        System.out.print("Ücret tutarını giriniz: ");
        tutar = input.nextDouble();

        kdvTutar = tutar + kdvOran;
        kdvliTutar = tutar + kdvTutar;

        if(tutar < 1000){
            kdvOran = 0.18;

        }else{
            kdvOran = 0.08;
        }

        System.out.println("KDV'siz tutar: " + tutar);
        System.out.println("KDV oranı: " + kdvOran);
        System.out.println("KDV tutarı: " + kdvTutar);
        System.out.println("KDV'li tutar: " + kdvliTutar);
    }
}
