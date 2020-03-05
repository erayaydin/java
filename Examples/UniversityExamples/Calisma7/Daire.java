class Daire extends Ev
{
    public int kat;
    public int toplamKat;

    public Daire(String isim) {
        super(isim);
    }

    public void asansorBin() {
        System.out.println(isim + " dairesine çıkmak için asansöre binildi");
    }
}
