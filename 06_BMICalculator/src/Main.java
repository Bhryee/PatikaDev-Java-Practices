import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double height, weight;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        height = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : : ");
        weight = input.nextDouble();

        double bmi = weight / (height * height);

        System.out.println("Vücut Kitle İndeksiniz : " + bmi);
    }
}
// Kilo (kg) / Boy(m) * Boy(m)