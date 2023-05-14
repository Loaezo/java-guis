
package swtdemo;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class SWTDemo {

    public static void main(String[] args) {

        Display display = new Display();
        Shell shell = new Shell(display);
        shell.setLayout(new FillLayout());

        Label label = new Label(shell, SWT.NONE);
        label.setText("SWT Label");
        Text textField = new Text(shell, SWT.NONE);
        textField.setText("SWT text field");
        Button button = new Button(shell, SWT.NONE);
        button.setText("SWT button");
        Button checkBox = new Button(shell, SWT.CHECK);
        checkBox.setText("SWT checkbox");
        Button radioButton = new Button(shell, SWT.RADIO);
        radioButton.setText("SWT radio button");

        shell.pack();
        shell.open();
        while (!shell.isDisposed()) {
            if (!display.readAndDispatch()) {
                display.sleep();
            }
        }
        display.dispose();
    }
}
