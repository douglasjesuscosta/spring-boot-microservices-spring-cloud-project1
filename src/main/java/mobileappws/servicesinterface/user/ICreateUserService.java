
package mobileappws.servicesinterface.user;

import mobileappws.dtos.UserRestDTO;

/**
 * IUserService
 */
public interface ICreateUserService {

    public abstract UserRestDTO createUser(UserRestDTO user);
    
}