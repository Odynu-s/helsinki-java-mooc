package reference.domain;

public enum Rating {
	BAD(-5),
	MEDIOCRE(-3),
	NOT_WATCHED(0),
	NEUTRAL(1),
	FINE(3),
	GOOD(5);
	
	private Integer value;
	
	private Rating(Integer value) {
		this.value = value;
	}
	
	public Integer getValue() {
		return value;
	}
}