import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Yamuk[] yamuklar = new Yamuk[10];
        Paralelkenar[] paralelkenarlar = new Paralelkenar[10];
        Dikdortgen[] dikdortgenler = new Dikdortgen[10];
        Kare[] kareler = new Kare[10];
    System.out.println("'Yamuk','Paralelkenar','Dikdörtgen','Kare' şekillerinden hangisini tanımlamak istediğinizi yazınız:");
     String choice=scanner.nextLine().toLowerCase();
        Nokta[] noktalar = new Nokta[4];
        for (int i = 0; i < 4; i++) {
            System.out.print((i + 1) + ". noktanın x koordinatını girin: ");
            int x = scanner.nextInt();
            System.out.print((i + 1) + ". noktanın y koordinatını girin: ");
            int y = scanner.nextInt();
            noktalar[i] = new Nokta(x, y); // Nokta nesnesi oluşturma
        }
         switch (choice){
             case "yamuk":
                yamuklar[0]=new Yamuk(noktalar[0],noktalar[1],noktalar[2],noktalar[3]);
                 System.out.println("Yamuk oluşturuldu.");

                 break;

             case "kare":
                 kareler[0] = new Kare(noktalar[0], noktalar[1], noktalar[2], noktalar[3]);
                 System.out.println("Kare oluşturuldu.");

                 break;

             case "paralelkenar":
                 paralelkenarlar[0] = new Paralelkenar(noktalar[0], noktalar[1], noktalar[2], noktalar[3]);
                 System.out.println("Paralelkenar oluşturuldu.");

                 break;

             case "dikdörtgen":
                 dikdortgenler[0] = new Dikdortgen(noktalar[0], noktalar[1], noktalar[2], noktalar[3]);
                 System.out.println("Dikdörtgen oluşturuldu.");

                 break;
             default:
                 System.out.println("Geçersiz şekil türü girdiniz!!");
                 break;
        }
        if (yamuklar[0] != null) {
            System.out.println("Yamuk alanı: " + yamuklar[0].calculateArea());
            System.out.println("Yamuk kütlesi: " + yamuklar[0].calculateKutle());

        }
        if (paralelkenarlar[0] != null) {
            System.out.println("Paralelkenar alanı: " + paralelkenarlar[0].calculateArea());
            System.out.println("Paralelkenar kütlesi: " + paralelkenarlar[0].calculateKutle());

        }
        if (dikdortgenler[0] != null) {
            System.out.println("Dikdörtgen alanı: " + dikdortgenler[0].calculateArea());
            System.out.println("Dikdörtgen kütlesi: " + dikdortgenler[0].calculateKutle());

        }
        if (kareler[0] != null) {
            System.out.println("Kare alanı: " + kareler[0].calculateArea());
            System.out.println("Kare kütlesi: " + kareler[0].calculateKutle());

        }


    }
}