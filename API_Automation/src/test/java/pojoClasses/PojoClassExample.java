package pojoClasses;

public class PojoClassExample
{
	//Here we have declared Variable using Wrapper Class like Integer and String Where those are the WrapperClass
	Integer ID;
	String GivenName;
	String SurName;
	String NameSuffixText;
	String PreferredName;
	
	//created getters and setters method,after selecting all variable right click on it>>go to source>>go to generate setters and getters method then select all variable which we want to create getter and setter
	//then select access modifier and click on finish
	public Integer getID() 
	{
		return ID;
	}
	
	public void setID(Integer iD)
	{
		ID = iD;
	}
	
	public String getGivenName()
	{
		return GivenName;
	}
	
	public void setGivenName(String givenName)
	{
		GivenName = givenName;
	}
	
	public String getSurName() 
	{
		return SurName;
	}
	
	public void setSurName(String surName) 
	{
		SurName = surName;
	}
	
	public String getNameSuffixText() 
	{
		return NameSuffixText;
	}
	
	public void setNameSuffixText(String nameSuffixText) 
	{
		NameSuffixText = nameSuffixText;
	}
	
	public String getPreferredName() 
	{
		return PreferredName;
	}
	
	public void setPreferredName(String preferredName) 
	{
		PreferredName = preferredName;
	}


}
/*
{
"Id":20,
"GivenName" : "Mortimer",
"SurName" : "Smith",
"NameSuffixText" : "Sr",
"PreferredName" : "Morty",
}
*/