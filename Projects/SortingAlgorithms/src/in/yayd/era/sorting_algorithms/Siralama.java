package in.yayd.era.sorting_algorithms;

import java.util.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Siralama {

    private static Map<Integer, Integer[]> ornek_diziler;

    enum Algoritma {
        BUBBLE_SORT,
        INSERTION_SORT,
        SELECTION_SORT,
        COUNT_SORT,
        MERGE_SORT,
        QUICK_SORT
    }

    public static Map<Integer, Integer[]> GetOrnekDiziler()
    {
        return ornek_diziler;
    }

    public static void SetOrnekDiziler(Map<Integer, Integer[]> ornek_diziler)
    {
        Siralama.ornek_diziler = ornek_diziler;
    }

    static void Olustur()
    {
        ornek_diziler = new TreeMap<>();
        ornek_diziler.put(100, diziOlustur(100));
        ornek_diziler.put(1000, diziOlustur(1000));
        ornek_diziler.put(10000, diziOlustur(10000));
        ornek_diziler.put(100000, diziOlustur(100000));
        ornek_diziler.put(1000000, diziOlustur(1000000));
    }

    static void OrnekDizileriKaristir()
    {
        for(Map.Entry<Integer, Integer[]> ornek_dizi : ornek_diziler.entrySet()){
            List<Integer> intList = Arrays.asList(ornek_dizi.getValue());
            Collections.shuffle(intList);
            intList.toArray(ornek_dizi.getValue());
        }
    }

    private static Integer[] diziOlustur(int max)
    {
        Integer[] arr = new Integer[max];

        for(int i=0; i<max; i++)
            arr[i] = i;

        return arr;
    }

    private static Integer[] bubbleSort(Integer[] dizi)
    {
        int i, j, gecici;

        boolean yeriDegisti;

        int n = dizi.length;
        for (i=0; i<n-1; i++)
        {
            yeriDegisti = false;
            for (j=0; j<n-i-1; j++)
            {
                if(dizi[j] > dizi[j+1])
                {
                    gecici = dizi[j];
                    dizi[j] = dizi[j+1];
                    dizi[j+1] = gecici;
                    yeriDegisti = true;
                }
            }

            if(!yeriDegisti)
                break;
        }

        return dizi;
    }

    private static Integer[] insertionSort(Integer[] dizi)
    {
        for(int i=1; i<dizi.length; ++i) {
            int sayi = dizi[i];
            int j = i-1;

            while(j>=0 && dizi[j] > sayi){
                dizi[j+1] = dizi[j];
                j = j-1;
            }
            dizi[j+1] = sayi;
        }

        return dizi;
    }

    private static Integer[] selectionSort(Integer[] dizi)
    {
        int toplam = dizi.length;

        for(int i=0; i<toplam-1; i++){
            int minimum = i;
            for(int j=i+1; j<toplam; j++)
                if(dizi[j] < dizi[minimum])
                    minimum = j;
            int gecici = dizi[minimum];
            dizi[minimum] = dizi[i];
            dizi[i] = gecici;
        }

        return dizi;
    }

    private static Integer[] countSort(Integer[] dizi)
    {
        if(dizi.length == 0)
            return null;
        Integer max = dizi[0];
        for(Integer i : dizi)
            if(i>max)
                max = i;

        Integer[] say = new Integer[max+1];
        Arrays.fill(say, 0);

        for(int i:dizi)
            say[i] += 1;

        for(int i=1; i<say.length; i++)
            say[i] += say[i-1];

        Integer[] sirali = new Integer[dizi.length];
        for(int i=dizi.length-1; i>=0; i--){
            int sayi = dizi[i];
            sirali[say[sayi]-1] = sayi;
            say[sayi] -= 1;
        }

        return sirali;
    }

    private static Integer[] mergeSort(Integer[] dizi)
    {
        mergeSort(dizi, 0, dizi.length-1);

        return dizi;
    }

    private static void mergeSort(Integer[] dizi, int sol, int sag)
    {
        if(sol<sag){
            int orta = (sol+sag)/2;

            mergeSort(dizi, sol, orta);
            mergeSort(dizi, orta+1, sag);

            mergeSortBirlestir(dizi, sol, orta, sag);
        }
    }

    private static void mergeSortBirlestir(Integer[] dizi, int sol, int orta, int sag)
    {
        int altDizi1 = orta - sol + 1;
        int altDizi2 = sag - orta;

        int[] Sol = new int[altDizi1];
        int[] Sag = new int[altDizi2];

        for(int i=0; i<altDizi1; ++i)
            Sol[i] = dizi[sol+i];
        for(int j=0; j<altDizi2; ++j)
            Sag[j] = dizi[orta+1+j];

        int i=0, j=0, k=sol;

        while(i<altDizi1 && j<altDizi2)
        {
            if(Sol[i] <= Sag[j]){
                dizi[k] = Sol[i];
                i++;
            } else {
                dizi[k] = Sag[j];
                j++;
            }
            k++;
        }

        while(i < altDizi1)
        {
            dizi[k] = Sol[i];
            i++;
            k++;
        }

        while(j < altDizi2)
        {
            dizi[k] = Sag[j];
            j++;
            k++;
        }
    }

    private static Integer[] quickSort(Integer[] dizi)
    {
        quickSort(dizi, 0, dizi.length-1);

        return dizi;
    }

    private static void quickSort(Integer[] dizi, int bas, int son)
    {
        if(bas < son)
        {
            int bol = quickSortBol(dizi, bas, son);

            quickSort(dizi, bas, bol-1);
            quickSort(dizi, bol+1, son);
        }
    }

    private static int quickSortBol(Integer[] dizi, int bas, int son)
    {
        int sayi = dizi[son];
        int i = (bas-1);
        for(int j=bas; j<son; j++)
        {
            if(dizi[j] < sayi){
                i++;

                int gecici = dizi[i];
                dizi[i] = dizi[j];
                dizi[j] = gecici;
            }
        }

        int gecici = dizi[i+1];
        dizi[i+1] = dizi[son];
        dizi[son] = gecici;

        return i+1;
    }

    static void AlgoritmalariTestEt()
    {
        for (Algoritma algoritma : Algoritma.values()){
            for(Map.Entry<Integer, Integer[]> ornek_dizi : ornek_diziler.entrySet()){
                System.out.println(algoritma.toString() + " algoritması " + ornek_dizi.getKey().toString() + " adet veri ile deneniyor.");

                long baslangic = System.currentTimeMillis();

                switch(algoritma){
                    case BUBBLE_SORT:
                        bubbleSort(ornek_dizi.getValue().clone());
                        break;
                    case INSERTION_SORT:
                        insertionSort(ornek_dizi.getValue().clone());
                        break;
                    case SELECTION_SORT:
                        selectionSort(ornek_dizi.getValue().clone());
                        break;
                    case COUNT_SORT:
                        countSort(ornek_dizi.getValue().clone());
                        break;
                    case MERGE_SORT:
                        mergeSort(ornek_dizi.getValue().clone());
                        break;
                    case QUICK_SORT:
                        quickSort(ornek_dizi.getValue().clone());
                        break;
                }

                long bitis = System.currentTimeMillis();
                float saniye = (bitis - baslangic) / 1000F;

                System.out.println(algoritma.toString() + "x" + ornek_dizi.getKey().toString() + " "+ saniye +" sürede bitti!");
            }
        }
    }
}
