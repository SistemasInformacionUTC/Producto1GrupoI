package models;


import java.util.*;

import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

@Entity
public class Monitor extends Model{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    
	public Long id;
    
    @Constraints.Required(message="ingresar su nombre.")
    public String nombre;
    
    @Constraints.Required(message="ingreso cantidad.")
    public String cantidad;

   
	public static Find<Long,Monitor> find = new Find<Long,Monitor>(){};

    public static PagedList<Monitor> page(int page, int pageSize, String sortBy, String order, String filter) {
        return
            find.where()
                .ilike("nombre", "%" + filter + "%")
                .orderBy(sortBy + " " + order)
                .findPagedList(page, pageSize);
    }
}

