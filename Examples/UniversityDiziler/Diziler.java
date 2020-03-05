import java.util.Arrays;
import java.util.ArrayList;

public class Diziler
{

    public static void main(String[] args) {

        /*
        int[] dizi1 = new int[10];
        int[] dizi2 = { 12, 15, 8, 9, 45 };
        int[] dizi3;

        dizi3 = new int[10];

        for (int i=0; i < dizi2.length; i++) {
            System.out.println("dizi2 "+i+" indeksi "+dizi2[i]);
        }

        int elemanSayisi = dizi2.length;

        for (int sayi : dizi2) {
            System.out.println(sayi);
        }

        int[][] dizi4 = new int[5][5];
        int[][][] dizi5 = new int[5][5][30];

        int[][] dizi6 = { {1,2}, {3,5} };
        */

        ArrayList<Integer> arr = new ArrayList<Integer>();

        while(true){
            arr.add(1);
            System.out.println(arr.size()+"="+ObjectSizeFetch.getObjectSize(arr));
        }

    }
}
