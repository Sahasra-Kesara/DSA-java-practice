public class Main {
    public static void main (String[] args) {
        int myArray[] = {-2, 3, 6, 40, 60, 80, 100};
        int searchResult = binarySearch(myArray, 6);
        System.out.println("Search Result: " + searchResult);
    }
    public static int binarySearch(int inputArray[], int searchValue){
        int startIndex = 0;
        int endIndex = inputArray.length;

        while(startIndex < endIndex) {
            int midIndex = (startIndex + endIndex)/2;
            System.out.println(midIndex);

            if (inputArray[midIndex] == searchValue) {
                return midIndex;
            }
            else if (inputArray[midIndex] < searchValue) {
                startIndex = midIndex +1;
            }
            else {
                endIndex = midIndex;
            }
        }
    }
}
