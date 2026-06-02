package Pekan8_2511533019;

public class ShellSort_2511533019 {

	public static void ShellSort_3019(int[] A) {
		// TODO Auto-generated method stub
		int n_3019 = A.length;
		int gap_3019 = n_3019 / 2;
		while (gap_3019 > 0) {
			for (int i_3019 = gap_3019; i_3019 < n_3019; i_3019++) {
				int temp_3019 = A[i_3019];
				int j_3019 = i_3019;
				while (j_3019 >= gap_3019 && A[j_3019 - gap_3019] > temp_3019) {
					A[j_3019] = A[j_3019 - gap_3019];
					j_3019 = j_3019 - gap_3019;
				}
				A[j_3019] = temp_3019;
		}
		gap_3019 = gap_3019 / 2;
	}
}

public static void main (String[] args) {
	int[] data_3019 = {3, 10, 4, 6, 8, 9, 7, 2, 1, 5};
		
	System.out.print ("Sebelum: ");
	printArray_3019(data_3019);
	
	ShellSort_3019(data_3019);
		
	System.out.print("Sesudah (Shell Sort): "); 
	printArray_3019(data_3019);
}

public static void printArray_3019(int[] arr) {
	for (int i_3019 : arr) System.out.print(i_3019 + " ");
	System.out.println();
	}
}

