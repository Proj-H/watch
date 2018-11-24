package watchcore;

public class Watch {
	
	String name;
	int idNumber;
	String model;
	
	
	
	public Watch(String name, int idNumber, String model) {
		super();
		this.name = name;
		this.idNumber = idNumber;
		this.model = model;
	}
	
	public String getName(){
		return name;
	}
	
	public int getIdNumber(){
		return idNumber;
	}
	
	public String getModel(){
		return model;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setIdNumber(int idNumber){
		this.idNumber = idNumber;
	}
	
	public void setModel(String model){
		this.model = model;
	}

}
