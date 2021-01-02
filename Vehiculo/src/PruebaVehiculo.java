import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PruebaVehiculo {
	public static void main(String[] arg) {

		List<Vehiculo> listV = new ArrayList<Vehiculo>();

		listV.add(new Vehiculo("Peugeot", "206", null, "4", 200000.00));
		listV.add(new Vehiculo("Honda", "Titan", "125cc", null, 60000.00));
		listV.add(new Vehiculo("Peugeot", "208", null, "5", 250000.00));
		listV.add(new Vehiculo("Yamaha", "YBR", "160cc", null, 80500.50));

		listV.forEach((v) -> {
			System.out.println(v.toString());
		});
		double mini, maxi; 
		mini = maxi = listV.get(0).getPrecio();
		String maxVeh = String.format("Vehículo más caro %s %s", listV.get(0).getMarca(), listV.get(0).getModelo());
		String minVeh = "";
		String containY = "";
		for (Vehiculo v : listV) {
			if(v.getPrecio() > maxi) {
                maxi = v.getPrecio();
                maxVeh = String.format("Vehículo más caro %s %s", listV.get(0).getMarca(), listV.get(0).getModelo());
            }
            if(v.getPrecio()<mini) {
                mini = v.getPrecio();
                minVeh = String.format("Vehículo más barato %s %s", listV.get(0).getMarca(), listV.get(0).getModelo());
            }
            if(v.getModelo().contains("Y")) {
            	NumberFormat formatoImporte = NumberFormat.getCurrencyInstance();
            	containY = String.format("Vehículo que contiene en el modelo la letra ‘Y’: %s %s %s", v.getMarca(), v.getModelo(), formatoImporte.format(v.getPrecio()));
            }
            
		}
		System.out.println("----------------------------");
		System.out.println("----------------------------");
		System.out.println(maxVeh);
        System.out.println(minVeh);
        System.out.println(containY);
        System.out.println("----------------------------");
		System.out.println("----------------------------");
        Collections.sort(listV, new RamComparator());
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        listV.forEach((v) -> {
        	System.out.println(String.format("%s %s", v.getMarca(), v.getModelo()));        	
        });
	}
}

 class RamComparator implements Comparator<Vehiculo> {
	public int compare(Vehiculo v1, Vehiculo v2) {
		return Double.compare(v2.getPrecio(), v1.getPrecio());
	}
}