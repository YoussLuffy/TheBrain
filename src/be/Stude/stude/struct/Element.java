package be.Stude.stude.struct;

public class Element {
	private int themeId;
	private String word;
	private String description;
	private int check;
	
	public Element(int themeId, String word, String description) {
		this.themeId = themeId;
		this.word = word;
		this.description = description;
		check = 0;
	}
	
	public int getThemeId() {
		return themeId;
	}

	public void setThemeId(int theme) {
		this.themeId = theme;
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
