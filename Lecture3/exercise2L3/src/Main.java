import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] A = new int[15];
        Random random = new Random();
        for (int i = 0; i < 15; i++){
            A[i] = random.nextInt(101);
        }
        int countDivisible3 = 0;
        for (int elem : A){
            System.out.print(elem + " ");
            if(elem % 3 == 0){
                countDivisible3++;
            }
        }
        System.out.println();
        System.out.println("Numbers divisible by 3: " + countDivisible3);
        int [] B = new int[A.length];
        for (int i=0; i<A.length; i++){
            B[i] = 100 - A[i];
        }
        System.out.println("Complement array: ");
        for (int elem : B){
            System.out.println(elem + " ");
        }
    }
}