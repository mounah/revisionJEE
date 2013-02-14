package persistence;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Teacher
 *
 */
@Entity

public class Teacher implements Serializable {

	
	private int idTeacher;
	private String nameTeacher;
	
	private Module module;
	private static final long serialVersionUID = 1L;

	public Teacher() {
		super();
	}   
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getIdTeacher() {
		return this.idTeacher;
	}

	public void setIdTeacher(int idTeacher) {
		this.idTeacher = idTeacher;
	}   
	public String getNameTeacher() {
		return this.nameTeacher;
	}

	public void setNameTeacher(String nameTeacher) {
		this.nameTeacher = nameTeacher;
	}
	@OneToOne
	public Module getModule() {
		return module;
	}
	public void setModule(Module module) {
		this.module = module;
	}
	public Teacher(String nameTeacher) {
		super();
		this.nameTeacher = nameTeacher;
	}
	
	
   
}
