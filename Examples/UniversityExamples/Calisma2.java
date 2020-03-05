import java.util.Scanner;

class Calisma2
{
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        System.out.print("1. Araç: ");
        Integer arac1 = oku.nextInt();

        System.out.print("2. Araç: ");
        Integer arac2 = oku.nextInt();

        System.out.print("Zaman: ");
        Integer zaman = oku.nextInt();

        System.out.print("1. Araç Yön: ");
        String arac1Yon = oku.next();

        System.out.print("2. Araç Yön: ");
        String arac2Yon = oku.next();

        hesapla1(arac1, arac2, zaman, arac1Yon, arac2Yon);
    }

    public static Integer hesapla(Integer x1, Integer x2, Integer t, String furkan, String dorukhan) {
        if(furkan.equals(dorukhan)){
            if(x1>x2)
                return (x1-x2)*t;
            return (x2-x1)*t;
        }

        return (x1+x2)*t;
    }

    public static void hesapla1(Integer x1, Integer x2, Integer t, String path1, String path2) {
        Integer sonuc = hesapla(x1, x2, t, path1, path2);
        System.out.println("Hesaplama: " + sonuc);
    }
}

