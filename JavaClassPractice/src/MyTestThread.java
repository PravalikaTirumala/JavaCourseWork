
public class MyTestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MultithreadingExample task1 = new MultithreadingExample ("Hello", 10,1);
		MultithreadingExample task2 = new MultithreadingExample ("Goodbye", 20,2);
		
		Thread thread1=new Thread(task1);
		Thread thread2=new Thread(task2);
		
		thread1.start();
		thread2.start();
		//without starting threads it just call it as a method. . 
		
		/*task1.run();
		task2.run();*/
	}

}
