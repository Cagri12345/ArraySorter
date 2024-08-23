package Arrays;
import java.util.Scanner;
public class ArraySorter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan dizinin boyutunu alınıyor
        System.out.print("Enter the size of the array:  ");
        int n = input.nextInt();

        // Kullanıcıdan dizinin elemanlarını alınıyor
        int[] dizi = new int[n];
        for (int i = 0 ; i < n ; i++) {
            System.out.print((i+1) + ". enter number: ");
            dizi[i] = input.nextInt();
        }

        //Teker teker elemanları ele alan döngü
        for (int i = 0 ; i < dizi.length - 1 ; i++) {
            for (int j = i + 1 ; j < dizi.length ; j++) {
                if (dizi[i] > dizi[j]) {
                    //Swap işlemi
                    int temp = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = temp;

                }
            }
        }

        //Listeyi ekrana yazdır
        System.out.println("Sorted array: ");
        for(int i = 0 ; i < dizi.length ; i++){
            System.out.print(dizi[i] + " ");
        }
        input.close();
    }
}
