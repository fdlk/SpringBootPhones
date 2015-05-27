package hello;

public class Phone {

	private final String age;
	private final String id;
	private final String imageUrl;
	private final String name;
	private final String snippet;

	public Phone(String age, String id, String imageUrl, String name,
			String snippet) {
		super();
		this.age = age;
		this.id = id;
		this.imageUrl = imageUrl;
		this.name = name;
		this.snippet = snippet;
	}

	public String getAge() {
		return age;
	}

	public String getId() {
		return id;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public String getName() {
		return name;
	}

	public String getSnippet() {
		return snippet;
	}

	
	
}
