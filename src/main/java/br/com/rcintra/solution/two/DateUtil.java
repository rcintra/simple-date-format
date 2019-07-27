package br.com.rcintra.solution.two;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import br.com.rcintra.solution.pattern.PatternEnum;

public class DateUtil {

	public static final DateTimeFormatter DATE_TIME_FORMATTER = 
			DateTimeFormatter.ofPattern(PatternEnum.YYYY_MM_DD.getPattern());

	private DateUtil() {}

	public static LocalDate parse(String target) {
		return LocalDate.parse(target, DATE_TIME_FORMATTER);
	}

	public static String format(LocalDate target) {
		return target.format(DATE_TIME_FORMATTER);
	}
	
}
