
public class Worker implements IWorkable,IPayable,IEatable {

	@Override
	public void eat() {
		System.out.println("The company has to provide food for its workers");		
	}

	@Override
	public void pay() {
		System.out.println("The company must pay wages to its workers");
	}

	@Override
	public void work() {
		System.out.println("Company workers must do their jobs");
	}

	
	
}
