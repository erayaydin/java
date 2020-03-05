class Ev
{
    public String isim;
    public int odaSayisi;
    public int m2;
    public int banyoSayisi;

    public Ev(String isim) {
        this.isim = isim;
    }

    public Ev() {
    }

    public void ziyaretEt() {
        System.out.println(isim + " evi ziyaret ediliyor...");
    }

    public void dusAl() {
        System.out.println(isim + " evinde duş alınıyor...");
    }


}

