import java.util.Scanner;

class Task{
	private final String description;
	private boolean isCompleted;
	Task(String description){
		this.description=description;
	}
	boolean isComplete() {
		return this.isCompleted;
	}
	void markCompleted() {
		this.isCompleted=true;
	}
	@Override
	public String toString() {
		return "Task Description="+this.description+"\n Completed Status="+this.isCompleted;
	}
}
class TaskManager{
	Task task[];
	int taskCount;
	TaskManager(int intialCompasity){
		task=new Task[intialCompasity];
	}
	void addTask(String description) {
		if(taskCount==task.length) {
			System.out.println("Task List Is Full");
		}else {
			Task t=new Task(description);
			task[taskCount]=t;
			taskCount++;
			System.out.println("Task Added Succussfully...");
		}
	}
	void markTaskCompleted(int index){
		task[index-1].markCompleted();
		System.out.println("Task Completed Status Updated...");
	}
	void listPendingTasks() {
		for(int i=0;i<task.length;i++) {
			if(task[i].isComplete()==false) {
				System.out.println(task[i]);
			}
			if(task[i+1]==null)break;
		}
	}
	void listCompletedTasks() {
		for(int i=0;i<task.length;i++) {
			if(task[i].isComplete()==true) {
				System.out.println(task[i]);
			}
			if(task[i+1]==null)break;
		}
	}
	void listAllTasks() {
		for(int i=0;i<taskCount;i++) {
			System.out.println(task[i]);
		}
	}
}
public class TaskManagerMain {

	public static void main(String[] args) {
		TaskManager tm=new TaskManager(10);
		Scanner sc=new Scanner(System.in);
		boolean isExit=false;
		while(!isExit) {
			System.out.println("1.Add Task");
			System.out.println("2.Mark Task as Complete");
			System.out.println("3.List completed Tasks");
			System.out.println("4.List Pending Tasks");
			System.out.println("5.List all Tasks");
			System.out.println("6.Exit");
			System.out.print("Enter Option:");
			int op=sc.nextInt();
			sc.nextLine();
			switch(op) {
			case 1 -> {
                            System.out.println("Enter Your Task info:");
                            String desc=sc.nextLine();
                            tm.addTask(desc);
                        }
			case 2 -> {
                            tm.listPendingTasks();
                            System.out.println("Enter Task Number:");
                            int index=sc.nextInt();
                            tm.markTaskCompleted(index);
                        }
			case 3 -> tm.listCompletedTasks();
			case 4 -> tm.listPendingTasks();
			case 5 -> tm.listAllTasks();
			case 6 -> {
                            isExit=true;sc.close();
                        }
			default -> System.out.println("Invalid Input");
			
			}
			
		}

	}

}
