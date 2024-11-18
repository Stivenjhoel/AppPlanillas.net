package model;

public class CentroCosto {
    int id;
    String Detalle;

    public CentroCosto(String Detalle, int id) {
        this.Detalle = Detalle;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDetalle() {
        return Detalle;
    }

    public void setDetalle(String Detalle) {
        this.Detalle = Detalle;
    }

    
}