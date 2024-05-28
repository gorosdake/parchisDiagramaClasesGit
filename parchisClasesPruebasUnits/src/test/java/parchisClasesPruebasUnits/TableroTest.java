package parchisClasesPruebasUnits;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TableroTest 
{


	static Tablero tablero;

	 @BeforeClass
	 public static void setUpBeforeClass() throws Exception {
	 
		 tablero = new Tablero();
	 
	 }
	  
	 @Test
	 public void testCambiarFicha() {
	     try {
	         for (int i = 0; i < 21; i++) {
	        	 
	             tablero.cambiarFicha(i, i + 1);
	             
	             assertFalse(tablero.consultarCasillas()[i]);
	             assertTrue(tablero.consultarCasillas()[i + 1]);
	         }
	     } catch (Exception e) {
	    	 
	         fail("Se ha producido una excepción: " + e.toString());
	     }
	 }

}
