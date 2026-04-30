package Pekan4_2511533019;

import java.util.Scanner;

public class AntrianLoket_2511533019 {
	int front_3019, rear_3019, size_3019;
	int max_3019;
	String queue_3019[];
	
	public AntrianLoket_2511533019 (int max_3019) {
		this.max_3019 = max_3019;
		front_3019 = this.size_3019 = 0;
		rear_3019 = this.max_3019 - 1;
		queue_3019 = new String[this.max_3019];
	}
	
	boolean isFull_3019(AntrianLoket_2511533019 queue) {
		return (queue.size_3019==queue.max_3019);
	}
	
	boolean isEmpty_3019(AntrianLoket_2511533019 queue) {
		return (queue.size_3019 == 0);
	}
	
	void enqueue_3019(String data_3019) {
		if (isFull_3019(this)) {
			System.out.println("Antrian penuh!");
			return;}
		 rear_3019 = (rear_3019 + 1) % max_3019;
		 queue_3019[rear_3019] = data_3019;
		 size_3019++;
		 System.out.println("Data berhasil ditambahkan ke antrian");
	}
	
	String dequeue_3019() {
		if(isEmpty_3019(this)) {
			System.out.println("Antrian Kosong!");
			return null;
		}
		String data_3019 = this.queue_3019[this.front_3019];
		this.front_3019 = (this.front_3019 + 1)% this.max_3019;
		this.size_3019 = this.size_3019-1;
		return data_3019;
	}
	String front_3019() {
		if (isEmpty_3019(this))
			return null;
		return this.queue_3019[this.front_3019];
		
	}
	String rear_3019() {
		if (isEmpty_3019(this))
			return null;
		return this.queue_3019[this.rear_3019];
	}
	
	void display_3019(){
		if(isEmpty_3019(this)) {
			System.out.printf("\nAntrian Kosong\n");
			return;
		}
		
		System.out.println("Isi Antrian : ");
		int i = this.front_3019;
		int no = 1;
		for(int count = 0; count < size_3019; count++) {
            System.out.println(no + ". " + queue_3019[i]);
            i = (i + 1) % max_3019;
            no++;
		}
	}
	void reverse_3019() {
		if (isEmpty_3019(this)) {
			System.out.println ("Antrian kosong!");
			return;
		}
		 for (int i = 0; i < size_3019 / 2; i++) {
	            int idx1_3019 = (front_3019 + i) % max_3019;
	            int idx2_3019 = (front_3019 + size_3019 - 1 - i) % max_3019;

	            String temp = queue_3019[idx1_3019];
	            queue_3019[idx1_3019] = queue_3019[idx2_3019];
	            queue_3019[idx2_3019] = temp;
		 }
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        AntrianLoket_2511533019 q = new AntrianLoket_2511533019(5);
        int pilih;
            System.out.println("\n=== PROGRAM ANTRIAN LOKET ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Hapus Antrian");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Reverse");
            System.out.println("5. Keluar");
            
            do {
            System.out.print("Pilih menu: ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan nama pelanggan: ");
                    String nama = input.nextLine();
                    q.enqueue_3019(nama);
                    break;

                case 2:
                    String keluar = q.dequeue_3019();
                    if (keluar != null)
                        System.out.println(keluar + " telah dilayani");
                    break;

                case 3:
                    q.display_3019();
                    break;

                case 4:
                    q.reverse_3019();
                    q.display_3019();
                    break;

                case 5:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
            }
          
        } while (pilih != 5);}
}
