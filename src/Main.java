import javax.swing.*;
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String username, password = "java123",inputPassword;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz: ");
        username = input.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        inputPassword = input.nextLine();

        if (username.equals("patika") && inputPassword.equals("java123")) {
            System.out.println("Giriş yaptınız.");
        } else {
            System.out.println("Kullanıcı adınız veya şifreniz yanlış.");

            int select;

            System.out.println("Şifrenizi sıfırlamak ister misiniz?\n1-Evet\n2-Hayır ");
            select = input.nextByte();
            switch (select) {
                case 1:
                    String newPasword  ;
                    Scanner input2 = new Scanner(System.in);
                    System.out.print("Yeni sifre oluşturunuz:");
                    newPasword = input2.nextLine();
                    if(newPasword.equals(inputPassword)){
                        System.out.println("Yeni şifre hatalı girilen şifre ile aynı olamaz.");
                    }else if(newPasword.equals(password)){
                        System.out.println("Yeni şifre eski şifre ile aynı olamaz.");
                    }else{
                        System.out.println("Şifre başarıyla oluşturuldu.");
                    }
                    break;

                case 2:
                    System.out.println("Şifre sıfırlama işlemi iptal edildi.");
            }
        }
    }
}