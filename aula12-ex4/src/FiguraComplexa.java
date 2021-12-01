

import java.util.ArrayList;
import java.util.List;

public class FiguraComplexa extends Figura {

	List<Figura> figuras = new ArrayList<>();
	
	public void adicionarFigura(Figura figura) {
		figuras.add(figura);
	}
	
	@Override
	protected double calcularArea() {
		double areaTotal = 0.0;
		
		for (Figura figura : figuras) {
			areaTotal+=figura.calcularArea();
		}
		return areaTotal;
	}
}
