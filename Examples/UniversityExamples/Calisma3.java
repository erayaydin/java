import java.util.Scanner;

class Calisma3
{
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        System.out.print("Kenar1: ");
        double kenar1 = oku.nextDouble();

        System.out.print("Kenar2: ");
        double kenar2 = oku.nextDouble();

        System.out.print("Derece: ");
        double derece = oku.nextDouble();

        hesaplama(kenar1, kenar2, derece);
    }

    public static void hesaplama(double x, double y, double derece)
    {
        double sonuc = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) - (2*x*y*Math.cos(Math.toRadians(derece))));

        if(sonuc < 0)
            sonuc = sonuc*(-1);

        System.out.println("Sonuç = " + sonuc);
    }
}
