package tests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import persistence.Teacher;
import services.ApplicationServicesRemote;

public class TestAddTeacher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			ApplicationServicesRemote proxy = (ApplicationServicesRemote) context
					.lookup("edu.esprit.revision/ApplicationServices!services.ApplicationServicesRemote");

			Teacher teacher = new Teacher("mouna");
			Teacher teacher2 = new Teacher("taib");
			Teacher teacher3 = new Teacher("majda");

			proxy.addTeacher(teacher);
			proxy.addTeacher(teacher2);
			proxy.addTeacher(teacher3);

		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
