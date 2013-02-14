package tests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import services.ApplicationServicesRemote;

public class TestAffectTeacherToModuleAndGroupe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			ApplicationServicesRemote proxy = (ApplicationServicesRemote) context
					.lookup("edu.esprit.revision/ApplicationServices!services.ApplicationServicesRemote");

			proxy.affectTeacherToModuleAndGroupe(2, 1, 1);

		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
