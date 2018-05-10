package Date;


	public class TT {
	    public volatile int inc = 0;
	 
	    public void increase() {
	        inc++;
	    }
	 
	    public static void main(String[] args) {
	        final TT tt = new TT();
	        
	        for(int i=0;i<10;i++){
	            new Thread(){
	            	
	                public synchronized void run() {
	                    for(int j=0;j<1000;j++)
	                        tt.increase();
	                };
	            }.start();
	        }
	 
	        while(Thread.activeCount()>1)  //保证前面的线程都执行完
	            Thread.yield();
	        System.out.println(tt.inc);
	    }
	}

