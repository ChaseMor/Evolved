
public class MutInteger implements Mutable {


	public static final int MAX = Integer.MAX_VALUE;
	public static final int MIN = Integer.MIN_VALUE;
	
	private int value;
	private int low;
	private int high;
	private Mutable.MODE mode;
	
	public MutInteger(int value) {
		this(value, MIN, MAX, MODE.EVEN);
	}

	public MutInteger(int value, int low, int high) {
		this(value, low, high, MODE.EVEN);
	}

	public MutInteger(int value, int low, int high, MODE mode) {
		this.value = value;
		this.low = low;
		this.high = high;
		this.mode = mode;
	}
	
	public String toString() {
		return "" + value;
	}
	@Override
	public void mutate() {
		// TODO Auto-generated method stub
		if (mode == MODE.EVEN) {
			double rand = Math.random();
			value = (int) ((rand * high) - (rand * low) + low);
		} else if (mode == MODE.BELL) {
			
		}
	}

}
