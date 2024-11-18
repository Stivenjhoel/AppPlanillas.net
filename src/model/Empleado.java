package model;

public class Empleado {
    int id;
    String Nombres, ApelidoPaterno, ApellidoMaterno;
    String Dni, Passwordd, FechaNacimiento, Direccion;
    int idDepartamento, idProvincia, idDistrito, idEstado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApelidoPaterno() {
        return ApelidoPaterno;
    }

    public void setApelidoPaterno(String ApelidoPaterno) {
        this.ApelidoPaterno = ApelidoPaterno;
    }

    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }

    public void setApellidoMaterno(String ApellidoMaterno) {
        this.ApellidoMaterno = ApellidoMaterno;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }

    public String getPasswordd() {
        return Passwordd;
    }

    public void setPasswordd(String Passwordd) {
        this.Passwordd = Passwordd;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public int getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(int idProvincia) {
        this.idProvincia = idProvincia;
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

    public void setRegisto( String[] aRegistro ){
        if(aRegistro == null ) return;

        id = Integer.parseInt( aRegistro[0] );
        Nombres = aRegistro[1];
        ApelidoPaterno = aRegistro[2];
        ApellidoMaterno = aRegistro[3];
        Dni = aRegistro[4];
        Passwordd = aRegistro[5];
        FechaNacimiento = aRegistro[6];
        Direccion = aRegistro[7];
        idDepartamento = Integer.parseInt( aRegistro[8] );
        idProvincia = Integer.parseInt( aRegistro[9] );
        idDistrito = Integer.parseInt( aRegistro[10] );
        idEstado = Integer.parseInt( aRegistro[11] );
    }
}