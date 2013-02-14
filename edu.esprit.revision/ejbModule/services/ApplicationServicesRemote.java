package services;

import javax.ejb.Remote;

import persistence.Groupe;
import persistence.Module;
import persistence.Teacher;

@Remote
public interface ApplicationServicesRemote {
	public void addModule(Module module);

	public void addTeacher(Teacher teacher);

	public void addGroupe(Groupe groupe);

	public void affectTeacherToModuleAndGroupe(int idTeacher, int idModule,
			int idGroupe);
}
