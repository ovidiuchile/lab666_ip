package ip_lab5;

import static org.junit.Assert.*;

import org.junit.Test;

public class IncidentTest {

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		Incident incident=new Incident(4,"Incident periculos", "Incendiu",true);
		assertEquals(incident.getDescriere(),"Incident periculos");
		assertEquals((float)incident.getGravitate(),4.0);
		assertEquals(incident.getNume(),"Incendiu");
		
		Incident incident2=new Incident(2,"Ionita","incendiu",false);
		assertEquals(incident2.getDescriere(),"Incident periculos");
		assertEquals((float)incident2.getGravitate(),4.0);
		assertEquals(incident2.getNume(),"Incendiu");
	}

}
