class Dongucu
{
    public static void say(int sayi1, int sayi2)
    {
        if(sayi1>=sayi2){
            for(int i=sayi1; i>=sayi2; i--) {
                System.out.println(i);
            }
        } else {
            for(int i=sayi2; i>=sayi1; i--) {
                System.out.println(i);
            }
        }
    }

    public static void sayWhile(int sayi1, int sayi2)
    {
        if(sayi1>=sayi2) {
            int i=sayi1;
            while(i>=sayi2){
                System.out.println(i);
                i--;
            }
        } else {
            int i=sayi2;
            while(i>=sayi1){
                System.out.println(i);
                i--;
            }
        }
    }
}

