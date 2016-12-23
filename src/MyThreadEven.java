
public class MyThreadEven extends Thread{
 @Override
public void run() {
	 SyncClass sync = new SyncClass();
	for(int i = 1; i <= 20 ; i++){
			 sync.printInSync(i);
			 
			 
		 
	 }
}
}
