class Calisma6 {

    public static void main(String[] args) {
        /*
        Insan dorukhan = new Insan();
        dorukhan.isim = "Dorukhan";
        */
        Insan dorukhan = new Insan("Dorukhan");

        Insan furkan = new Insan();
        furkan.isim = "Furkan";

        dorukhan.selam();
        furkan.selam();
        Insan.selam();
    }

}

class Insan {

    public static String isim;

    public static void selam()
    {
        System.out.println("Merhaba, ben " + isim);
    }

    // Constructor metodu, nesne üretilirken bu metot tetikleniyor.
    public Insan() {
        System.out.println("İsimsiz bir insan üretiliyor...");
    }

    // İstersem parametre alıp bununla işlem yapabilirim.
    public Insan(String isim) {
        System.out.println("İsimli bir insan üretiliyor...");
        this.isim = isim;
    }

}
