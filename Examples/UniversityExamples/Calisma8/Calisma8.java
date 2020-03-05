class Calisma8 {

    public static void main(String[] args) {
        Ogunler.KAHVALTI.yemekYe();
        Ogunler.AKSAM.yemekYe();
    }

}

enum Ogunler {
    KAHVALTI("Yumurta"), OGLE("Makarna"), AKSAM("Döner"), GECE("Şırdan");

    protected String yemek;

    Ogunler(String yemek) {
        this.yemek = yemek;
    }

    public void yemekYe() {
        System.out.println(this.yemek+" yemeği yeniyor...");
    }
}
