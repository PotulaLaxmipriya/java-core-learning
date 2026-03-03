package day07;

public class MultiCatchExample {

    public static void main(String[] args) {

        try {
            int[] arr = new int[3];
            arr[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        } catch (Exception e) {
            System.out.println("Some other exception occurred");
        }

        System.out.println("Program finished");
    }
}

