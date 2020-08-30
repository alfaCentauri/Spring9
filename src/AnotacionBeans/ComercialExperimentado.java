package AnotacionBeans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ComercialExperimentado implements Empleados {
	private CreacionInformeFinanciero informeTrimestre1;
		
	/**
	 * Método sobreescrito que muestra las tareas.
	 * @return Regresa una cadena.
	 * */
	@Override
	public String getTareas() {
		return "Convencer al cliente y vender el producto.";
	}

	/**
	 * Método sobreescrito que genera el informe financiero del primer trimestre.
	 * @return Regresa una cadena.
	 **/
	@Override
	public String getInforme() {
		return this.informeTrimestre1.getInformeFinanciero();
	}

	/**
	 * @param informeTrimestre1 the informeTrimestre1 to set
	 */
	@Autowired
	@Qualifier("informeAnual")
	public void setInformeTrimestre1(CreacionInformeFinanciero informeTrimestre1) {
		this.informeTrimestre1 = informeTrimestre1;
	}

	/**Método que se ejecuta después de la creación del bean. */
	@PostConstruct
	public void creation() {
		System.out.println("Ejecutado tras la creación del bean **********.");
	}
	
	/**Método que se ejecuta antes de la destrucción del bean. */
	@PreDestroy
	public void destroy() {
		System.out.println("Ejecutado antes de la destrucción del bean. !!!!!!!!!");
	}
}
