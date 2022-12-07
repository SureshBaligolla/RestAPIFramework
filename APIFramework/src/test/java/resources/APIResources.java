package resources;
//enum is special class in java which has collection of constants or  methods
public enum APIResources {
	
	AddPlaceAPI("/customer/api/customer?"),
	AddPlaceAPI1("/customer/api/customer?"),
	GetCustName("/customer/api/customer?customerName="),
	deletePlaceAPI("/maps/api/place/delete/json"),
	AddCustomer("/customer/api/customer?"+"defaultUser=true&defaultOrg=true");
	
	
	
	
	
	
	
	private String resource;
	
	APIResources(String resource)
	{
		this.resource=resource;
	}
	
	public String getResource()
	{
		return resource;
	}
	

}
