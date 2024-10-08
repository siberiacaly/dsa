package cv4;

public class RTP {
    public RTP next;
    public int value;

    
    public RTP(int value) {
        this.value = value;
    }
    
	public RTP getNext() {
		return next;
	}

	public void setNext(RTP next) {
		this.next = next;
	}
	
	public int getValue() {
	        return value;
	}
	 
	 public void setValue(int value) {
	        this.value = value;
	}


}