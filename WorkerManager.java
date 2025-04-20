
public class WorkerManager {

	private IPayable payable;
	private IEatable eatable;
	private IWorkable workable;
	
	public void displayInfo() {
		payable.pay();
		eatable.eat();
		workable.work();
		
	}
	public WorkerManager(IPayable payable, IEatable eatable, IWorkable workable) {
		this.payable=payable;
		this.eatable=eatable;
		this.workable=workable;
	}
	
	
}
