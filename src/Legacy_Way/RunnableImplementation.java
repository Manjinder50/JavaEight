package Legacy_Way;

public class RunnableImplementation {

	
	public static void main(String[] args) {

		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				
			System.out.println("Inside Runnable");
			}
		};
		new Thread(runnable).start();
	}

}
