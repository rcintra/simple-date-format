package br.com.rcintra.solution.one;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void test_parse_solution_one() throws Exception {
		String target = "2019-07-27";
		Date myDate = new Date(1564196400000L);
		assertEquals(myDate.getTime(), DateUtil.parse(target).getTime());
	}
	
	@Test
	public void test_format_solution_one() throws Exception {
		Date target = new Date(1564196400000L);
		assertEquals("2019-07-27", DateUtil.format(target));
	}
}
