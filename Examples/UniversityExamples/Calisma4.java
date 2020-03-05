import java.util.Scanner;

class Calisma4
{
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        System.out.print("Değer 1: ");
        int deger1 = oku.nextInt();

        System.out.print("Değer 2: ");
        int deger2 = oku.nextInt();

        // Dongucu.say(deger1, deger2);
        Dongucu dorukhan = new Dongucu();
        dorukhan.sayWhile(deger1, deger2);
    }
}

