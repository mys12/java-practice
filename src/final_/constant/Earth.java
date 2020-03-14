package final_.constant;

public class Earth {
	
	public static final double EARTH_RADIUS = 6400;
	public static final double EARTH_AREA;

	static{
		EARTH_AREA = EARTH_RADIUS * EARTH_RADIUS * 4 * Math.PI;
	}
}
