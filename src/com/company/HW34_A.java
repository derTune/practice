import java.util.ArrayList;

public class HW34_A {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add(0, "Ветер с моря дул");
        myList.add(1, "Нагонял беду");
        myList.add(2, "И сказал ты мне");
        myList.add(3, "Больше не приду");
        for(int i = 0; i < 4; i++) {
            myList.add("");
        }
        for(int i = 3; i >= 0; i--){
            myList.set(i*2+1, myList.get(i));
            myList.set(i*2, myList.get(i));
        }
        System.out.println(myList);
        ArrayList<String> myList2 = new ArrayList<>();
        for(int i = 0 ; i < myList.size(); i+=2){
            if((myList.get(i).length() + myList.get(i++).length()) > 20) {
                myList2.add(myList.get(i) + ", " + myList.get(i++));
            }
        }
        System.out.println(myList2);
        for(int i = 0; i < myList2.size(); i++){
            myList2.remove("И сказал ты мне, И сказал ты мне");
        }
        System.out.println(myList2);
    }
}
