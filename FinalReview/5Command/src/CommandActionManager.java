import java.util.Stack;

public class CommandActionManager {
	Stack<ICommand> commands = new Stack<>();
	
	public void addCommand(ICommand com) {
		commands.add(com);
	}
	
	public void undoCommand() {
		commands.pop();
	}
	
	public void execute() {
		for (ICommand com : commands) {
			com.execute();
		}
	}
}
