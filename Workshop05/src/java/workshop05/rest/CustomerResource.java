/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop05.rest;

import workshop05.business.CustomerBean;
import workshop05.model.Customer;
import java.util.Optional;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@RequestScoped
@Path("/customer")
public class CustomerResource {
    
    @EJB CustomerBean customerBean;
    
    @GET
    @Path("{custId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response get(@PathParam("custId") Integer custId) {
        
        Optional<Customer> opt = customerBean.findByCustomerId(custId);
        
        if (!opt.isPresent())
            return (Response.status(Response.Status.NOT_FOUND).build());
        
        return (Response.ok(opt.get().toJson()).build());        
    }
}