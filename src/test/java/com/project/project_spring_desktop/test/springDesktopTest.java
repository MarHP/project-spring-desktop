/**
 * 
 */
package com.project.project_spring_desktop.test;

import static org.junit.Assert.*;

import java.util.Properties;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.projectspringdesktop.dao.DisqueraDAO;

/**
 * @author MHermosillo
 * Clase de prueba unitaria que permite realizar pruebas con el framework spring
 *
 */
public class springDesktopTest {

	@Test
	public void testContext() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		assertNotNull(context);
		System.out.println("contexto cargado exitosamente");
		
		DisqueraDAO disqueraDAO = (DisqueraDAO) context.getBean("disqueraDAO");
		assertNotNull(disqueraDAO);
		System.out.println(disqueraDAO);
		
		
		//properties
		
		Properties properties =  (Properties) context.getBean("properties");
		System.out.println(properties.get("spring-username"));
	}

}
