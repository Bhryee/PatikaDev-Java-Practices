import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int r, a;
        double pi = 3.14, area, perimeter;

        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz : ");
        r = input.nextInt();
        System.out.print("Dairenin merkez açısının ölçüsünü giriniz : ");
        a = input.nextInt();

        perimeter = r * r * pi;
        area = (pi * (r * r) * a) / 360 ;

        System.out.println("Dairenin Alanı: " + area);
        System.out.println("Dairenin Çevresi: " + perimeter);
    }
}