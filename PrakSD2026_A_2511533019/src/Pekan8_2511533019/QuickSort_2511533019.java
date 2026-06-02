package Pekan8_2511533019;

public class QuickSort_2511533019 {

	public static void swap_3019(int[] arr_3019, int i_3019, int j_3019) {
		// TODO Auto-generated method stub
		int temp_3019 = arr_3019[i_3019];
		arr_3019[i_3019]= arr_3019[j_3019];
		arr_3019[j_3019]= temp_3019;
	}
	// Metode tambahan untuk mengatur pivot menggunakan Median-of-Three
	static void medianOfThree_3019 (int[] arr_3019, int low_3019, int high_3019) {
		int mid_3019 = low_3019 + (high_3019 - low_3019) / 2;

		//Urutkan elemen low, mid, dan high
		if (arr_3019 [low_3019] > arr_3019[mid_3019]) {
			swap_3019(arr_3019, low_3019, mid_3019);
		}
		if(arr_3019[low_3019] > arr_3019[high_3019]) {
			swap_3019(arr_3019, low_3019, high_3019);
		}
		if(arr_3019[mid_3019]> arr_3019[high_3019]) {
			swap_3019 (arr_3019, mid_3019, high_3019);
		}
		swap_3019(arr_3019, mid_3019, high_3019);
	}
	static int partition (int[] arr_3019, int low_3019, int high_3019) {
	//Panggil fungsi medianofThree sebelum menentukan pivot
	medianOfThree_3019(arr_3019, low_3019, high_3019);
	
	int pivot_3019 = arr_3019 [high_3019]; // Sekarang arc[high] sudah berisi nilai median
	int i_3019 = (low_3019 - 1);
	
	for(int j_3019= low_3019; j_3019<= high_3019-1; j_3019++) {
		// Jika elemen saat ini lebih kecil dari atau sama
		if (arr_3019[j_3019] < pivot_3019) {
			// Increment indeks elemen yang Lebih kecil
			i_3019++;
			swap_3019(arr_3019, i_3019,j_3019);
			}
		}
		swap_3019(arr_3019, i_3019 + 1, high_3019);
		return (i_3019+ 1);
	}
	static void quickSort_3019 (int[] arr_3019, int low_3019, int high_3019) {
		if (low_3019 < high_3019) {
			int pi_3019 = partition(arr_3019, low_3019, high_3019); 
			quickSort_3019(arr_3019, low_3019, pi_3019 - 1); 
			quickSort_3019 (arr_3019, pi_3019 + 1, high_3019);
		}
	}
	
	public static void printArr_3019 (int[] arr_3019) {
		for(int i_3019 = 0; i_3019 < arr_3019.length; i_3019++) {
			System.out.print(arr_3019[i_3019] + " ");
		}
		System.out.println();
	}
	
	public static void main (String[] args){ 
		int[] arr_3019 = { 10, 7, 8, 9, 1, 5};
		int N_3019 = arr_3019.length;
		System.out.print ("Data sebelum diurutkan: ");
		printArr_3019(arr_3019);
	
		quickSort_3019 (arr_3019, 0, N_3019 - 1);
		
		System.out.print ("Data Terurut quicksort: ") ;
		printArr_3019(arr_3019);
	}
}