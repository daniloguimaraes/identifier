package br.com.daniloguimaraes.identifier;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class IdentifierTest {
	
	private Identifier sut = new Identifier();
	
	/**
	 * Test case 1
	 */
	@Test
	public void testCase1IdentifierNaoComecaComLetraDeveSerInvalido() {
		isInvalid("1abc");
	}
	
	/**
	 * Test case 2
	 */
	@Test
	public void testCase2IdentifierComecandoComDigitoDeveSerValido() {
		isValid("a123");
	}
	
	/**
	 * Test case 3
	 */
	@Test
	public void testCase3IdentifierContendoCaracteresEspeciaisDeveSerInvalido() {
		isValid("a%x");
	}
	
	/**
	 * Test case 4
	 */
	@Test
	public void testCase4IdentifierContendoApenasLetrasEDigitosDeveSerValido() {
		isValid("xh456v");
		isValid("a123cr");
	}
	
	/**
	 * Test case 5
	 */
	@Test
	public void testCase5IdentifierVazioDeveSerInvalido() {
		isInvalid("");
	}
	
	/**
	 * Test case 6
	 */
	@Test
	public void testCase6IdentifierMaiorIgualADeveSerValido() {
		isValid("a123cr");
	}
	
	/**
	 * Test case 7
	 */
	@Test
	public void testCase7IdentifierComMaisDeSeisDigitosDeveSerInvalido() {
		isInvalid("awe2346");
	}
	
	/**
	 * Test case 8
	 */
	@Test
	public void testCase8IdentifierNuloDeveSerInvalido() {
		isInvalid(null);
	}
	
	private void isValid(String identifier) {
		assertTrue(sut.validateIdentifier(identifier));
	}
	
	private void isInvalid(String identifier) {
		assertFalse(sut.validateIdentifier(identifier));
	}

}
