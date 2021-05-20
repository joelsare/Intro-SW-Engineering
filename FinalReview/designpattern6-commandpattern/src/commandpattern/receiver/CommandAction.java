package commandpattern.receiver;

import org.eclipse.swt.widgets.Text;

public class CommandAction {
   Text text;
   StringBuilder copiedText = new StringBuilder();

   public CommandAction(Text t) {
      this.text = t;
   }

   public void copyAction(String selectionText) {
      System.out.println("CommandAction: copy - " + selectionText);
      this.copiedText.append(selectionText + " ");
   }

   public void pasteAction() {
      System.out.println("CommandAction: paste - " + this.copiedText);
      this.text.append(this.copiedText.toString());
      this.copiedText.setLength(0);;
   }
}
