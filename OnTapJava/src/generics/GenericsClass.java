package generics;

public class GenericsClass <K, V>{

	private K key;
	private V value;
	
	public GenericsClass(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public void setK(K key) {
		this.key = key;
	}
	
	public K getK() {
		return this.key;
	}
	
	public void setV(V value) {
		this.value = value;
	}
	
	public V getV() {
		return this.value;
	}
	
	public static void main(String[] args) {
		// vì ở trên ta khởi tạo constructor có tham số nên ở đây bắt buộc phải có tham số truyền vào
		GenericsClass<Integer, String> entry = new GenericsClass<Integer, String>(3690, "Cuong");
		
		// ArrayList<String> hihi = new ArrayList<String>();
		
		// java hiểu kiểu trả về là Integer (K = Integer)
		Integer phone = entry.getK();
		
		// java hiểu kiểu trả về là String (V = String)
		String name = entry.getV();
		
		System.out.println("Phone = " + phone + "Number = " + name);
	}
}
