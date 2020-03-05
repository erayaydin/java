import java.util.Scanner;

class Calisma
{
    public static void main(String[] args) {

        Scanner okuyucu = new Scanner(System.in);

        System.out.print("1. Aracın Hızı: ");
        Integer arac1 = okuyucu.nextInt();

        System.out.print("2. Aracın Hızı: ");
        Integer arac2 = okuyucu.nextInt();

        System.out.print("Kaç saat: ");
        Integer saat = okuyucu.nextInt();

        //Integer mesafe = araclarArasindakiMesafe(arac1, arac2, saat);
        //System.out.println("Aralarındaki mesafe: " + mesafe);
        araclarArasindakiM(arac1, arac2, saat);
    }

    public static Integer araclarArasindakiMesafe(Integer arac1, Integer arac2, Integer saat)
    {
        Integer sonuc;
        if(arac2 > arac1) {
            sonuc = (arac2-arac1)*saat;
        } else {
            sonuc = (arac1-arac2)*saat;
        }
        return sonuc;
    }

    public static void araclarArasindakiM(Integer arac1, Integer arac2, Integer saat)
    {
        Integer sonuc;
        if(arac2 > arac1) {
            sonuc = (arac2-arac1)*saat;
        } else {
            sonuc = (arac1-arac2)*saat;
        }

        System.out.println("Aralarındaki Mesafe: " + sonuc);
    }
}
