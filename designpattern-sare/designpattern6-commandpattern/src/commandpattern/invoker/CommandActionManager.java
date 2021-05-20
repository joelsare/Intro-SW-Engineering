package commandpattern.invoker;

import java.util.ArrayList;
import java.util.List;

import commandpattern.command.UICommand;

public class CommandActionManager {
   List<UICommand> cmdList = new ArrayList<UICommand>();

   public void addCommand(UICommand command) {
      cmdList.add(command);
   }

   public void executeCommand() {
      for (UICommand command : cmdList) {
         command.execute();
      }
      cmdList.clear();
   }
}