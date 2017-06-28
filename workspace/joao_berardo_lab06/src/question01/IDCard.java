package question01;

import java.util.Objects;

public class IDCard extends Card {
	private String idNumber;
	
	public IDCard(String newName, String newId)
	{
		super(newName);		
		this.idNumber = newId;
	}
	
	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String format()
	{
		return "IDCard [Name=" + this.getName()  + ",IdNumber=" + this.idNumber + "]";
	}
	
	public String toString()
	{
		return "IDCard [Name=" + this.getName()  + ",IdNumber=" + this.idNumber + "]";
	}
	
    public boolean equals(Object o)
    {
        if (this == o)
        {
        	return true;
        }
        
        if (o == null || getClass() != o.getClass())
        {
        	return false;
        }
        
        IDCard idCard = (IDCard) o;
        
        return Objects.equals(this.getName(), idCard.getName()) &&
        		Objects.equals(this.getIdNumber(), idCard.getIdNumber());
    }
}