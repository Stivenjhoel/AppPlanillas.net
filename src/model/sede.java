package model;

public class sede {
    int id, idDepartamento, idProvinia, idDistrito, idEstado;
    String Nombre, Direccion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public int getIdProvinia() {
        return idProvinia;
    }

    public void setIdProvinia(int idProvinia) {
        this.idProvinia = idProvinia;
    }

    public int getIdDistrito() {
        return idDistrito;
    }

    public void setIdDistrito(int idDistrito) {
        this.idDistrito = idDistrito;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setRegisto( String[] aRegistro ){
        if(aRegistro == null ) return;

        id = Integer.parseInt( aRegistro[0] );
        Nombre = aRegistro[1];
        Direccion = aRegistro[2];
        idDepartamento = Integer.parseInt( aRegistro[3] );
        idProvinia = Integer.parseInt( aRegistro[4] );
        idDistrito = Integer.parseInt( aRegistro[5] );
        idEstado = Integer.parseInt( aRegistro[6] );
    }
}