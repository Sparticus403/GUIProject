package popups.controller;

import popups.view.PopupViewer;

public class PopupsController
{
	private PopupViewer display;
	
	public PopupsController()
	{
		display = new PopupViewer();
	}

	public void start()
	{
		String answer = "sample";
		while(answer != null && !answer.equals(""))
		{
			display.displayMessage("Hi there :D");
			
			answer = display.collectResponse("what is going on?");
			display.displayMessage(answer + " is what you said.");
			
		}
	}
	/**
	 * Checks if the supplied string can be parsed to a double value.
	 * @param potentialValue The string to the test.
	 * @return Whether the value could be parsed; true if it can be parsed, false otherwise.
	 */
	private boolean isDouble(String potentialValue)
	{
		boolean isValid = false;
		
		try
		{
			double test = Double.parseDouble(potentialValue);
			isValid = true;
		}
		catch(NumberFormatException notDouble)
		{
			display.displayMessage("This is not a double value =:<");
		}
		
		return isValid;
		
	}
	
}
