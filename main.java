public class main
{
    public static void main (String[] args) {
        int myArray[] = {-2, 3, 6, 40, 60, 80, 100};
        int searchResult = linearSearch(myArray, 6);
        System.out.println(searchResult);
    }

    public static int linearSearch(int inputArray[], int searchValue) {
        for (int i = 0; i < inputArray.length; i++){
            if (inputArray[i] == searchValue) {
                return i;
            }
        }
        return -1;
    }
}

