package tile;


public class DotFactory {
	public enum DotType {
		Square, Unit
	}
	
	public Dot create(DotType type) {
		if (type == DotType.Square) 
			return new Square();
		if(type == DotType.Unit)
			return new Unit();
		return null;		
	}
}
