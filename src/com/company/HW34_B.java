import java.lang.reflect.Array;
import java.util.ArrayList;

public class HW34_B {
    public static void main(String[] args) {
        ArrayList<Integer> IntList = new ArrayList<>();
        for(int i = 0; i < 50; i++){
            IntList.add((int) (Math.random() * 100 + 1));
        }
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for(int i = 0; i < IntList.size(); i++){
            if(IntList.get(i) % 2 == 0){
                even.add(IntList.get(i));
            }
            else {
                odd.add(IntList.get(i));
            }
        }
        System.out.println("Initial arrayList:");
        System.out.println(IntList);
        System.out.println("Even arrayList:");
        System.out.println(even);
        System.out.println("Odd arrayList:");
        System.out.println(odd);
    }
}
