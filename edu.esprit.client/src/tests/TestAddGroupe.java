package tests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import persistence.Groupe;
import services.ApplicationServicesRemote;

public class TestAddGroupe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			ApplicationServicesRemote proxy = (ApplicationServicesRemote) context
					.lookup("edu.esprit.revision/ApplicationServices!services.ApplicationServicesRemote");

			Groupe groupe = new Groupe();
			groupe.setIdGroup(1);
			groupe.setNameGroup("4infoA5");

			proxy.addGroupe(groupe);

		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
