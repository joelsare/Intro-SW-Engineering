
public class CommandTest {

	public static void main(String[] args) {
		
		UICopyCommand copy1 = new UICopyCommand();
		ShortcutCopyCommand copy2 = new ShortcutCopyCommand();
		
		UICopyCommand copy3 = new UICopyCommand();
		
		ShortcutPasteCommand paste = new ShortcutPasteCommand();
		
		CommandActionManager commands = new CommandActionManager();
		
		commands.addCommand(copy1);
		commands.addCommand(copy2);
		commands.addCommand(copy3);
		commands.undoCommand(); //dont want copy3 anymore
		commands.addCommand(paste);
		
		commands.execute();
	}

}
