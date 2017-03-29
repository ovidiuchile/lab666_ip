package ip_lab5;
public class Telefon extends Canal {

  private String telefon;
  private String nume;
  
  public Telefon(String telefon, String nume) {
	  validate(telefon, nume);
	  this.telefon = telefon;
	  this.nume = nume;
  }
  
  private void validate(String telefon, String nume) {
	  if(telefon.isEmpty() || nume.isEmpty()) throw new IllegalArgumentException("Parametru nevalid"); 
  }

  public boolean trimite(String mesaj) {
	  System.out.println(this.nume + " [" +this.telefon + "]: " + mesaj);
	  return true;
  }
  
    public String getTelefon() {
        return telefon;
    }
    
    public String getNume() {
    	return this.nume;
    }

}