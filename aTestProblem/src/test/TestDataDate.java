package test;

import static org.junit.Assert.*;

import org.junit.Test;

import aTestProblem.DataDate;

public class TestDataDate {

	@Test
	public void test() {
		final int year = 2002;
		final int month = 11;
		final int day = 24;

		DataDate dataDate = new DataDate(year, month, day);

		assertEquals(2002, dataDate.getYear());
		assertEquals(11, dataDate.getMonth());
		assertEquals(24, dataDate.getDay());
		assertEquals(year, dataDate.getYear());
		assertEquals(month, dataDate.getMonth());
		assertEquals(day, dataDate.getDay());

		assertEquals("2002-11-24", dataDate.toString());

		assertNotNull(dataDate.compareTo(dataDate));
		assertEquals(0, dataDate.compareTo(dataDate));

		assertEquals("year bigger", -1, dataDate.compareTo(new DataDate(2003, 11, 24)));
		assertEquals("month bigger", -1, dataDate.compareTo(new DataDate(2002, 12, 24)));
		assertEquals("day bigger", -1, dataDate.compareTo(new DataDate(2002, 11, 25)));
		assertEquals("year smaller", 1, dataDate.compareTo(new DataDate(2001, 11, 24)));
		assertEquals("month smaller", 1, dataDate.compareTo(new DataDate(2002, 10, 24)));
		assertEquals("day smaller", 1, dataDate.compareTo(new DataDate(2002, 11, 22)));

	}

}
