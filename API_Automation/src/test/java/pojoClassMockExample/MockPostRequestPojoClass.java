package pojoClassMockExample;
import java.util.List;

public class MockPostRequestPojoClass
{
	Long id;
	Category category;
	String name;
	List<String> photoUrls;
	List<Tags> tags;
	String status;
	
	
	
	public Long getId() 
	{
		return id;
	}
	
	public void setId(long i)
	{
		this.id = i;
	}
	
	public Category getCategory() 
	{
		return category;
	}
	
	public void setCategory(Category category) 
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
	
	public List<Tags> getTags() 
	{
		return tags;
	}
	
	public void setTags(List<Tags> tags) 
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
