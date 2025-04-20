
public class Robot implements IWorkable,IPayable,IEatable {

	@Override
	public void eat() {
		System.out.println("Robots can not eat");
	}

	@Override
	public void pay() {
		System.out.println("Robots can not get a payment");
	}

	@Override
	public void work() {
		System.out.println("Robots do their jobs");
	}

}
