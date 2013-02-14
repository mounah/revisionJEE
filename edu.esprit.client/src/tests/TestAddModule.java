package tests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import persistence.Module;
import services.ApplicationServicesRemote;

public class TestAddModule {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			ApplicationServicesRemote proxy = (ApplicationServicesRemote) context
					.lookup("edu.esprit.revision/ApplicationServices!services.ApplicationServicesRemote");

			Module module = new Module();
			module.setIdModule(1);
			module.setNameModule("JEE");

			Module module2 = new Module();
			module2.setIdModule(2);
			module2.setNameModule("dotNet");

			proxy.addModule(module);
			proxy.addModule(module2);
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
