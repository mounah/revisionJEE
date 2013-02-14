package services;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import persistence.Groupe;
import persistence.Module;
import persistence.Teacher;

/**
 * Session Bean implementation class ApplicationServices
 */
@Stateless
public class ApplicationServices implements ApplicationServicesRemote {

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public ApplicationServices() {
	}

	@Override
	public void addModule(Module module) {
		entityManager.persist(module);
		System.out.println("happy love day ...");
	}

	@Override
	public void addTeacher(Teacher teacher) {
		entityManager.persist(teacher);
	}

	@Override
	public void addGroupe(Groupe groupe) {
		entityManager.persist(groupe);
	}

	@Override
	public void affectTeacherToModuleAndGroupe(int idTeacher, int idModule,
			int idGroupe) {
		Teacher teacherFound = entityManager.find(Teacher.class, idTeacher);
		Module moduleFound = entityManager.find(Module.class, idModule);
		Groupe groupeFound = entityManager.find(Groupe.class, idGroupe);

		teacherFound.setModule(moduleFound);
		groupeFound.setModule(moduleFound);

		entityManager.merge(teacherFound);
		entityManager.merge(groupeFound);

		System.out.println("ok");

	}

}
