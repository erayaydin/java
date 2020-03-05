abstract class Dosya
{
    public String isim;
    public int boyut;

    public abstract void dosyaAc();
    
    public String detay()
    {
        return "Dosya İsmi: " + isim + "\n" + 
            "Dosya Boyutu: " + boyut;
    }

    public void dosyaSil() {
        System.out.println(isim + " dosyası siliniyor...");
    }
}

abstract class ResimDosyasi extends Dosya
{
    public String[] etiketler;
}

class PNG extends ResimDosyasi
{
    public void dosyaAc()
    {
        System.out.println("PNG dosyasını açmak için pngviewer programı kullanılıyor...");
    }

    public String detay()
    {
        return super.detay()+"\n"+"Dosya Uzantısı: PNG";
    }
}

class JPEG extends ResimDosyasi
{
    public void dosyaAc()
    {
        System.out.println("JPEG dosyasını açmak için jpgviewer programı kullanılıyor...");
    }

    public String detay()
    {
        return super.detay() + "\n" + "Dosya Uzantısı: JPEG";
    }
}

class GIF extends ResimDosyasi implements HareketliGoruntu
{
    public void dosyaAc()
    {
        System.out.println("GIF dosyasını açmak için gifviewer programı kullanılıyor...");
    }

    public String detay()
    {
        return super.detay() + "\n" + "Dosya Uzantısı: GIF";
    }

    public String[] getKareler()
    {
        String[] kareler = new String[3];
        kareler[0] = "kare1";
        kareler[1] = "kare2";
        kareler[2] = "kare3";

        return kareler;
    }
}

class Klasor
{
    public String isim;
    public Dosya[] dosyalar;

    public void listele() {
        for(Dosya dosya : dosyalar) {
            System.out.println(dosya.detay());
        }
    }
}

interface HareketliGoruntu
{
    public String[] getKareler();
}

class Calisma10
{
    public static void main(String[] args) {
        Klasor resimlerim = new Klasor();
        resimlerim.isim = "Güzel Resimlerim";

        resimlerim.dosyalar = new Dosya[2];
        
        PNG dagResmi = new PNG();
        dagResmi.isim = "dag-resmi.png";
        dagResmi.boyut = 10;

        GIF komikliGif = new GIF();
        komikliGif.isim = "komikli-gif-burada.gif";
        komikliGif.boyut = 30;

        resimlerim.dosyalar[0] = dagResmi;
        resimlerim.dosyalar[1] = komikliGif;

        klasoruListele(resimlerim);
        klasorunTumunuAc(resimlerim);
        klasordekiHareketlileriOynat(resimlerim);
    }

    public static void klasoruListele(Klasor hangiKlasor)
    {
        System.out.println(hangiKlasor.isim);
        System.out.println("---");
        for(Dosya klasorIcindekiDosya : hangiKlasor.dosyalar) {
            System.out.println(klasorIcindekiDosya.detay());
            System.out.println();
        }
    }

    public static void klasorunTumunuAc(Klasor klasor)
    {
        for(Dosya dosya : klasor.dosyalar) {
            dosya.dosyaAc();
        }
    }

    public static void klasordekiHareketlileriOynat(Klasor klasor)
    {
        System.out.println(klasor.isim+" klasöründeki hareketli dosyalar oynatılacak!");
        for(Dosya dosya : klasor.dosyalar) {
            System.out.println(dosya.isim+" dosyası kontrol ediliyor...");
            if(dosya instanceof HareketliGoruntu) {
                System.out.println("bu dosya hareketli görüntü dosyası.");
                HareketliGoruntu hg = (HareketliGoruntu) dosya;
                String[] kareler = hg.getKareler();

                for(String kare : kareler) {
                    System.out.println(kare);
                }
            }
        }
    }
}

