package be.Stude.stude.struct;

public class Setting {
	private int mode; // 0 = word to description / 1 = description to word
	private String color;
	
	public Setting(int mode, String color) {
		this.mode = mode;
		this.color = color;
	}
	
	public int getMode() {
		return mode;
	}
	public void setMode(int mode) {
		this.mode = mode;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
