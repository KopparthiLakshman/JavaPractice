package enumInJava;
//class EnumInJavaInnerClass{
public enum EnumInJavaInnerClass{
	SVANYC563,
	SVANYC594("https://svanyc594:8080:index.html"),
	SVANYC598("https://svanyc598:8080:index.html");


	String URL;

	EnumInJavaInnerClass(){
		URL = "Https://svanyc563:8080:index.html";
	}

	EnumInJavaInnerClass(String urlValue) {
		URL = urlValue;
	}

	public String getURL() {
		return URL;
	}
	
}
