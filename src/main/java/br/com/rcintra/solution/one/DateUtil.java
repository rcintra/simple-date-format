package br.com.rcintra.solution.one;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.rcintra.solution.pattern.PatternEnum;

public class DateUtil {

	public static final ThreadLocal<SimpleDateFormat> SIMPLE_DATE_FORMAT = 
			ThreadLocal.withInitial(() -> new SimpleDateFormat(PatternEnum.YYYY_MM_DD.getPattern()));

	private DateUtil() {
	}

	public static Date parse(String target) {
		try {
			return SIMPLE_DATE_FORMAT.get().parse(target);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String format(Date target) {
		return SIMPLE_DATE_FORMAT.get().format(target);
	}
	
}
