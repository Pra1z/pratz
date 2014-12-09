import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		new Thread(new Runnable() {
		        public void run(){
		            for(int i =0;i<20;i++){
		            	System.out.println("Thread 1 : "+i);
		            	Thread.yield();
		            	try {
							Thread.sleep(1);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		            }
		        }
		    }).start();
		 
		 new Thread(new Runnable() {
		        public void run(){
		            for(int i =0;i<20;i++){
		            	
		            	System.out.println("Thread 2 : "+i);
		            	try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		            }
		        }
		    }).start();
		    */
		
		
		ExecutorService executorService = Executors.newScheduledThreadPool(10);

		executorService.execute(new Runnable() {
		    public void run() {
		    	 for(int i =0;i<20;i++){
		            	
		            	System.out.println("Thread  1 : "+i);
		            	try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		            }
		    }
		});
		

		executorService.shutdown();
	}

}
