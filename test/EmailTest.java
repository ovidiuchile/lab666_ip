package test;

import static org.junit.Assert.*;

import org.junit.Test;

import ip_lab5.Email;

public class EmailTest {

	Email test = new Email();
	@Test
	public void testEmail1() {
		test.setEmail("abc@abc.abc");
		assertEquals(test.getEmail(),"abc@abc.abc");
	}
	
	@Test
	public void testEmail2() {
		test.setEmail(null);
		assertEquals(test.getEmail(),"Error");
	}
	
	@Test
	public void testEmail3() {
		test.setEmail("abc@abc");
		assertEquals(test.getEmail(),"Error");
	}
	
	@Test
	public void testEmail4() {
		test.setEmail("abc.abc");
		assertEquals(test.getEmail(),"Error");
	}
	
	@Test
	public void testEmail5() {
		test.setEmail("abc");
		assertEquals(test.getEmail(),"Error");
	}

}
