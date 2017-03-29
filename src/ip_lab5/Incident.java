package ip_lab5;

public class Incident {

    private Integer gravitate;
    private String descriere;
    private String nume;
    private boolean urgent;
    
    public Incident(Integer gravitate, String descriere, String nume, boolean urgent) {
        if (validate(gravitate,descriere,nume)) {
            this.gravitate = gravitate;
            this.descriere = descriere;
            this.nume = nume;
            this.urgent = urgent;
        }
        else
            throw new IllegalArgumentException();
       
    }
    
    public final boolean validate(Integer gravitate, String descriere, String nume)
    {
        return (descriere != null) && (gravitate >= 1 && gravitate <= 5) && (nume != null);
    }

    public String getDescriere() {
        return descriere;
    }

    public Integer getGravitate() {
        return gravitate;
    }

    public String getNume() {
        return nume;
    }

    public boolean isUrgent() {
        return urgent;
    }
    
}