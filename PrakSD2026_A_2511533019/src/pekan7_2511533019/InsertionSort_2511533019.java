package pekan7_2511533019;

public class InsertionSort_2511533019 {			
	public static void insertionSort_3019 (int[] arr_3019) {
		int n_3019 = arr_3019.length;
		for (int i_3019 = 1; i_3019 < n_3019; i_3019++) {
			int key_3019 = arr_3019[i_3019];
			int j_3019 = i_3019 - 1;
			while (j_3019 >= 0 && arr_3019[j_3019] > key_3019) {
				arr_3019[j_3019 + 1] = arr_3019[j_3019];
				j_3019--;
			}
			arr_3019[j_3019 + 1] = key_3019;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr_3019[]= {23, 78, 45, 8, 32, 56, 1};
		int n_3019 = arr_3019.length;
		System.out.printf("array yang belum terurut:\n");
		for (int i_3019 = 0; i_3019 < n_3019; i_3019++)
			System.out.print (arr_3019[i_3019] + " ");
		System.out.println(""); 
		insertionSort_3019(arr_3019);
		System.out.printf("array yang terurut:\n");
		for (int i_3019 = 0; i_3019 < n_3019; i_3019++)
			System.out.print(arr_3019[i_3019] + " ");
		System.out.println("");
	}

}
