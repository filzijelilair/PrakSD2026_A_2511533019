package Pekan8_2511533019;

public class MergeSort_2511533019 {
	void merge_3019(int arr_3019[], int l_3019, int m_3019, int r_3019) {
		int n1_3019 = m_3019-l_3019 + 1;
		int n2_3019 = r_3019 - m_3019;
		/* create temp arrays */
		int L_3019[] = new int[n1_3019];
		int R_3019[] = new int[n2_3019];
		/* copy data to tem arrays */
		for (int i_3019 = 0; i_3019 < n1_3019; ++i_3019) 
			L_3019[i_3019]= arr_3019[l_3019 + i_3019];
		for (int j_3019= 0; j_3019 < n2_3019; ++j_3019) 
			R_3019[j_3019]= arr_3019[m_3019+ 1 + j_3019];
		int i_3019=0, j_3019= 0;
		// initial index of merged subarray array
		int k_3019 = l_3019;
		while (i_3019<n1_3019 && j_3019<n2_3019) {
			if(L_3019[i_3019] <= R_3019[j_3019]) {
				arr_3019[k_3019] = L_3019[i_3019];
				i_3019++;
		}else {
			arr_3019[k_3019] = R_3019[j_3019];
			j_3019++;
		}
		k_3019++;
	}
	/*Copy remaining elements of L[] if any */
		while (i_3019 < n1_3019) {
			arr_3019[k_3019] = L_3019[i_3019];
			i_3019++;
			k_3019++;
		}
	/* copy remaining elements of R[] if any */
		while (j_3019 < n2_3019) {
			arr_3019[k_3019] = R_3019[j_3019];
			j_3019++;
			k_3019++;
		}
	}
	void sort_3019(int arr_3019[], int l_3019, int r_3019) {
		if (l_3019 < r_3019) {
			// Find the middle point
			int m_3019 = (l_3019 + r_3019) / 2;
			// Sort first and second halves
			sort_3019(arr_3019, l_3019, m_3019); 
			sort_3019(arr_3019, m_3019 + 1, r_3019);
			// Merge the sorted halves
			merge_3019(arr_3019, l_3019, m_3019, r_3019);
		}
	}
	/* A utility function to print array of size n */ 
	static void printArray_3019 (int arr_3019[]) {
		int n_3019 = arr_3019.length;
		for (int i_3019 = 0; i_3019 < n_3019; ++i_3019)
			System.out.print(arr_3019[i_3019] + " ");
		System.out.println();
	}
	public static void main (String args[]) {
		int arr_3019[] = { 12, 11, 13, 5, 6, 7 };
		System.out.println ("Sebelum terurut");
		printArray_3019(arr_3019);
		MergeSort_2511533019 ob_3019 = new MergeSort_2511533019();
		ob_3019.sort_3019 (arr_3019, 0, arr_3019.length - 1);
		System.out.println("\nSesudah Terurut menggunakan merge sort");
		printArray_3019(arr_3019);
	}
}
