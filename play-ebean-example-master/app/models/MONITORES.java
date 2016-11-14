package models;


import java.util.*;

import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

@Entity

public class MONITORES extends Model {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    
	public Long id;
    
    @Constraints.Required(message="Debe ingresar su nombre.")
    public String nombre;
    
    @Constraints.Required(message="Debe ingresar la descripción.")
    public String descripcion;

}
