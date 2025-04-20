
public class OutsourceWorker implements IWorkable,IPayable,IEatable{

	@Override
	public void eat() {
		System.out.println("Company has not to provide food for outsource workers");
	}

	@Override
	public void pay() {
		System.out.println("The company must pay the wages of outsource workers to the workers' representative ");
		
	}

	@Override
	public void work() {
		System.out.println("Outsource workers have to do their jobs");
	}
	
	
}
