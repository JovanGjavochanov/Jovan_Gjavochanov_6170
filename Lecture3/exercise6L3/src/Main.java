import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int size = 15;
        int[] originalArray = new int[size];
        generateArray(originalArray,size);
        printArray(originalArray);
        System.out.println();;
        int count = countDivisibleBy(originalArray,5);
        System.out.println("Number of elements divisible by 5: " + count);

        int[] finalArray = new int[size];
        complement_array(originalArray,finalArray);
        printArray(finalArray);
    }
    public static void generateArray(int[] array, int size){
        Random random = new Random();
        for(int i = 0; i < size; i++){
            array[i] = random.nextInt(101);
        }
    }

    public static int countDivisibleBy(int[] array, int divisor){
        int counter = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] % divisor == 0){
                counter++;
            }
        }
        return counter;
    }

    public static void complement_array(int[] original, int[] complement){
        for (int i = 0; i < original.length; i++){
            complement[i] = 100 - original[i];
        }
    }

    public static void printArray(int[] array){
        for(int elem:array){
            System.out.print(elem + " ");
        }
    }
}