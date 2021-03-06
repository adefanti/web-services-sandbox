package org.ws.samples.jaxws.cxf;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import org.ws.samples.jaxws.cxf.model.User;

@WebService
public interface UserWebService {

	@WebMethod(operationName = "getUserByLogin")
	@WebResult(name = "getUserResult")
	User getUserByLogin(@WebParam(name = "userLogin") final String login);

	@WebMethod(operationName = "getUsers")
	@WebResult(name = "getUsersResult")
	List<User> getUsers();
}
