package ip_lab5;

import java.util.ArrayList;

public class Admin {

    private ArrayList<Incident>  myIncidents;

  public Incident createIncident(Integer gravitate, String descriere, String nume, boolean urgent) {
	  Incident incident = new Incident(gravitate, descriere, nume, urgent);
	  myIncidents.add(incident);
	  return incident;
  }

  public Notification createNotification(Incident incident, String phase, ArrayList<Canal> canale) {
	  return null;
  }

}