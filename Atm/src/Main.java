import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int hak = 3;
        int bakiye = 5000;
        int secim;
        while (hak > 0) {
            System.out.print("Kullanıcı Adınız :");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();

            if (userName.equals("batu") && password.equals("ba2")) {
                System.out.println("Paradoks Bankasına Hoş geldiniz!");
                do {
                    System.out.println("1-Para yatırma\n2-Para Çekme\n3-Bakiye Sorgula\n4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    secim = input.nextInt();
                    switch (secim) {
                        case 1:
                            System.out.print("Yatırmak istediğiniz para miktarı : ");
                            int eklenenpara = input.nextInt();
                            bakiye += eklenenpara;
                            System.out.println("Yeni Bakiyeniz:" +bakiye);
                            break;

                        case 2:
                            System.out.print("Çekmek istediğiniz para miktarı : ");
                            int cekilenpara = input.nextInt();
                            if (cekilenpara > bakiye) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                bakiye -= cekilenpara;
                                System.out.println("Kalan Bakiyeniz: "+bakiye);
                            }
                            break;

                        case 3:
                            System.out.println("Bakiyeniz : " + bakiye);
                            break;
                    }
                } while (secim != 4);
                System.out.println("Görüşmek Üzere...");
                break;
            }
            else {
                hak--;
                System.out.println("Hatalı kullanıcı adı veya şifre.");
                if (hak == 0) {
                    System.out.println("Hakkınız kalmadı.Hesabınız bloke olmuştur.");
                }
                else {
                    System.out.println("Kalan Hak : " + hak);
                }
            }
        }
    }
}