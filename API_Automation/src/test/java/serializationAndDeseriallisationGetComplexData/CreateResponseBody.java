package serializationAndDeseriallisationGetComplexData;

import java.util.HashMap;
import java.util.List;

public class CreateResponseBody
{
	//this is the way which i have used to understand pojo classes,but sir give another way to create a pojo class
	Integer id;
	HashMap<String,Object> category;
	String name;
	List<String>photoUrls;
	List<HashMap<String,Object>> tags;
	String status;
	
	public Integer getId() 
	{
		return id;
	}
	
	public void setId(Integer id) 
	{
		this.id = id;
	}
	
	public HashMap<String, Object> getCategory() 
	{
		return category;
	}
	
	public void setCategory(HashMap<String, Object> category) 
	{
		this.category = category;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public List<String> getPhotoUrls() 
	{
		return photoUrls;
	}
	
	public void setPhotoUrls(List<String> photoUrls) 
	{
		this.photoUrls = photoUrls;
	}
	
	public List<HashMap<String, Object>> getTags() 
	{
		return tags;
	}
	
	public void setTags(List<HashMap<String, Object>> tags) 
	{
		this.tags = tags;
	}
	
	public String getStatus() 
	{
		return status;
	}
	
	public void setStatus(String status) 
	{
		this.status = status;
	}
}
