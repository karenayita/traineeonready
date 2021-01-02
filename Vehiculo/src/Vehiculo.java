
public class Vehiculo {
	String marca;
	String modelo;
	String cilindrada;
	String puertas;
	double precio;

	public Vehiculo(String marca, String modelo, String cilindrada, String puertas, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.cilindrada = cilindrada;
		this.puertas = puertas;
		this.precio = precio;

	}

	public Vehiculo(String marca, double precio) {
		this.marca = marca;
		this.precio = precio;

	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPuertas() {
		return puertas;
	}

	public void setPuertas(String puertas) {
		this.puertas = puertas;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return String.format("%s %s %s %s %s","Marca: " + marca,
				                   "// Modelo: " + modelo,
				                   puertas != null ? "// Puertas: " + puertas: "",
				                   cilindrada != null ? "// cilindrada: " + cilindrada: "",
				                   "// Precio: " + precio);
	}

}