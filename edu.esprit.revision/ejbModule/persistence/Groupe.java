package persistence;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Group
 *
 */
@Entity

public class Groupe implements Serializable {

	
	private int idGroup;
	private String nameGroup;
	
	private Module module;
	private static final long serialVersionUID = 1L;

	public Groupe() {
		super();
	}   
	@Id    
	public int getIdGroup() {
		return this.idGroup;
	}

	public void setIdGroup(int idGroup) {
		this.idGroup = idGroup;
	}   
	public String getNameGroup() {
		return this.nameGroup;
	}

	public void setNameGroup(String nameGroup) {
		this.nameGroup = nameGroup;
	}
	@ManyToOne
	public Module getModule() {
		return module;
	}
	public void setModule(Module module) {
		this.module = module;
	}
   
	
}
