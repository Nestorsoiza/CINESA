package cinema;

public class Cine {
	private Asiento asientos [][];
	private double precio;
	private Pelicula pelicula;
	
	public Cine(int filas, int columnas, double precio, Pelicula pelicula) {
		super();
		asientos = new Asiento[filas][columnas];
		this.precio = precio;
		this.pelicula = pelicula;
		rellenaButacas();
	}

	public Asiento[][] getAsientos() {
		return asientos;
	}

	public void setAsientos(Asiento[][] asientos) {
		this.asientos = asientos;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	private void rellenaButacas() {
		int fila = asientos.length;
		for (int i = 0; i < asientos.length; i++) {
			for (int j = 0; j < asientos.length; j++) {
				asientos[i][j] = new Asiento((char)('A' + j), fila);
			}
			fila --;
		}
	}

	public boolean haySitio() {
		for (int i = 0; i < asientos.length; i++) {
			for (int j = 0; j < asientos.length; j++) {
				if (!asientos[i][j].ocupado()) {
					return true;
				}
			}
		}
		return false;
	}
	public boolean haySitioButaca(int fila, char letra) {
		return asientos[fila][ letra].ocupado();
	}
	public boolean sePuedeSentar(Espectador e) {
		return e.tieneDinero(precio) && e.tieneEdad(pelicula.getEdadMinima());

	}
	public void sentar(int fila, char letra, Espectador e) {
		return getAsientos().setEspectador(e);
	}
	public Asiento getAsiento(int fila, char letra) {
		return asientos[asientos.length - fila - 1][letra - 'A'];
	}
	}

