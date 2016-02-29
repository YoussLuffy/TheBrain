package be.Stude.stude.struct;

public class Element {
	private String theme;
	private String word;
	private String description;
	private int check;
	
	public Element(String theme, String word, String description) {
		this.theme = theme;
		this.word = word;
		this.description = description;
		check = 0;
	}
	
	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCheck() {
		return check;
	}

	public void setCheck(int check) {
		this.check = check;
	}
}
