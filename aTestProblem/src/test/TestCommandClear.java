package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.junit.Before;
import org.junit.Test;

import aTestProblem.DataDate;
import aTestProblem.DataText;
import aTestProblem.Main;

public class TestCommandClear {

	@Before
	public void setUp() {

		Main.programmData = new TreeMap<>();
		List<DataText> dataText1 = new ArrayList<>();
		List<DataText> dataText2 = new ArrayList<>();
		dataText1.add(new DataText(22, "USD", "Gorm"));
		dataText1.add(new DataText(22, "USD", "Gorm"));
		dataText2.add(new DataText(22, "BRL", "Gorm"));

		Main.programmData.put(new DataDate(2001, 10, 21), dataText1);
		Main.programmData.put(new DataDate(2011, 10, 21), dataText2);

		Main.currenciesData = Main.parseCurrencies(Main.getCurrencies());
		Main.currenciesRate = new LinkedHashMap<>();
		Main.currenciesRate.put("USD", (double) 1);
		Main.currenciesRate.putAll((Map<String, Double>) Main.currenciesData.get("rates"));
	}

	@Test
	public void testCommandList() {
		final String correctClearCommand = "clear 2011-10-21";
		final String correctClearCommandWrongDate = "clear 2010-10-21";
		final String incorrectClearCommand = "clear2011-10-21";

		Main.commandClear(correctClearCommand);
		assertEquals(1, Main.programmData.size());

		Main.commandClear(correctClearCommandWrongDate);
		assertEquals(1, Main.programmData.size());

		Main.commandClear(incorrectClearCommand);
		assertEquals(1, Main.programmData.size());
	}

}
