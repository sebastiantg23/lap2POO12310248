package personas;

public class Empleado {
    private int idt;
    private String nombre;
    private String apellido;
    private int salario;

    public Empleado(int idt, String nombre, String apellido, int salario) {
        this.idt = idt;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public int getIdt() {
        return idt;
    }

    public void setIdt(int idt) {
        this.idt = idt;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getSalarioAnual () {
        return getSalario() * 12;
    }
}
