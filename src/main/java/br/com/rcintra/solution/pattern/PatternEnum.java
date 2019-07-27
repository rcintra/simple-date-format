package br.com.rcintra.solution.pattern;

public enum PatternEnum {

	YYYY_MM_DD("yyyy-MM-dd"),
	DD_MM_YYYY("dd-MM-yyyy");
	
	private final String pattern;
	
	PatternEnum(String pattern) {
		this.pattern = pattern;
	}
	
	public String getPattern() {
		return pattern;
	}
	
}
