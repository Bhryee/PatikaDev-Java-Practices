import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a,b,c;
        Scanner input = new Scanner(System.in);

        System.out.print("Üçgenin 1.kenarının uzunluğunu giriniz: ");
        a = input.nextDouble();

        System.out.print("Üçgenin 2.kenarının uzunluğunu giriniz: ");
        b = input.nextDouble();

        System.out.print("Üçgenin 3.kenarının uzunluğunu giriniz: ");
        c = input.nextDouble();

        double e = (a + b + c) / 2;

        double area = Math.sqrt(e * (e - a) * (e - b) * (e - c));

        System.out.println("Üçgenin alanı: " + area);

    }
}