package pekan3_2511533019;

import java.util.ArrayList;

class Siswa_2511533019 {
	String nama;
	int nim;
	
	public Siswa_2511533019(String nama, int nim) {
		this.nama = nama;
		this.nim = nim;
	}
	
	@Override
	public String toString() {
		return "Nim: " + nim + ", Nama: "+ nama;
	}
}
public class SiswaStack_2511533019 {
	private ArrayList<Siswa_2511533019> stack;
	
	public SiswaStack_2511533019() {
		stack = new ArrayList<>();
	}
	public void push_3019(Siswa_2511533019 mhs) {
		stack.add(mhs);
	}
	public Siswa_2511533019 pop_3019() {
		if (!isEmpty_3019()) {
			return stack.remove(stack.size()- 1);
		}
		return null;
	}
	
	public Siswa_2511533019 peek_3019() {
		if (!isEmpty_3019()) {
			return stack.get(stack.size()-1);
		}
		return null;
	}
	public boolean isEmpty_3019() {
		return stack.isEmpty();
	}
	
	public void tampilkanSiswa_3019() {
		for(int i= stack.size()-1; i >= 0; i--) {
			System.out.println(stack.get(i));
		}
	}
	public static void main(String[] args) {
		SiswaStack_2511533019 studentStack_3019 = new SiswaStack_2511533019();
		
		Siswa_2511533019 mhs1 = new Siswa_2511533019("Ali", 1);
		Siswa_2511533019 mhs2 = new Siswa_2511533019("Boby", 2);
		Siswa_2511533019 mhs3 = new Siswa_2511533019("Charles", 3);
		
		studentStack_3019.push_3019(mhs1);
		studentStack_3019.push_3019(mhs2);
		studentStack_3019.push_3019(mhs3);
		
		System.out.println("Siswa di dalam stack: ");
		studentStack_3019.tampilkanSiswa_3019();
		
		System.out.println("siswa teratas "+ studentStack_3019.peek_3019());
		System.out.println("mengeluarkan siswa teratas dari stack : "+studentStack_3019.pop_3019());
		System.out.println("daftar siswa setelah di pop : ");
		studentStack_3019.tampilkanSiswa_3019();
	}
}
