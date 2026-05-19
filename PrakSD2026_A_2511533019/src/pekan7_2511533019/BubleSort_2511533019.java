package pekan7_2511533019;

public class BubleSort_2511533019 {			
	public static void bubbleSort_3019(int[] arr_3019) {
		int n_3019 = arr_3019.length;
		for (int i_3019 = 0; i_3019 < n_3019; i_3019++) {
			for (int j_3019 = 0; j_3019 < n_3019 - i_3019-1; j_3019++) {
				if (arr_3019[j_3019] > arr_3019[j_3019 +1]) {
					int temp_3019 = arr_3019[j_3019];
					arr_3019[j_3019] = arr_3019[j_3019 + 1];
					arr_3019[j_3019 + 1] = temp_3019;
			//System.out.println ("data: "+ar[j]+" "+arr[j+1]);
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr_3019[] = { 23, 78, 45, 8, 32, 56, 1};
		int n_3019 = arr_3019.length;
		System.out.print ("array yang belum terurut:");
		for (int i_3019 = 0; i_3019 < n_3019; i_3019++)
			System.out.print(arr_3019[i_3019]+ " ");
		System.out.println("");
		bubbleSort_3019(arr_3019);
		System.out.print("array yang terurut menggunakan BubleSort: ");
		for(int i_3019 = 0; i_3019 < n_3019; i_3019++)
			System.out.print (arr_3019[i_3019] + " ");
		System.out.println("");
	}

}
