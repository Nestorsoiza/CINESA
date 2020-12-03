package cinema;

public class Principal {

	public static void main(String[] args) {
		Pelicula pelicula = new Pelicula("Mi vida", 90, 16, "DDR");
		System.out.println("Introduce el numero de filas");
		System.out.println("Introduce el numero de columnas");
		System.out.println("Introduce el precio de la entrada de cine");
		
		
		Cine cine = new Cine(filas, columnas, precio, pelicula);
		System.out.println("Introduce el numero de espectadores a crear");
		Espectador e;
		int fila;
		char letra;
		System.out.println("Espectadores generados: ");
		
		for (int i = 0; i < numEspectadores &amp;&amp; cine.haySitio(); i++) {
	}
		e = new Espectador(nombre, edad, dinero);
		Metodos.nombres[Metodos.generaNumeroAleatorio(10, 30)];
		Metodos.generaNumeroEnteroAleatorio(1, 10)); 

		System.out.println(e);
		do {
		fila = Metodos.generaNumeroEnteroAleatorio(0, cine.getFilas() - 1);
		letra = (char) Metodos.generaNumeroEnteroAleatorio('A', 'A' + (cine.getColumnas()-1));
		} while (cine.haySitioButaca(fila, letra));
		if (cine.sePuedeSentar(e)) {
		e.pagar(cine.getPrecio()); 
		cine.sentar(fila, letra, e); 
		}
}
