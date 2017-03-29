package ip_lab5;

public class Email extends Canal {

    private String email;
    private String nume;
    private String mesaj;

    public Email(String email, String nume){
        validate(email,nume);
        this.email = email;
        this.nume = nume;
        }
    
    public void validate(String email, String nume) {
           String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
           java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
           java.util.regex.Matcher m = p.matcher(email);
           if( m.matches() == false || nume == null )
               throw new IllegalArgumentException();
    }
    
    public String getEmail() {
        return email;
    }

    public String getNume() {
        return nume;
    }
    public boolean trimite(String mesaj) {
    	  System.out.println(this.nume + " [" +this.email + "]: " + mesaj);
    	  return true;
      }
    
}
    
