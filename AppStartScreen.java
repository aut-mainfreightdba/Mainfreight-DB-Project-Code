import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;

public class AppStartScreen 
{

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) 
	{
		 DBManager db = new DBManager();
		
		try 
		{
			AppStartScreen window = new AppStartScreen();
			window.open();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() 
	{
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) 
		{
			if (!display.readAndDispatch()) 
			{
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() 
	{
		shell = new Shell();
		shell.setSize(200, 170);
		shell.setText("SWT Application");
		
		Button btnAddGraduate = new Button(shell, SWT.NONE);
		btnAddGraduate.setBounds(45, 10, 94, 25);
		btnAddGraduate.setText("Add Graduate");
		
		Button btnAddMentor = new Button(shell, SWT.NONE);
		btnAddMentor.setBounds(45, 41, 94, 25);
		btnAddMentor.setText("Add Mentor");
		
		Button btnDatabase_Viewer = new Button(shell, SWT.NONE);
		btnDatabase_Viewer.setBounds(45, 72, 94, 25);
		btnDatabase_Viewer.setText("Database Viewer");
		
		Button btnExit = new Button(shell, SWT.NONE);
		btnExit.setBounds(45, 103, 94, 25);
		btnExit.setText("Exit");
		
		btnAddGraduate.addListener(SWT.Selection, new Listener() 
		{
			MainWindow window;
			@Override
			public void handleEvent(Event e) //handler
			{
				try 
				{
					window = new MainWindow();
					window.open();
				} 
				catch (Exception f) 
				{
					f.printStackTrace();
				}
			}
		});
	}
}
