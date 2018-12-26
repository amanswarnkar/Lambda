
public class RunnableLambdaExample {
	public static void main(String[] args) {
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Legacy runnable");
			}
		};
		
		new Thread(runnable).start();
		
		Runnable runnable2 = ()->{
			System.out.println("Lambda runnable");
		};
		
		new Thread(runnable2).start();
		
		Runnable runnable3 = ()-> System.out.println("Lambda runnable");
		new Thread(runnable3).start();
		
		new Thread(()->System.out.println("Lambda runnable")).start();
		
	}
}
