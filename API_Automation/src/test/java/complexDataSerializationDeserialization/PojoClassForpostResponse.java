package complexDataSerializationDeserialization;

import java.util.List;

public class PojoClassForpostResponse 
{
	Integer id;
	Category1 category;
	String name;
	List<String>photoUrls;
	List<Tags1>tags;
	String status;
	
	public Integer getId() 
	{
		return id;
	}
	
	public void setId(Integer id) 
	{
		this.id = id;
	}
	
	public Category1 getCategory() 
	{
		return category;
	}
	
	public void setCategory(Category1 category) 
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
	
	public List<Tags1> getTags() 
	{
		return tags;
	}
	
	public void setTags(List<Tags1> tags) 
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
