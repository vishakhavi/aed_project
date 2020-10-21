/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Vishakha
 */
public class UserDirectory {
    private ArrayList<User> userList;

    public UserDirectory() {
        userList = new ArrayList();
    }

    public ArrayList<User> getUserList() {
        return userList;
    }
    
    public User authenticateUser(String username, String password){
        for (User ua : userList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public User createUserAccount(String username, String password,String role){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setRole(role);
        userList.add(user);
        return user;
    }
    
    public User addUser(User user){
        userList.add(user);
        return user;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (User ua : userList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
    public boolean verifyPassword(String password){
        for (User ua : userList){
            if (ua.getPassword().equals(password))
                return true;
        }
        return false;
    }
}
