package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList

        UserList userList = new UserList();

        userList.addUser("Winner","1111");
        userList.addUser("Beam","2222");
        userList.addUser("Nut","3333");

        // TODO: find one of them

        User user = userList.findUserByUsername("Winner");

        // TODO: assert that UserList found User

         String expected = "Winner";
         String actual = user.getUsername();
         assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList

        UserList userList = new UserList();

        userList.addUser("Winner","1111");
        userList.addUser("Beam","2222");
        userList.addUser("Nut","3333");

        // TODO: change password of one user

        boolean actual = userList.changePassword("Beam","2222","2211");

        // TODO: assert that user can change password

        assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList

        UserList userList = new UserList();

        userList.addUser("Winner","1111");
        userList.addUser("Beam","2222");
        userList.addUser("Nut","3333");

        // TODO: call login() with correct username and password

        User user = userList.login("Nut","3333");

        // TODO: assert that User object is found
        String expected = "Nut";
        String actual = user.getUsername();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList

        UserList userList = new UserList();

        userList.addUser("Winner","1111");
        userList.addUser("Beam","2222");
        userList.addUser("Nut","3333");

        // TODO: call login() with incorrect username or incorrect password

        User actual = userList.login("Nut","5555");

        // TODO: assert that the method return null

        assertNull(actual);
    }

}