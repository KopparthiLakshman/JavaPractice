package accessmodifiers;

public class access2 {
	
	int a[][]={{1,1,1},{2,2,2},{3,3,3}};    
	int b[][]={{1,1,1},{2,2,2},{3,3,3}};    
	
	public void accMethod() { }
	private void eating() { }
	void drinking() { }
	protected void running() { }

	public void accMethod(int i) { }
	@SuppressWarnings("unused")
	private void eating(int i) { }
	void drinking(int i) { }
	protected void running(int i) {
	}
	
	

}

class access3 {
	
	public void accMethod() { }
	private void eating() { }
	void drinking() { }
	protected void running() { }
	
}