public class Debugging {
    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4, 5};//Array fixed by providing numbers instead of NULL
        double average = calculateAverage(numbers);//NullPointer Exception pointer here where
        System.out.println("Average1: " + average);//the method was attempting calculations on null array

//        int[] invalidArray = {1, 2, 3};//ArrayIndexOutOfBoundsException example
//        int value = invalidArray[3];//Index out of bounds for length 4
//        double average2 = calculateAverage(invalidArray);
////        System.out.println(value);//used for debugging
//        System.out.println("Average3: " + average2);

//        int[] emptyArray = {};//IllegalArgumentException example
//        double average3 = calculateAverage(emptyArray);
//        System.out.println("Average2: " + average3);
    }

    //Method to calculate the average of an array of integers
    public static double calculateAverage(int[] numbers) {
        if (numbers == null || numbers.length == 0) {//Catch empty or null arrays,
            throw new IllegalArgumentException("Array must not be null or empty");//logs exception to debug console
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        //Logic error: returning the sum instead of the average (*fixed)
        return (double) sum / numbers.length;
    }
}
