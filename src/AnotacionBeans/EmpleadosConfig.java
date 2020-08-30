package AnotacionBeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Clase de configuración de Spring para demostrar el uso de la anotación Configuration, ComponentScan y Bean.
 * @author Ricardo Presilla.
 * @version 1.0.
 **/
@Configuration
@ComponentScan("AnotacionBean")
@PropertySource("classpath:datosEmpresas.propiedades")
public class EmpleadosConfig {
	/**
	 * Define el bean para la clase InformeFinancieroDptoCompras.
	 **/
	@Bean
	public CreacionInformeFinanciero informeFinancieroDptoCompras() {
		return new InformeFinancieroDptoCompras();
	}
	
	/** 
	 * Define el bean para la clase DirectorFinanciero e inyecta la dependencia.
	 **/
	@Bean
	public Empleados directorFinanciero() {
		return new DirectorFinanciero(this.informeFinancieroDptoCompras());
	}
}
