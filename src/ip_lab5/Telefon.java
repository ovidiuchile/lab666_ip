package ip_lab5;
public class Telefon extends Canal {

  private String telefon;

  public boolean trimiteSms(String mesaj) {
	  System.out.println(this.telefon + ": " + mesaj);
	  return true;
  }
  
    /**
     * @return the telefon
     */
    public String getTelefon() {
        return telefon;
    }

}