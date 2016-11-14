package models;

import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

/**
 * Computer entity managed by Ebean
 */
@Entity 
public class Video extends Model {

    private static final long serialVersionUID = 1L;

	@Id
    public Long id;
    
    @Constraints.Required
    public String nombre;
    
    @Constraints.Required
    public String precio;

    @Constraints.Required
    public String capacidad;

    @ManyToOne
    public Company company;
    
    /**
     * Generic query helper for entity Computer with id Long
     */
    public static Find<Long,Video> find = new Find<Long,Video>(){};
    
    /**
     * Return a paged list of computer
     *
     * @param page Page to display
     * @param pageSize Number of computers per page
     * @param sortBy Computer property used for sorting
     * @param order Sort order (either or asc or desc)
     * @param filter Filter applied on the name column
     */
    
    
}

