package ip_lab5;
import java.util.ArrayList;

public class Incident {

  public Integer gravitate;
  public String descriere;
  public String nume;
  public Coordonate coordonate;
  public Float raza;
  public boolean urgent;

    public ArrayList  myAdmin;
    public ArrayList  myCoordonate;
    public Incident(Integer gravitate, String descriere, String nume, boolean urgent){
    	//if(gravitate < 0 )
    		
    	this.gravitate = gravitate;
    	this.descriere = descriere;
    	this.nume = nume;
    	this.urgent = urgent;
    }
}