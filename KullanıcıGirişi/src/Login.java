import  java.util.Scanner;
public class Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kullanıcıad="Patika",sifre = "java123";
        System.out.print("Kullanıcı adınızı giriniz: ");
        kullanıcıad = input.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        sifre = input.nextLine();

        if (kullanıcıad.equals("Patika") && sifre.equals("java123")){
            System.out.println("Sisteme başarıyla giriş yapıldı");
        }
        else if(kullanıcıad.equals("Patika")&& sifre != "java123" ){
            String islem;
            System.out.print("Şifreniz yalnış. Şifrenizi sıfırlamak için E, çıkmak için H basınız:");
            islem=input.nextLine();
            if(islem.equals("E")){
                String yenisifre;
                System.out.print("Yeni Şifrenizi giriniz:");
                yenisifre = input.nextLine();
                if(yenisifre.equals("java123")){
                    System.out.println("Şifre oluşturulamadı,lütfen eski şifrenizden farklı şifre giriniz.");

                }
                else
                    System.out.println("Yeni şifre başarıyla oluşturuldu.");
            }
            else
                System.out.println("Sistemden çıkış yapılıyor...");

        }
    }
}
