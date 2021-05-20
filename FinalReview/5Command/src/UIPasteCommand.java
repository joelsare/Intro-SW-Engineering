
public class UIPasteCommand implements ICommand {

	CommandAction commandAction = new CommandAction();
	
	@Override
	public void execute() {
		commandAction.pasteAction();
	}

}
