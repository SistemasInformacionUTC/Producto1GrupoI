package models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.Constraint;

import com.avaje.ebean.Model;

public class Disco  extends Model {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    
	public Long id;
    
    @Constraint.Required(message=" ingresar nombre del disco.")
    public String nombre;
    
    @Constraints.Required(message=" ingresar su marca.")
    public String descripcion;
    
    @Constraints.Required(message="");
	
}

