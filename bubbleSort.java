public class bubbleSort {
    public static void main(String[] args) {
        int myArray[] = {4, -3, 10, 2, 5};
        for(int lastUnsortedIndex = myArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            for (int currentIndex = 0; currentIndex < lastUnsortedIndex; currentIndex++){
                if (myArray[currentIndex] > myArray[currentIndex + 1]) {
                    int temp = myArray[currentIndex];
                    myArray[currentIndex] = myArray[currentIndex + 1];
                    myArray[currentIndex + 1] = temp;
                }
            }
        }
        for(int i = 0; i < myArray.length; i++){
            System.out.print(myArray[i] + " ");
        }
    }
}
