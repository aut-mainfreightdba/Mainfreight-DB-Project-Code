import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Button;

public class MainWindow 
{
	protected Shell shell;
	
	//Set up variables for input/output
	private Text dbNameText;
	private String dbNameString = null;
	private String gender = null;
	
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) 
	{
		try 
		{
			MainWindow window = new MainWindow();
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
		//Main Window Dimensions and setup
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("Mainfreight DB interface");
		
		//Name Text Window (String Only)
		dbNameText = new Text(shell, SWT.BORDER);
		dbNameText.setBounds(57, 7, 184, 21);
		
		//Name Label
		Label lblName = new Label(shell, SWT.NONE);
		lblName.setBounds(10, 10, 41, 15);
		lblName.setText("Name");
		
		//Gender Label
		Label lblGender = new Label(shell, SWT.NONE);
		lblGender.setBounds(252, 10, 46, 15);
		lblGender.setText("Gender");
		
		//Radio Button Male (True/False Only)
		Button btnMale = new Button(shell, SWT.RADIO);
		btnMale.setBounds(304, 9, 55, 16);
		btnMale.setText("Male");
		
		//Radio Button Female (True/False Only)
		Button btnFemale = new Button(shell, SWT.RADIO);
		btnFemale.setBounds(365, 9, 59, 16);
		btnFemale.setText("Female");
		
		//Submit button
		Button btnSubmit = new Button(shell, SWT.NONE);
		btnSubmit.setBounds(349, 226, 75, 25);
		btnSubmit.setText("Submit");
		
		//Listener to listen for input from radio buttons, submit button and text fields
		btnSubmit.addListener(SWT.Selection, new Listener() 
		{
			@Override
			public void handleEvent(Event e) //handler
			{
				//Convert Text input to string output
				dbNameString = dbNameText.getText();
				
				//set up error message box and error message variable
				String errorMsg = null;
				MessageBox messageBox = new MessageBox(shell, SWT.OK | SWT.ICON_ERROR);
				
				//Check if converted string is empty or null
				if(dbNameString == null || dbNameString.isEmpty())
				{
					if(dbNameString.isEmpty())
						errorMsg = "Graduate name cannot be blank!";
					else
						errorMsg = "Graduate name cannot be null!";
				}
				
				//Check if radio button selected and get selection
				if(btnFemale.getSelection())
				{
					gender = "Female";
				}
				else if(btnMale.getSelection())
				{
					gender = "Male";
				}
				else //throw message letting user know they need to select a gender
				{
					if(errorMsg != null)
						errorMsg +="\nGraduate must have a gender!";
					else
						errorMsg = "Graduate must have a gender!";
				}
				
				//if error message has been loaded with an error message
				if (errorMsg != null) 
				{
					messageBox.setMessage(errorMsg);
					messageBox.open();
				}
				else
				{
					System.out.println(dbNameString); //print out string to test content
					System.out.println(gender);
				}
			}
		});
	}
}
