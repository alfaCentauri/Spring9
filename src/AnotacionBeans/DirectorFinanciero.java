package AnotacionBeans;

import org.springframework.beans.factory.annotation.Value;

public class DirectorFinanciero implements Empleados {
	@Value("${email}")
	private String email;
	@Value("${nombreEmpresa}")
	private String nombreEmpresa;
	private CreacionInformeFinanciero informeFinanciero;

	/**
	 * Constructor con inyección de dependencias.
	 **/
	public DirectorFinanciero(CreacionInformeFinanciero informeFinanciero) {
		super();
		this.informeFinanciero = informeFinanciero;
	}

	@Override
	public String getTareas() {
		return "Gestión y dirección de las operaciones financieras de la empresa.";
	}

	@Override
	public String getInforme() {
		return this.informeFinanciero.getInformeFinanciero();
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @return the nombreEmpresa
	 */
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

}
