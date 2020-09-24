package com.restwebservice.ws.rest.service;

import java.util.LinkedList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.restwebservice.ws.rest.vo.VOUser;

@Path("/ZarsWorld")
public class ServiceLoginRest {

	@POST
	@Path("/validUser")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public VOUser validUser(VOUser vo) {
		vo.setValid(false);
		if (vo.getUser().equals("Java") && vo.getPassword().equals("World"))
			vo.setValid(true);
		return vo;
	}

	@GET
	@Path("/getUsers")
	@Produces({ MediaType.APPLICATION_JSON })
	public List<VOUser> getUsers() {
		List<VOUser> list = new LinkedList<>();
		list.add(new VOUser("Zars", "Zars"));
		list.add(new VOUser("JL", "JL"));
		list.add(new VOUser("Bayern", "Bayern"));
		return list;
	}
}
