
public class SyncClass {

	public synchronized void printInSync(int i){
		boolean isEven = false;
		if(i % 2 == 0){
			isEven = true;
		}
		while(isEven == true){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Odd "+ i);
		notifyAll();
		
		
	}
}
