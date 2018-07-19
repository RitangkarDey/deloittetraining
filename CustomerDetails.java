public class CustomerDetails 
{
	private int custId;
	private String custName;
	private int bill;
	public CustomerDetails()
	{
		custId=000;
		custName="NA";
		bill=200;
	}
	
	public CustomerDetails(int custId, String custName, int bill) {
		this();
		this.custId = custId;
		this.custName = custName;
		this.bill = bill;
	}
	
	public CustomerDetails(int custId, String custName) {
		this();
		this.custId = custId;
		this.custName = custName;
	}

	
	public CustomerDetails(String custName, int bill) {
		this();
		this.custName = custName;
		this.bill = bill;
	}
	

	public CustomerDetails(int custId, int bill) {
		this();
		this.custId = custId;
		this.bill = bill;
	}

	
	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public int getBill() {
		return bill;
	}

	public void setBill(int bill) {
		this.bill = bill;
	}

	public void disp()
	{
	System.out.println("Customer Id: "+custId);
	System.out.println("Customer Name: "+custName);
	System.out.println("Bill: "+bill);
	}
	
}
