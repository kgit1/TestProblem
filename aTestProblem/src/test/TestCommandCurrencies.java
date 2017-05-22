package test;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import aTestProblem.Main;

public class TestCommandCurrencies {

	@Before
	public void setCurrencies() {
		Main.currenciesData = Main.parseCurrencies(Main.getCurrencies());
		Main.currenciesRate = new LinkedHashMap<>();
		Main.currenciesRate.put("USD", (double) 1);
		Main.currenciesRate.putAll((Map<String, Double>) Main.currenciesData.get("rates"));
	}

	@Test
	public void testCommandCurrencies() {
		System.out.println("===========================================================");
		System.out.println("Test commandCurrencies");
		Main.commandCurrencies();
		System.out.println("===========================================================");
	}

}
