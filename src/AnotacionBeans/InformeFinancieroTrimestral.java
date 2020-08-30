package AnotacionBeans;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrimestral implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		return "Presentación del informe financiero trimestral.";
	}

}
