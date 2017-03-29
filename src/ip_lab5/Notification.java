package ip_lab5;
import java.util.ArrayList;

public class Notification {

  public String phase;  
  public ArrayList<Canal>  canale;

  public Notification(String phase, ArrayList<Canal>  canale){
	  this.phase = phase;
	  this.canale = new ArrayList<Canal>(canale);
  }
  public void send() {
  }

}