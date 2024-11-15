public class BubbleSortStrings {
    public static void main(String[] args) {
        String[] message = {
                "I", "am", "sorting", "an",
                "array", "of", "strings"
        };

        int a, b;
        String t;
        int size;

        size = message.length; // number of elements to sort

        // Display the original array
        System.out.print("Original array");
        for (int i = 0; i < size; i++)
            System.out.print(" " + message[i]);
        System.out.println();

        //Bubble sort for strings
        for (a = 1; a < size; a++)
            for (b = size - 1; b >= a; b--) {
                // If the order is not followed, then swap the elements
                if (message[b - 1].compareTo(message[b]) > 0) {
                    t = message[b - 1];
                    message[b-1] = message[b];
                    message [b] = t;
                }
            }
        //Display sorted array
        System.out.print("Sorted array: ");
        for (int i = 0; i < size; i++)
            System.out.print(" " + message[i]);
        System.out.println();
    }
}