package inheritance;

public class Passenger 
{
	int seatNo;
	String Name;
	int age;
	public Passenger() 
	{
		this.seatNo=0;
		this.Name="NA";
		this.age=0;
		
	}
	/**
	 * @param seatNo
	 * @param name
	 * @param age
	 */
	public Passenger(int seatNo, String name, int age) {
		super();
		this.seatNo = seatNo;
		Name = name;
		this.age = age;
	}
	/**
	 * @param seatNo
	 * @param name
	 */
	public Passenger(int seatNo, String name) {
		super();
		this.seatNo = seatNo;
		Name = name;
	}
	/**
	 * @param name
	 * @param age
	 */
	public Passenger(String name, int age) {
		super();
		Name = name;
		this.age = age;
	}
	
	/**
	 * @param name
	 */
	public Passenger(String name) {
		super();
		Name = name;
	}
	/**
	 * @return the seatNo
	 */
	public int getSeatNo() {
		return seatNo;
	}
	/**
	 * @param seatNo the seatNo to set
	 */
	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + age;
		result = prime * result + seatNo;
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Passenger other = (Passenger) obj;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		if (age != other.age)
			return false;
		if (seatNo != other.seatNo)
			return false;
		return true;
	}
	
	

}
