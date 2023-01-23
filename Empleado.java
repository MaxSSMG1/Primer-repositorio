package arrays;
public class Empleado {
	
	private String dni;
	private String nombre;
	private String apellidos;
	private float sueldo;

	public Empleado() {}
	public Empleado(String dni, String nombre, String apellidos, float sueldo) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sueldo = sueldo;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public float getSueldo() {
		return sueldo;
	}
	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	
}
