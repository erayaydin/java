class Calisma7 {

    public static void main(String[] args) {

        Ev normalEv = new Ev("Normal Ev");
        normalEv.odaSayisi = 5;
        normalEv.m2 = 100;
        normalEv.banyoSayisi = 1;

        BahceliEv bahceliEv = new BahceliEv("Bahçeli Ev");
        bahceliEv.odaSayisi = 3;
        bahceliEv.m2 = 120;
        bahceliEv.banyoSayisi = 2;
        bahceliEv.bahceM2 = 30;
        bahceliEv.cicekler = "Papatya";
        bahceliEv.kopekler = "Fino";

        Daire daire = new Daire("Apartman Dairesi");
        daire.odaSayisi = 2;
        daire.m2 = 90;
        daire.banyoSayisi = 1;
        daire.kat = 2;
        daire.toplamKat = 5;

        ziyaretEdelim(daire);

        daire.asansorBin();
        bahceliEv.sula();
        bahceliEv.ziyaretEt();
        normalEv.ziyaretEt();
        bahceliEv.kopekSev();
    }

    public static void ziyaretEdelim(Ev gidilecek) {
        gidilecek.ziyaretEt();
    }

}
