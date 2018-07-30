package collections;

public class Customer {

	
		private int customerId;
		private String customerName;
		private String customerAddress;
		private double billAmount;
		
		public Customer() {
			// TODO Auto-generated constructor stub
		}

		/**
		 * @param customerId
		 * @param customerName
		 * @param customerAddress
		 * @param billAmount
		 */
		public Customer(int customerId, String customerName, String customerAddress, double billAmount) {
			super();
			this.customerId = customerId;
			this.customerName = customerName;
			this.customerAddress = customerAddress;
			this.billAmount = billAmount;
		}

		/**
		 * @return the customerId
		 */
		public int getCustomerId() {
			return customerId;
		}

		/**
		 * @param customerId the customerId to set
		 */
		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}

		/**
		 * @return the customerName
		 */
		public String getCustomerName() {
			return customerName;
		}

		/**
		 * @param customerName the customerName to set
		 */
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}

		/**
		 * @return the customerAddress
		 */
		public String getCustomerAddress() {
			return customerAddress;
		}

		/**
		 * @param customerAddress the customerAddress to set
		 */
		public void setCustomerAddress(String customerAddress) {
			this.customerAddress = customerAddress;
		}

		/**
		 * @return the billAmount
		 */
		public double getBillAmount() {
			return billAmount;
		}

		/**
		 * @param billAmount the billAmount to set
		 */
		public void setBillAmount(double billAmount) {
			this.billAmount = billAmount;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#hashCode()
		 */
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			long temp;
			temp = Double.doubleToLongBits(billAmount);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			result = prime * result + ((customerAddress == null) ? 0 : customerAddress.hashCode());
			result = prime * result + customerId;
			result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
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
			Customer other = (Customer) obj;
			if (Double.doubleToLongBits(billAmount) != Double.doubleToLongBits(other.billAmount))
				return false;
			if (customerAddress == null) {
				if (other.customerAddress != null)
					return false;
			} else if (!customerAddress.equals(other.customerAddress))
				return false;
			if (customerId != other.customerId)
				return false;
			if (customerName == null) {
				if (other.customerName != null)
					return false;
			} else if (!customerName.equals(other.customerName))
				return false;
			return true;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
					+ customerAddress + ", billAmount=" + billAmount + "]";
		}
		
	

}
