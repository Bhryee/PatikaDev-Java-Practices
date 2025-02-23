import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int kilo_a, kilo_t, kilo_b, kilo_p, kilo_e;
        double apple = 3.67, tomato = 1.11, banana = 0.95, pear = 2.14, eggplant = 5.0;

        Scanner input = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo? : ");
        kilo_p = input.nextInt();
        System.out.print("Elma Kaç Kilo? : ");
        kilo_a = input.nextInt();
        System.out.print("Domates Kaç Kilo? : ");
        kilo_t = input.nextInt();
        System.out.print("Muz Kaç Kilo? : ");
        kilo_b = input.nextInt();
        System.out.print("Patlıcan Kaç Kilo? : ");
        kilo_e = input.nextInt();

        double total = (kilo_a * apple) + (kilo_t * tomato) + (kilo_b * banana) + (kilo_p * pear) + (kilo_e * eggplant);

        System.out.println("Toplam Tutar : " + total);
    }
}
