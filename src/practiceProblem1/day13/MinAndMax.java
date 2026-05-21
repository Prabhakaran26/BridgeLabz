package practiceProblem1.day13;

public class MinAndMax{
    public static void main(String[] args) {
        Integer[] intArr = {10, 20, 30, 40, 50};
        Float[] floatArr = {11.2f, 54.3f, 8.7f, 99.1f};
        String[] stringArr = {"Apple", "Peach", "Banana", "Zoo"};
        System.out.print("Maximum Integer: ");
        MaximumTest.testMaximum(intArr);
        System.out.print("Maximum Float: " );
        MaximumTest.testMaximum(floatArr);
        System.out.print("Maximum String: ");
        MaximumTest.testMaximum(stringArr);
    }
}
class MaximumTest<T extends Comparable<T>>{

    public static <T extends Comparable<T>> void testMaximum(T[] values){
        T greatest = values[0];

        for (T value : values) {
            if (value.compareTo(greatest) > 0) {
                greatest = value;
            }
        }
        printGreatest(greatest);
    }
    public static <T> void printGreatest(T greatest){
        System.out.println(greatest);
    }
}
