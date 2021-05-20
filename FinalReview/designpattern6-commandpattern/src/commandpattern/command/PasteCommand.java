package commandpattern.command;

import commandpattern.receiver.CommandAction;

public class PasteCommand extends UICommand {
   CommandAction commandAction;

   public PasteCommand(CommandAction action) {
      this.commandAction = action;
   }

   public void execute() {
      commandAction.pasteAction();
   }
}