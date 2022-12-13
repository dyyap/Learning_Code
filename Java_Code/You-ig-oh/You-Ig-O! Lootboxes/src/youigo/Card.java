package youigo;

public class Card {

	private int level;
	private double value;
	private String name;
	
	public Card(Card copy) {
		this.name=copy.getName();
		this.level=copy.getLevel();
		this.value=copy.getValue();
	}
	
	public Card(String name, int lvl, double val) {
		this.name=name;
		level=lvl;
		value=val;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double val) {
		value = val;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int lvl) {
		level = lvl;
	}

	@Override
	public String toString() {
		return "Name: "+name+" | Level: "+level+" | Value: "+String.format("%.2f", value);
		
	}
	
}
