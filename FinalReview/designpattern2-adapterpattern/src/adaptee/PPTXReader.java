package adaptee;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Text;

// Adaptee
public class PPTXReader extends AdvancedDocumentReader {
   public void readPPTX(String fileName) {
      init();
      Text t = new Text(shell, SWT.MULTI | SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
      t.setText("Reading MSPPT file: " + fileName);
      t.setFont(new Font(display, new FontData("Arial", 32, SWT.BOLD)));
      t.setLayoutData(new GridData(GridData.FILL_BOTH));
      openShell();
   }
}