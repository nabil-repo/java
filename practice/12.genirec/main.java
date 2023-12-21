// Generic class
class Box<T> {
    private T content;

    // Constructor
    public Box(T content) {
        this.content = content;
    }

    // Getter and setter
    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    // Generic method
    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

public class main {
    public static void main(String[] args) {
        // Creating a generic class instance with Integer content
        Box<Integer> integerBox = new Box<>(42);
        System.out.println("Content of the integer box: " + integerBox.getContent());

        // Creating a generic class instance with String content
        Box<String> stringBox = new Box<>("Hello, Generics!");
        System.out.println("Content of the string box: " + stringBox.getContent());

        // Creating an array and using the generic method to print its content
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        String[] strArray = { "A", "B", "C", "D", "E" };

        System.out.print("Integer array: ");
        Box.printArray(intArray);

        System.out.print("String array: ");
        Box.printArray(strArray);
    }
}
