package controllers;

import play.*;
import play.mvc.*;
import play.data.*;
import static play.data.Form.*;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Transaction;

import views.html.Monitor.*;

import javax.inject.Inject;
import javax.persistence.PersistenceException;

import models.*;

public class MonitoresController extends Controller{
	private FormFactory formFactory;

    @Inject
    public MonitoresController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

	public Result index()
	{
		return ok (index.render());
		//return GO_INDEX;
	}
	
	public Result create()
	{
		Form<Monitor> monitorForm = formFactory.form(Monitor.class);
		return ok(create.render(monitorForm));
	}
	
	public Result save()
	{
		Form<Monitor> monitorForm = formFactory.form(Monitor.class).bindFromRequest();
		if(monitorForm.hasErrors())
		{
			return badRequest(create.render(monitorForm));
		}
		monitorForm.get().save();
		return redirect("/monitor/index");
		//return GO_INDEX;
	}
	
	
       

}

