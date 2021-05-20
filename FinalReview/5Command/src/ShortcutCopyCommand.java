
public class ShortcutCopyCommand implements ICommand {

	CommandAction commandAction = new CommandAction();
	
	@Override
	public void execute() {
		commandAction.copyAction();
	}

}
