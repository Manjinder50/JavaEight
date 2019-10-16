package Lambda;

public class RunnableImplementation {

	public static void main(String[] args) {

		Runnable runnable = ()->{
			for(int i=0;i<3;i++) {
			System.out.println("Lambda Runnable");
			}};
		
		Thread t = new Thread(runnable);
		t.start();
	}

}
