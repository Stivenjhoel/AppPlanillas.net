package model;

public class Departamento {
    int id;
    String RazonSocial, Cuenta;

    public Departamento(String Cuenta, String RazonSocial, int id) {
        this.Cuenta = Cuenta;
        this.RazonSocial = RazonSocial;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRazonSocial() {
        return RazonSocial;
    }

    public void setRazonSocial(String RazonSocial) {
        this.RazonSocial = RazonSocial;
    }

    public String getCuenta() {
        return Cuenta;
    }

    public void setCuenta(String Cuenta) {
        this.Cuenta = Cuenta;
    }

}