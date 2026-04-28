package Pekan4_2511533019;

public class QueueArrayDriver_2511533019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueArray_2511533019 queue_3019 = new QueueArray_2511533019(1000);
		queue_3019.enqueue(10);
		queue_3019.enqueue(20); 
		queue_3019.enqueue(30); 
		queue_3019.enqueue(40);
		System.out.println("Item di depan "+ queue_3019.front_3019());
		System.out.println("Item paling belakang " + queue_3019.rear_3019());
		System.out.println("tampilan queue");
		queue_3019.display_3019();
		System.out.println();
		System.out.println(queue_3019.dequeue_3019() + " dihapus dari queue");
		System.out.println("Item di depan:" + queue_3019.front_3019());
		System.out.println("Item dibelakang: " + queue_3019.rear_3019());
		System.out.println("tampilan queue setelah satu data dihapus") ;
		queue_3019.display_3019();
	}

}
