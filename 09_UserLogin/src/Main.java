import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName, originalPassword = "bahriye123", password;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz : ");
        userName = input.nextLine();
        System.out.print("Şifrenizi giriniz : ");
        password = input.nextLine();

        if(userName.equals("Bahriye") && password.equals("bahriye123")){
            System.out.println("Giriş Yaptınız!");
        }else{
            System.out.println("Şifre Hatalı!\nŞifrenizi değiştirmek için 1 çıkış yapmak için 2 sayısını giriniz.");
            int state = input.nextInt();

            switch (state){
                case 1:
                    System.out.print("Yeni Şifreyi giriniz : ");
                    String newPassword = input.next();
                    if (!newPassword.equals(originalPassword)) {
                        System.out.print("Şifre oluşturuldu");
                    } else {
                        System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    }
                    break;

                case 2:
                    System.out.println("Çıkış Yaptınız. ");
                    break;
                default:
            }

        }





    }
}

