package Pekan4_2511533019;

public class QueueArray_2511533019 {
	int front_3019, rear_3019, size_3019;
	int capacity_3019;
	int array_3019[];
	
	public QueueArray_2511533019 (int capacity) {
		this.capacity_3019 = capacity;
		front_3019 = this.size_3019 = 0;
		rear_3019 = capacity - 1;
		array_3019 = new int[this.capacity_3019];
	}
	
	boolean isFull_3019(QueueArray_2511533019 queue) {
		return (queue.size_3019==queue.capacity_3019);
	}
	
	boolean isEmpty_3019(QueueArray_2511533019 queue) {
		return (queue.size_3019 == 0);
	}
	
	void enqueue(int item_3019) {
		if (isFull_3019(this))
			return;
		this.rear_3019 = (this.rear_3019 + 1)% this.capacity_3019;
		this.array_3019[this.rear_3019] = item_3019;
		this.size_3019 = this.size_3019 + 1;
		System.out.println(item_3019 + " enqueue to queue");
	}
	
	int dequeue_3019() {
		if(isEmpty_3019(this))
			return Integer.MIN_VALUE;
		int item_3019 = this.array_3019[this.front_3019];
		this.front_3019 = (this.front_3019 + 1)% this.capacity_3019;
		this.size_3019 = this.size_3019-1;
		return item_3019;
	}
	int front_3019() {
		if (isEmpty_3019(this))
			return Integer.MIN_VALUE;
		return this.array_3019[this.front_3019];
		
	}
	int rear_3019() {
		if (isEmpty_3019(this))
			return Integer.MIN_VALUE;
		return this.array_3019[this.rear_3019];
	}
	//mencetak elemen antrian 
	void display_3019(){
		int i_3019;
		if(front_3019 == rear_3019) {
			System.out.printf("\nAntrian Kosong\n");
			return;
		}
		//kunjungi dari belakang dan cetak
		for(i_3019 = front_3019; i_3019<rear_3019; i_3019++) {
			System.out.printf("%d <--", array_3019[i_3019]);
		}
		return;
		}
	}
