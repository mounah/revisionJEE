package persistence;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * Entity implementation class for Entity: Module
 * 
 */
@Entity
public class Module implements Serializable {

	private int idModule;
	private String nameModule;

	private Teacher teacher;
	private List<Groupe> groupes;
	private static final long serialVersionUID = 1L;

	public Module() {
		super();
	}

	@Id
	public int getIdModule() {
		return this.idModule;
	}

	public void setIdModule(int idModule) {
		this.idModule = idModule;
	}

	public String getNameModule() {
		return this.nameModule;
	}

	public void setNameModule(String nameModule) {
		this.nameModule = nameModule;
	}

	@OneToOne(mappedBy = "module")
	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@OneToMany(mappedBy = "module")
	public List<Groupe> getGroupes() {
		return groupes;
	}

	public void setGroupes(List<Groupe> groupes) {
		this.groupes = groupes;
	}

}
