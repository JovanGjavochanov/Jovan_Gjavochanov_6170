import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        System.out.println("Test test test");
//
//        int a = 2;
//        int b = 5;
//        int c = 11;
//
//        int aTimesB = a * b;
//        if(aTimesB < c) {
//            System.out.println("Smaller");
//        }
//        else if (aTimesB > c) {
//            System.out.println("Bigger");
//        }
//        else{
//            System.out.println("They are equal");
//        }

        List<String> myList = new ArrayList<>();
        myList.add("first");
        myList.add("second");
        myList.add("third");

        List<String> secondList = new ArrayList<>();
        for(String elem : myList){
            secondList.add(elem.substring(6));
        }
        System.out.println(secondList);
    }
}