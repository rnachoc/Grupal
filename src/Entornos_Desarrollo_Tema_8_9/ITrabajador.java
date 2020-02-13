package Entornos_Desarrollo_Tema_8_9;

public interface ITrabajador {
	
	// INTERFAZ ITRABAJADOR TERMINADA
	
	//Estos los metodos get y set de la variable sueldo
	public int getSueldo();
	
	public void setSueldo(int iSueldo);
	
	
	//Estos los metodos get y set de la variable antiguedad
	public int getAntiguedad();
	
	public void setAntiguedad(int antiguedad);
	
	
	//Funcoin para aumentar el sueldo
	public void subirSueldo(int porcentaje);
	
}