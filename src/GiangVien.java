import java.util.Objects;

public class GiangVien {
    private int id ;
    private String firstName ;
    private String lastName ;
	public GiangVien() {
	}
	
    public GiangVien(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public int getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public int hashCode() {
		int hash = 7;
		hash = 17 * hash + this.id;
		hash = 17 * hash + Objects.hashCode(this.firstName);
		hash = 17 * hash + Objects.hashCode(this.firstName);
		return hash;
	}
	@Override
	public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if (getClass()!= obj.getClass()){
            return false;
        }
        final GiangVien other = (GiangVien) obj;
        if(this.id!=other.id){
            return false;
        }
        if(!Objects.equals(this.lastName,other.lastName)){
            return false;
        }
        return true;        
    }
	@Override
	public String toString() {
		return "GiangVien [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
}
