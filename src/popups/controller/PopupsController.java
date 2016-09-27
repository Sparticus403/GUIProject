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
}
