package com.numberguess.validator;

import java.util.ArrayList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AppValidatorTest</code> contains tests for the class <code>{@link AppValidator}</code>.
 *
 * @generatedBy CodePro at 12/19/14 3:43 PM
 * @author nishi_000
 * @version $Revision: 1.0 $
 */
public class AppValidatorTest {
	/**
	 * Run the boolean validateResponse(String,List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/19/14 3:43 PM
	 */
	@Test
	public void testValidateResponse_1()
		throws Exception {
		String response = "";
		List<String> validResponses = new ArrayList<String>();

		boolean result = AppValidator.validateResponse(response, validResponses);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean validateResponse(String,List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/19/14 3:43 PM
	 */
	@Test
	public void testValidateResponse_2()
		throws Exception {
		String response = "";
		List<String> validResponses = new ArrayList<String>();

		boolean result = AppValidator.validateResponse(response, validResponses);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean validateResponse(String,List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/19/14 3:43 PM
	 */
	@Test
	public void testValidateResponse_3()
		throws Exception {
		String response = "";
		List<String> validResponses = null;

		boolean result = AppValidator.validateResponse(response, validResponses);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean validateResponse(String,List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/19/14 3:43 PM
	 */
	@Test
	public void testValidateResponse_4()
		throws Exception {
		String response = "";
		List<String> validResponses = new ArrayList<String>();

		boolean result = AppValidator.validateResponse(response, validResponses);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 12/19/14 3:43 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 12/19/14 3:43 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 12/19/14 3:43 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AppValidatorTest.class);
	}
}