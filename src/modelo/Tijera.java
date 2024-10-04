
package modelo;

public class Tijera {
    
    private String codTijera;
    private String material;
    private String tipoPunta;
    private String tipoTijera;
    private String color;

    //Constructor
    public Tijera(String codTijera, String material, String tipoPunta, String tipoTijera, String color) {
        this.codTijera = codTijera;
        this.material = material;
        this.tipoPunta = tipoPunta;
        this.tipoTijera = tipoTijera;
        this.color = color;
    }

    //Geters and Seters
    public String getCodTijera() {
        return codTijera;
    }

    public void setCodTijera(String codTijera) {
        this.codTijera = codTijera;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTipoPunta() {
        return tipoPunta;
    }

    public void setTipoPunta(String tipoPunta) {
        this.tipoPunta = tipoPunta;
    }

    public String getTipoTijera() {
        return tipoTijera;
    }

    public void setTipoTijera(String tipoTijera) {
        this.tipoTijera = tipoTijera;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
    
}
