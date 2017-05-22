package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestDataDate.class, TestDataText.class, TestMainUtilities.class, TestCommandHelp.class, TestCommandList.class,
		TestCommandTotal.class, TestCommandClear.class, TestCommandCurrencies.class, TestCommandExchangeRates.class, TestCommandAdd.class })
public class AllTests {

}
