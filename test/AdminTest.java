package test;

import static org.junit.Assert.*;

import org.junit.Test;

import ip_lab5.Incident;
import ip_lab5.Admin;

public class AdminTest {

	@Test
	public void testCreateIncident() {
		Admin testadmin = new Admin();
		Incident test = new Incident(3,"Cutremur mare","Cutremur",true);
		testadmin.createIncident(3,"Cutremur mare","Cutremur",true);
		
		assertEquals(test,testadmin.getIncident()[0]);
	}
	
	@Test
	public void testCreateNotification() {
		Admin testadmin = new Admin();
}
