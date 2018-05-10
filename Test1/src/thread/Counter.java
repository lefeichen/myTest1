package thread;

public class Counter {
	private volatile int count = 0;

	public void inc() {
		try {
			//Thread.sleep(3);
			String name = Thread.currentThread().getName();
			System.out.println(name);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		count++;
	}

	@Override
	public String toString() {
		return "[count=" + count + "]";
	}
}
