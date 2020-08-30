package AnotacionBeans;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Clase que ejecuta el ejemplo.
 **/
public class Ejecutable {

	public static void main(String[] args) {
		System.out.println("Demostración del uso de la anotación bean y archivo de propiedades en Spring con Java 8.");
		try {
			AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext();
			contexto.register(EmpleadosConfig.class);
			contexto.refresh();			
			DirectorFinanciero empleado = contexto.getBean("directorFinanciero", DirectorFinanciero.class);
			System.out.println(empleado.getInforme());
			System.out.println("El correo es: " + empleado.getEmail());
			System.out.println("La empresa es: " + empleado.getNombreEmpresa());
			contexto.close();
		}catch(BeansException ex){
			System.out.println("Error: Con la creación del bean.");
		}
		System.out.println("Fin de la demostración.");
	}

}
