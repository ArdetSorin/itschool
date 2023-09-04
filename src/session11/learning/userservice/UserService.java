package session11.learning.userservice;

public interface UserService {

    /**
     * Creates an user
     * @param userDTO
     */
    void createUser(UserDTO userDTO);

    /**
     *
     * @param id
     * @return
     */
    UserDTO findUserById(long id);

    void deleteUser(long id);

}