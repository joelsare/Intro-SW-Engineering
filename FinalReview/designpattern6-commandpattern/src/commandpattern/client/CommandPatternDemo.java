package commandpattern.client;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Text;

import commandpattern.command.CopyCommand;
import commandpattern.command.PasteCommand;
import commandpattern.invoker.CommandActionManager;
import commandpattern.receiver.CommandAction;
import commandpattern.util.MySWTShell;

public class CommandPatternDemo extends MySWTShell {

   public static void main(String[] args) {
      CommandPatternDemo commandDemo = new CommandPatternDemo();
      commandDemo.doStart();
   }

   Menu mPopupMenu = null;
   MenuItem menuItemAddCopyCmd = null, menuItemExeCopyCmd = null, menuItemPasteCmd = null;
   Text t;

   CommandActionManager cmdActionManager;
   CommandAction cmdAction;

   void doStart() {
      init();
      t = new Text(shell, SWT.MULTI | SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
      t.setText("Hello Software World");
      t.setFont(new Font(display, new FontData("Arial", 32, SWT.BOLD)));
      t.setLayoutData(new GridData(GridData.FILL_BOTH));

      cmdActionManager = new CommandActionManager();
      cmdAction = new CommandAction(t);

      mPopupMenu = new Menu(t);
      t.setMenu(mPopupMenu);

      menuItemAddCopyCmd = new MenuItem(mPopupMenu, SWT.CASCADE);
      menuItemAddCopyCmd.setText("Copy Command (Add Copy Command)");
      addSelectionListenerMenuItemCopyCmd();

      menuItemExeCopyCmd = new MenuItem(mPopupMenu, SWT.CASCADE);
      menuItemExeCopyCmd.setText("Copy Command (Execute Copy Command)");
      addSelectionListenerMenuItemCopyCmdExe();

      menuItemPasteCmd = new MenuItem(mPopupMenu, SWT.CASCADE);
      menuItemPasteCmd.setText("Paste Command");
      addSelectionListenerMenuItemPasteCmd();

      openShell();
   }

   private void addSelectionListenerMenuItemCopyCmd() {
      SelectionListener menuItemListenerCopyCmd = new SelectionListener() {
         @Override
         public void widgetSelected(SelectionEvent e) {
            System.out.println("[DBG] MenuItem Copy Command Addition: " + t.getSelectionText());
            CopyCommand copyCommand = new CopyCommand(cmdAction, t.getSelectionText());
            cmdActionManager.addCommand(copyCommand);
         }

         @Override
         public void widgetDefaultSelected(SelectionEvent e) {
         }
      };
      menuItemAddCopyCmd.addSelectionListener(menuItemListenerCopyCmd);
   }

   private void addSelectionListenerMenuItemCopyCmdExe() {
      SelectionListener menuItemListenerCopyCmd = new SelectionListener() {
         @Override
         public void widgetSelected(SelectionEvent e) {
            System.out.println("[DBG] MenuItem Copy Command Execution: " + t.getSelectionText());
            CopyCommand copyCommand = new CopyCommand(cmdAction, t.getSelectionText());
            cmdActionManager.addCommand(copyCommand);
            cmdActionManager.executeCommand();
         }

         @Override
         public void widgetDefaultSelected(SelectionEvent e) {
         }
      };
      menuItemExeCopyCmd.addSelectionListener(menuItemListenerCopyCmd);
   }

   private void addSelectionListenerMenuItemPasteCmd() {
      SelectionListener menuItemListenerPasteCmd = new SelectionListener() {
         @Override
         public void widgetSelected(SelectionEvent e) {
            System.out.println("[DBG] MenuItem Paste Command: " + t.getSelectionText());
            PasteCommand pasteCommand = new PasteCommand(cmdAction);
            cmdActionManager.addCommand(pasteCommand);
            cmdActionManager.executeCommand();
         }

         @Override
         public void widgetDefaultSelected(SelectionEvent e) {
         }
      };
      menuItemPasteCmd.addSelectionListener(menuItemListenerPasteCmd);
   }
}
