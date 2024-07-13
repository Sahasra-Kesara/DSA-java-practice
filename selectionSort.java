public class selectionSort {
    public static void main(String[] args) {
        int myArray[] = {-10, 22, 5, 2, 30};
        for (int lastUnsortedIndex = myArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            int largestIndex = 0;
            for(int currentIndex = 1; currentIndex <= lastUnsortedIndex; currentIndex++) {
                if(myArray[currentIndex] > myArray[largestIndex]){
                    largestIndex = currentIndex;
                }
            }
            int temp = myArray[largestIndex];
            myArray[largestIndex] = myArray[lastUnsortedIndex];
            myArray[lastUnsortedIndex] = temp;
        }
        for(int i=0; i<myArray.length; i++){
            System.out.print(myArray[i] + " | ");
        }
    }
}
