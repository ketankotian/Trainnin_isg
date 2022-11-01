
import java.util.Scanner;

public class Merge {

	//This method will merge the elements
	
	public static void merge(int inputArray[], int lowerlimit, int mid, int higherlimit) {
		int i, j, c = lowerlimit;
		int tempArray[] = new int[higherlimit + 1];

		for (i = lowerlimit, j = mid + 1; i <= mid && j <= higherlimit; c++) {

			if (inputArray[i] <= inputArray[j])
				tempArray[c] = inputArray[i++];
			else
				tempArray[c] = inputArray[j++];
		}
		while (i <= mid)
			tempArray[c++] = inputArray[i++];

		while (j <= higherlimit)
			tempArray[c++] = inputArray[j++];

		for (i = lowerlimit; i <= higherlimit; i++)
			inputArray[i] = tempArray[i];
	}

	//This method sorts the elements in array
	
	public static void Sort(int inputArray[], int lowerlimit, int higherlimit) {
		if (lowerlimit < higherlimit) {
			int mid = (lowerlimit + higherlimit) / 2;
			Sort(inputArray, lowerlimit, mid);
			Sort(inputArray, mid + 1, higherlimit);
			merge(inputArray, lowerlimit, mid, higherlimit);

		}

	}

	//This method is used to print elements in array
	
	public static void printarray(int inputArray[]) {
		for (int i = 0; i < inputArray.length; i++) {

			System.out.print(inputArray[i] + "  ");
		}

	}

	public static void main(String[] args) {
		int lenght;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements in the array:");
		lenght = sc.nextInt();
		int inputArray[] = new int[lenght];
		System.out.println("Enter " + lenght + " elements ");
		for (int i = 0; i < lenght; i++) {
			inputArray[i] = sc.nextInt();
		}

		System.out.println("elements in array ");
		printarray(inputArray);

		Sort(inputArray, 0, lenght - 1);
		System.out.println("\nelements after sorting");
		printarray(inputArray);

	}
}

