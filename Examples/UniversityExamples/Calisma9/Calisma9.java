class Birlik
{
    public int can = 100;
}

class Okcu extends Birlik implements HareketliBirlik, SaldiriBirligi
{
    public int okSayisi = 30;

    @Override
    public void hareketEt() {
        System.out.println("okçu birliği " + hareketHizi + " ile gidiyor!");
    }

    @Override
    public void saldir() {
        okSayisi--;
        System.out.println("okçu birliği " + saldiriGucu + " saldırı gücü ile saldırıyor!");
    }
}

class Savasci extends Birlik implements HareketliBirlik
{
    public boolean kilicDustuMu = false;

    @Override
    public void hareketEt() {
        System.out.println("savaşçı birliği " + hareketHizi + " ile gidiyor!");
    }
}

class Suvari extends Birlik implements HareketliBirlik
{
    public boolean atOlduMu = false;

    @Override
    public void hareketEt() {
        System.out.println("süvari birliği " + hareketHizi + " ile gidiyor!");
    }
}

interface HareketliBirlik
{
    public int hareketHizi = 3;

    public void hareketEt();
}

interface SaldiriBirligi
{
    public int saldiriGucu = 5;
    
    public void saldir();
}

class Calisma9
{
    public static void main(String[] args) {
        Savasci s1 = new Savasci();
        Okcu o1 = new Okcu();
        Suvari su1 = new Suvari();

        hareketEttir(su1);
        saldirt(o1);
    }

    public static void hareketEttir(HareketliBirlik birlik) {
        birlik.hareketEt();
    }

    public static void saldirt(SaldiriBirligi birlik) {
        birlik.saldir();
    }
}

