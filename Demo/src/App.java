interface Executable{
	int execute();
}

class Runner{
	public void run(Executable e){
		int value = e.execute();
		System.out.println("Return value is"+ value);
	}

	
	
}
public class App {
	
	public static void main(String[] args){
		Runner runner = new Runner();
		runner.run(new Executable(){
			public int execute(){
				return 7;
			}
		});
		
		System.out.println("----------------------------------------------");
		
		runner.run(()->{
			return 8;
		});
	}

}
