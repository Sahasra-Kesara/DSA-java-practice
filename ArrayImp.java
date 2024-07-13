import java.util.Scanner;
public class ArrayImp{
	public static void main(String[] arg) {

		int[] arr = new int[10];
		int size = 5;
		
		Scanner UserIn = new Scanner(System.in);

		System.out.println("Enter data : ");
		for(int j=0; j<size; j++){
			arr[j] = UserIn.nextInt();
		}

		System.out.println("Output of Array ");
		for(int i=0; i<size; i++){
			System.out.println(arr[i]);
		}
		System.out.println("Enter the data");
		int ind = UserIn.nextInt();

		System.out.println("Enter the element");
		int ele = UserIn.nextInt();

		size++;

		for(int k=size; k>=ind; k--){
			arr[k] = arr[k-1];
		}

		arr[ind]=ele;

        System.out.println("Output of Array");
		for(int i=0; i<size; i++){
			System.out.println(arr[i]);
		}
	}
}