package commandpattern.command;

import commandpattern.receiver.CommandAction;

public class CopyCommand extends UICommand {
   CommandAction commandAction;
   String selectionText;

   public CopyCommand(CommandAction action, String selectionText) {
      this.commandAction = action;
      this.selectionText = selectionText;
   }

   public void execute() {
      commandAction.copyAction(this.selectionText);
   }
}