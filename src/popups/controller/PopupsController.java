package popups.controller;

import popups.view.PopupViewer;
import popups.model.Thingy;
import java.util.List;
import java.util.ArrayList;

public class PopupsController
{
	private PopupViewer display;
	private List<Thingy> thingyList;
	public PopupsController()
	{
		display = new PopupViewer();
		thingyList = new ArrayList<Thingy>();
	}

	public void start()
	{
		learnLists();
		
	}
	private void testLoop()
	{
		String answer = "sample";
		while(answer != null && !isDouble(answer))
		{
			answer = display.collectResponse("You need to type in a number!");	
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
	/**
	 * Checks that the suppled string is parseable to an integer value.
	 * @param potentialNumber The string to test for parsing.
	 * @return Whether it could be parsed as an integer.
	 */
	private boolean isInteger(String potentialNumber)
	{
		boolean isParseable = false;
		
		try
		{
			int test = Integer.parseInt(potentialNumber);
			isParseable = true;
		}
		catch(NumberFormatException notInt)
		{
			display.displayMessage(notInt.getMessage());
			display.displayMessage("Type in an integer next time!");
		}
		
		return isParseable;
	}
	private void learnLists()
	{
		display.displayMessage(thingyList.size() + " is the size of the list.");
		Thingy testThingy = new Thingy();
		thingyList.add(testThingy);
		display.displayMessage(thingyList.size() + " is the size of the list.");
		
		for (int index = 0; index <5; index++)
		{
			Thingy addThingy = new Thingy();
			thingyList.add(addThingy);
			display.displayMessage(addThingy.getWords());
		}
		
		display.displayMessage(thingyList.size() + " is the size");
		
		thingyList.get(3).setWords("look I changed a value");
		Thingy temp = thingyList.get(4);
		temp.setWords("stuff");
		
		for (int index = 0; index < thingyList.size(); index++)
		{
			display.displayMessage(thingyList.get(index).getWords());
		}
		
		thingyList.add(3, new Thingy());
		
		display.displayMessage("The size is " + thingyList.size());
		
		thingyList.remove(0); //I no longer have access to this object. Because there is no = sign.
		
		display.displayMessage("The size is " + thingyList.size());
		
		Thingy deletedThingy = thingyList.remove(3);
		display.displayMessage(deletedThingy.getWords() + " and the list size is " + thingyList.size());
		
		thingyList.set(0, deletedThingy);
		
		for (int index = 0; index < thingyList.size(); index++)
		{
			display.displayMessage(thingyList.get(index).getWords());
		}
		
		for (Thingy currentThingy : thingyList)
		{
			display.displayMessage(currentThingy.getWords());
		}
		thingyList.get(2).setWords("Nothing Here in #2?");
		
		Thingy thingDel = thingyList.remove(2);
		display.displayMessage("This thing has been deleted: " + thingDel.getWords());
		
		for (int index = 0; index < thingyList.size(); index++)
		{
			display.displayMessage(thingyList.get(index).getWords());
		}
		
		
	}
	
}
