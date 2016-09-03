package br.com.daniloguimaraes.identifier;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class IdentifierTest {
	
	private Identifier sut = new Identifier();
	
	@Test
	public void testID1Step1() {
		isInvalid("a123");
	}
	
	@Test
	public void testID1Step2() {
		isInvalid("123456");
	}
	
	@Test
	public void testID2Step1() {
		isValid("A");
	}
	
	@Test
	public void testID2Step2() {
		isValid("xh456v");
	}
	
	@Test
	public void testID3Step1() {
		isValid("xh456v");
	}
	
	@Test
	public void testDeveComecarComDigitoDeveSerValido() {
		isValid("a123");
	}
	
	@Test(expected = NullPointerException.class)
	public void testID8_Nulo() {
		isInvalid(null);
	}
	
	private void isValid(String identifier) {
		assertTrue(sut.validateIdentifier(identifier));
	}
	
	private void isInvalid(String identifier) {
		assertFalse(sut.validateIdentifier(identifier));
	}

}
