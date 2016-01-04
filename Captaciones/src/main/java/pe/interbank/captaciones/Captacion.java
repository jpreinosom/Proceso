package pe.interbank.captaciones;

/**
 * This class was automatically generated by the data modeler tool.
 * $HASH(3c2abe33dd698b7c8bcb5ce4e23c18e0)
 */
@org.kie.api.definition.type.Label(value = "captacion")
public class Captacion  implements java.io.Serializable {

    static final long serialVersionUID = 1L;
    
    @org.kie.api.definition.type.Label(value = "edad")
    @org.kie.api.definition.type.Position(value = 0)
    private int edad;
    
    @org.kie.api.definition.type.Label(value = "puntaje")
    @org.kie.api.definition.type.Position(value = 1)
    private int puntaje;
    
    @org.kie.api.definition.type.Label(value = "viaRapida")
    @org.kie.api.definition.type.Position(value = 2)
    private java.lang.Boolean viaRapida;

    public Captacion() {
    }

    public Captacion(int edad, int puntaje, java.lang.Boolean viaRapida) {
        this.edad = edad;
        this.puntaje = puntaje;
        this.viaRapida = viaRapida;
    }


    
    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public int getPuntaje() {
        return this.puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    
    public java.lang.Boolean getViaRapida() {
        return this.viaRapida;
    }

    public void setViaRapida(java.lang.Boolean viaRapida) {
        this.viaRapida = viaRapida;
    }
}