# Bubble Sort Strings

This is a simple Java program that demonstrates the bubble sort algorithm applied to an array of strings.
The program sorts the strings in ascending alphabetical order.

1. [Description](#description)
2. [Technologies](#technologies)
3. [Installation & Running](#installation-&-running)
4. [Author](#author)
5. [Usage Example](#usage-example)
6. [Screenshots](#screenshots)

## Description

The `BubbleSortStrings` class contains a main method that:
1. Initializes an array of strings.
2. Displays the original array.
3. Sorting the array using the bubble sort algorithm.
4. Displays the sorted array.

The bubble sort algorithm compares adjacent elements and swaps them if they are in the wrong
order, repeating this process until the array is sorted.

## Technologies
- **Java 17**
- **Sorting algorithm.** (`Bubble Sort`)
- **Arrays**

## Installation & Running

1. Clone the repository:
```bash
git clone https://github.com/YuliyaZimenina/Bubble_Sort_For_Strings.git
cd Bubble_Sort_For_Strings
```

2. Open the project in your favorite IDE (IntelliJ IDEA, Eclipse, etc.).
3. Make sure **Java 17** is set as the project SDK.
4. Run the ```BubbleSortStrings.java``` file.

## Author

[Yuliya Zimenina](https://github.com/YuliyaZimenina)

## Usage Examples

**BubbleSortStrings class:**

```java
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

```
## Screenshots

The result of the program:

<img src="images/The result of the program.png" alt="Result" width="500">
