class BahceliEv extends Ev
{
    public int bahceM2;
    public String cicekler;
    public String kopekler;

    public BahceliEv(String isim) {
        this.isim = "Bahçeli " + isim;
    }

    public void sula() {
        System.out.println(isim + " bahçeşi sulanıyor...");
    }
    
    public void kopekSev() {
        System.out.println(isim + " bahçesindeki köpek seviliyor...");
    }

    public void ziyaretEt() {
        System.out.println("bahçeden geçiliyor...");
        super.ziyaretEt();
    }
}
