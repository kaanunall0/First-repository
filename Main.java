
public class Main {

	public static void main(String args[]) {
		
		WorkerManager workerManager = new WorkerManager(new OutsourceWorker(),new OutsourceWorker(), new OutsourceWorker());
		workerManager.displayInfo();
		
		System.out.println("\n");
		
		WorkerManager workerManager2 = new WorkerManager(new Worker(),new Worker(),new Worker());
		workerManager2.displayInfo();
		
		System.out.println("\n");
		
		WorkerManager workerManager3 = new WorkerManager(new Robot(),new Robot(),new Robot());
		workerManager3.displayInfo();
		
	}	
	
}
