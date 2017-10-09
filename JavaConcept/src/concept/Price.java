package concept;

public class Price {

	 private String item;
	    private int price;
	     
	    public Price(String itm, int pr){
	        this.item = itm;
	        this.price = pr;
	    }
	    public String getItem() {
	        return item;
	    }
	    public void setItem(String item) {
	        this.item = item;
	    }
	    public int getPrice() {
	        return price;
	    }
	    public void setPrice(int price) {
	        this.price = price;
	    }
	     
	   
	    @Override
		public String toString() {
			return "Price [item=" + item + ", price=" + price + "]";
		}
	/*	public boolean equals(Object obj){
	        System.out.println("In equals");
	        if (obj instanceof Price) {
	            Price pp = (Price) obj;
	            return (pp.item.equals(this.item) && pp.price == this.price);
	        } else {
	            return false;
	        }
	    }*/
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((item == null) ? 0 : item.hashCode());
			result = prime * result + price;
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Price other = (Price) obj;
			if (item == null) {
				if (other.item != null)
					return false;
			} else if (!item.equals(other.item))
				return false;
			if (price != other.price)
				return false;
			return true;
		}
	    
	    
	    
	     
}
