package mobileappws.services.user;

import org.springframework.stereotype.Service;

import mobileappws.dtos.UserRestDTO;
import mobileappws.model.UserRest;
import mobileappws.servicesinterface.user.ICreateUserService;

/**
 * CreateUserService
 */
@Service
public class CreateUserService implements ICreateUserService {

    public CreateUserService() { }

    /**
     * Método responsável pelo fluxo de criação de {@link UserRest}
     * 
     * @param user
     * @return
     * @throws Exception
     */
    public UserRestDTO createUser(UserRestDTO user) {
        return null;
    }
}