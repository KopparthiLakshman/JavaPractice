package enumInJava;
//class EnumInJavaInnerClass{
	enum SERVER_URL{
		SVANYC563,
		SVANYC594("https://svanyc594:8080:index.html"),
		SVANYC598("https://svanyc598:8080:index.html");
		String URL;
		public String getURL() {
			return URL;
		}
		SERVER_URL(){
			URL = "Https://svanyc563:8080:index.html";
		}
		SERVER_URL(String urlValue) {
			URL = urlValue;
		}
	}
//}
