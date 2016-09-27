package popups.model;

public class Thingy
{

	private int number;
	private double value;
	private String words;
	private boolean isValid;
	//getters
	public int getNumber()
	{
		return number;
	}
	public double getValue()
	{
		return value;
	}
	public String getWords()
	{
		return words;
	}
	public boolean getValid()
	{
		return isValid;
	}
	//setters
	public void setNumber(int number)
	{
		this.number = number;
	}
	public void setValue(double value)
	{
		this.value = value;
	}
	public void setWords(String words)
	{
		this.words = words;
	}
	public void setValid(boolean isValid)
	{
		this.isValid = isValid;
	}
}
