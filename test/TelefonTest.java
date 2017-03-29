package ip_lab5;

import static org.junit.Assert.*;

import org.junit.Test;

public class TelefonTest {

	@Test
	public void test() {
		boolean TestTrimiteSms;
		Telefon tel=new Telefon();
		assertEquals(tel.getTelefon().length(),10);
		TestTrimiteSms=tel.trimiteSms("Incendiu pe DN1; Cutremur in Pantelimon");
		assertEquals(TestTrimiteSms,true);
	}

}
