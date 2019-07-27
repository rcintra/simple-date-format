package br.com.rcintra.solution;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)				
@Suite.SuiteClasses({				
	br.com.rcintra.solution.one.DateUtilTest.class,
	br.com.rcintra.solution.two.DateUtilTest.class,  			
})
public class AllTests {
	// This class remains empty, it is used only as a holder for the above annotations		
}