class Calisma11
{
    public static void main(String[] args) {
        Koleksiyon<int> sayilar = new Koleksiyon<int>(3);
        sayilar.ekle(3);
        sayilar.ekle(2);
        sayilar.ekle(5);

        if(sayilar.bulunuyorMu(5)){
            System.out.println("5 sayısı bulunuyor");
        }

        Koleksiyon<String> insanlar = new Koleksiyon<String>(3);
        insanlar.ekle("Furkan");
        insanlar.ekle("Dorukhan");
        insanlar.ekle("Mehmet");

        if(insanlar.bulunuyorMu("Dorukhan")){
            System.out.println("dorukhan var");
        }
    }
}

class Koleksiyon<T>
{
    private int i=0;
    protected T[] dizi;

    public Koleksiyon(int adet) {
        dizi = new T[adet];
    }

    public void ekle(T deger)
    {
        dizi[i] = deger;
        i++;
    }

    public boolean bulunuyorMu(T deger)
    {
        for(T eleman : dizi) {
            if(eleman == deger){
                return true;
            }
        }
        return false;
    }
}
