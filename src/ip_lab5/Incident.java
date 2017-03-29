package ip_lab5;

public class Incident {

    private final Integer gravitate;
    private final String descriere;
    private final String nume;
    private final boolean urgent;
    
    public Incident(Integer gravitate, String descriere, String nume, boolean urgent) {
        
        validate(gravitate,descriere,nume); 
        this.gravitate = gravitate;
        this.descriere = descriere;
        this.nume = nume;
        this.urgent = urgent;
    }
    
    private void validate(Integer gravitate, String descriere, String nume)
    {
        if((descriere == null) || (gravitate < 1 || gravitate > 5) || (nume == null))
            throw new IllegalArgumentException();
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