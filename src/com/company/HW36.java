import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class HW36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(2);
            arrayList.add(random.nextInt(2));
            linkedList.add(random.nextInt(2));
        }
        System.out.print("Array: ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        int[] sorted = sort(array);
        System.out.print("\nSorted array: ");
        for(int i = 0; i < array.length; i++) {
            System.out.print(sorted[i] + " ");
        }
        System.out.println();
        System.out.println("ArrayList: " + arrayList);
        System.out.println("Sorted arrayList: " + sort(arrayList));
        System.out.println("LinkedList: " + linkedList);
        System.out.println("Sorted linkedList: " + sort(linkedList));
    }

   public static int[] sort(int[] array) {
        for(int i = 1; i < array.length; ++i){
            for(int j = 0; j < array.length - i; j++){
                if(array[j] == 1) {
                    if (array[j + 1] == 0) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }
        return array;
    }

    public static ArrayList<Integer> sort(ArrayList<Integer> arrayList) {
        for(int i = 0; i < arrayList.size(); i++){
            for(int j = 0; j < arrayList.size(); j++) {
                if (arrayList.get(i) == 1) {
                    arrayList.add(1);
                    arrayList.remove(i);
                }
            }
        }
        return arrayList;
    }

    public static LinkedList<Integer> sort(LinkedList<Integer> linkedList) {
        for(int i = 0; i < linkedList.size(); i++){
            for(int j = 0; j < linkedList.size(); j++) {
                if (linkedList.get(i) == 1) {
                    linkedList.addLast(1);
                    linkedList.remove(i);
                }
            }
        }
        return linkedList;
    }
}