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
	private Text firstNameText;
	private Text ageText;
	private Text lastNameText;
	private Text phoneNumberText;
	private Text emailText;
	private Text universityText;
	private Text degreeText;
	private Text branchText;
	private Text divisionText;
	private Text inductionCourseText;
	private Text mentorText;
	
	private String firstNameString = null;
	private String gender = null;
	private String ageString = null;
	private String lastNameString = null;
	private String phoneNumberString = null;
	private String emailString = null;
	private String universityString = null;
	private String degreeString = null;
	private String branchString = null;
	private String divisionString = null;
	private String inductionCourseString = null;
	private String mentorString = null;
	
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
		shell.setSize(450, 240);
		shell.setText("Mainfreight DB interface");
		
		//Name Label
		Label lblName = new Label(shell, SWT.NONE);
		lblName.setBounds(10, 10, 60, 15);
		lblName.setText("First Name");
		
		//Name Text Window (String Only)
		firstNameText = new Text(shell, SWT.BORDER);
		firstNameText.setBounds(76, 7, 165, 21);
		
		Label lblLastName = new Label(shell, SWT.NONE);
		lblLastName.setBounds(10, 31, 60, 15);
		lblLastName.setText("Last Name");
		
		lastNameText = new Text(shell, SWT.BORDER);
		lastNameText.setBounds(76, 33, 165, 21);
		
		//Gender Label
		Label lblGender = new Label(shell, SWT.NONE);
		lblGender.setBounds(252, 10, 46, 15);
		lblGender.setText("Gender");
		
		//Radio Button Male (True/False Only)
		Button btnMale = new Button(shell, SWT.RADIO);
		btnMale.setBounds(314, 9, 55, 16);
		btnMale.setText("Male");
		
		//Radio Button Female (True/False Only)
		Button btnFemale = new Button(shell, SWT.RADIO);
		btnFemale.setBounds(365, 9, 59, 16);
		btnFemale.setText("Female");
		
		Label lblAge = new Label(shell, SWT.NONE);
		lblAge.setBounds(252, 31, 46, 15);
		lblAge.setText("Age");
		
		ageText = new Text(shell, SWT.BORDER);
		ageText.setBounds(314, 31, 40, 21);
		
		Label lblEmail = new Label(shell, SWT.NONE);
		lblEmail.setBounds(10, 58, 55, 15);
		lblEmail.setText("Email");
		
		emailText = new Text(shell, SWT.BORDER);
		emailText.setBounds(76, 57, 165, 21);
		
		Label lblPhoneNumber = new Label(shell, SWT.NONE);
		lblPhoneNumber.setBounds(252, 58, 60, 15);
		lblPhoneNumber.setText("Phone No.");
		
		phoneNumberText = new Text(shell, SWT.BORDER);
		phoneNumberText.setBounds(314, 57, 110, 21);
		
		Label lblUniversity = new Label(shell, SWT.NONE);
		lblUniversity.setBounds(10, 91, 55, 15);
		lblUniversity.setText("University");
		
		universityText = new Text(shell, SWT.BORDER);
		universityText.setBounds(76, 88, 165, 21);
		
		Label lblDegree = new Label(shell, SWT.NONE);
		lblDegree.setBounds(252, 91, 55, 15);
		lblDegree.setText("Degree");
		
		degreeText = new Text(shell, SWT.BORDER);
		degreeText.setBounds(314, 88, 40, 21);
		
		Label lblBranch = new Label(shell, SWT.NONE);
		lblBranch.setBounds(10, 121, 55, 15);
		lblBranch.setText("Branch");
		
		branchText = new Text(shell, SWT.BORDER);
		branchText.setBounds(76, 121, 165, 21);
		
		Label lblDivision = new Label(shell, SWT.NONE);
		lblDivision.setBounds(252, 121, 55, 15);
		lblDivision.setText("Division");
		
		divisionText = new Text(shell, SWT.BORDER);
		divisionText.setBounds(314, 121, 40, 21);
		
		Label lblInductionCourse = new Label(shell, SWT.NONE);
		lblInductionCourse.setBounds(10, 148, 97, 15);
		lblInductionCourse.setText("Induction Course");
		
		inductionCourseText = new Text(shell, SWT.BORDER);
		inductionCourseText.setBounds(113, 145, 165, 21);
		
		Label lblMentor = new Label(shell, SWT.NONE);
		lblMentor.setBounds(10, 169, 55, 15);
		lblMentor.setText("Mentor");
		
		mentorText = new Text(shell, SWT.BORDER);
		mentorText.setBounds(113, 169, 165, 21);
		
		//Submit button
		Button btnSubmit = new Button(shell, SWT.NONE);
		btnSubmit.setBounds(349, 164, 75, 25);
		btnSubmit.setText("Submit");
		
		//Listener to listen for input from radio buttons, submit button and text fields
		btnSubmit.addListener(SWT.Selection, new Listener() 
		{
			@Override
			public void handleEvent(Event e) //handler
			{
				//Convert Text inputs to string outputs
				firstNameString = firstNameText.getText();
				lastNameString = lastNameText.getText();
				ageString = ageText.getText();
				phoneNumberString = phoneNumberText.getText();
				emailString = emailText.getText();
				universityString = universityText.getText();
				degreeString = degreeText.getText();
				branchString = branchText.getText();
				divisionString = divisionText.getText();
				inductionCourseString = inductionCourseText.getText();
				mentorString = mentorText.getText();
				
				//set up error message box and error message variable
				String errorMsg = null;
				MessageBox messageBox = new MessageBox(shell, SWT.OK | SWT.ICON_ERROR);
				
				//Check if converted string is empty or null
				if(firstNameString == null || firstNameString.isEmpty())
				{
					if(firstNameString.isEmpty())
						errorMsg = "Graduate First Name cannot be blank!";
					else
						errorMsg = "Graduate First Name cannot be null!";
				}
				
				if(lastNameString == null || lastNameString.isEmpty())
				{
					if(lastNameString.isEmpty())
						if(errorMsg != null)
							errorMsg +="\nGraduate Last Name cannot be blank!";
						else
							errorMsg = "Graduate Last Name cannot be blank!";
					else
						if(errorMsg != null)
							errorMsg +="\nGraduate Last Name cannot be null!";
						else
							errorMsg = "Graduate Last Name cannot be null!";
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
				
				if(ageString == null || ageString.isEmpty())
				{
					if(ageString.isEmpty())
						if(errorMsg != null)
							errorMsg +="\nGraduate Age cannot be blank!";
						else
							errorMsg = "Graduate Age cannot be blank!";
					else
						if(errorMsg != null)
							errorMsg +="\nGraduate Age cannot be null!";
						else
							errorMsg = "Graduate Age cannot be null!";
				}
				
				if(phoneNumberString == null || phoneNumberString.isEmpty())
				{
					if(phoneNumberString.isEmpty())
						if(errorMsg != null)
							errorMsg +="\nGraduate Phone Number cannot be blank!";
						else
							errorMsg = "Graduate Phone Number cannot be blank!";
					else
						if(errorMsg != null)
							errorMsg +="\nGraduate Phone Number cannot be null!";
						else
							errorMsg = "Graduate Phone Number cannot be null!";
				}
				
				if(emailString == null || emailString.isEmpty())
				{
					if(emailString.isEmpty())
						if(errorMsg != null)
							errorMsg +="\nGraduate Email Address cannot be blank!";
						else
							errorMsg = "Graduate Email Address cannot be blank!";
					else
						if(errorMsg != null)
							errorMsg +="\nGraduate Email Address cannot be null!";
						else
							errorMsg = "Graduate Email Address cannot be null!";
				}
				
				if(universityString == null || universityString.isEmpty())
				{
					if(universityString.isEmpty())
						if(errorMsg != null)
							errorMsg +="\nGraduate University cannot be blank!";
						else
							errorMsg = "Graduate University cannot be blank!";
					else
						if(errorMsg != null)
							errorMsg +="\nGraduate University cannot be null!";
						else
							errorMsg = "Graduate University cannot be null!";
				}
				
				if(degreeString == null || degreeString.isEmpty())
				{
					if(degreeString.isEmpty())
						if(errorMsg != null)
							errorMsg +="\nGraduate Degree cannot be blank!";
						else
							errorMsg = "Graduate Degree cannot be blank!";
					else
						if(errorMsg != null)
							errorMsg +="\nGraduate Degree cannot be null!";
						else
							errorMsg = "Graduate Degree cannot be null!";
				}
				
				if(branchString == null || branchString.isEmpty())
				{
					if(branchString.isEmpty())
						if(errorMsg != null)
							errorMsg +="\nGraduate Branch cannot be blank!";
						else
							errorMsg = "Graduate Branch cannot be blank!";
					else
						if(errorMsg != null)
							errorMsg +="\nGraduate Branch cannot be null!";
						else
							errorMsg = "Graduate Branch cannot be null!";
				}
				
				if(divisionString == null || divisionString.isEmpty())
				{
					if(divisionString.isEmpty())
						if(errorMsg != null)
							errorMsg +="\nGraduate Division cannot be blank!";
						else
							errorMsg = "Graduate Division cannot be blank!";
					else
						if(errorMsg != null)
							errorMsg +="\nGraduate Division cannot be null!";
						else
							errorMsg = "Graduate Division cannot be null!";
				}
				
				if(inductionCourseString == null || inductionCourseString.isEmpty())
				{
					if(inductionCourseString.isEmpty())
						if(errorMsg != null)
							errorMsg +="\nGraduate Induction Course cannot be blank!";
						else
							errorMsg = "Graduate Induction Course cannot be blank!";
					else
						if(errorMsg != null)
							errorMsg +="\nGraduate Induction Course cannot be null!";
						else
							errorMsg = "Graduate Induction Course cannot be null!";
				}
				
				if(mentorString == null || mentorString.isEmpty())
				{
					if(mentorString.isEmpty())
						if(errorMsg != null)
							errorMsg +="\nGraduate Mentor cannot be blank!";
						else
							errorMsg = "Graduate Mentor cannot be blank!";
					else
						if(errorMsg != null)
							errorMsg +="\nGraduate Mentor cannot be null!";
						else
							errorMsg = "Graduate Mentor cannot be null!";
				}
				
				//if error message has been loaded with an error message
				if (errorMsg != null) 
				{
					messageBox.setMessage(errorMsg);
					messageBox.open();
				}
				else
				{
					String displayMessage 	= "First Name: " + firstNameString 
											+ "\nLast Name: " + lastNameString 
											+ "\nGender: " + gender 
											+ "\nAge: " + ageString
											+ "\nPhone No: " + phoneNumberString
											+ "\nEmail Address: " + emailString
											+ "\nUniversity: " + universityString
											+ "\nDegree: " + degreeString
											+ "\nBranch: " + branchString
											+ "\nDivision: " + divisionString
											+ "\nInduction Course: " + inductionCourseString
											+ "\nMentor: " + mentorString;
					/*
					System.out.println(firstNameString); //print out string to test content
					System.out.println(lastNameString);
					System.out.println(gender);
					System.out.println(ageString);
					System.out.println(phoneNumberString);
					System.out.println(emailString);
					System.out.println(universityString);
					System.out.println(degreeString);
					System.out.println(branchString);
					System.out.println(divisionString);
					System.out.println(inductionCourseString);
					System.out.println(mentorString);
					*/
					messageBox.setMessage(displayMessage);
					messageBox.open();
				}
			}
		});
	}
}
