package com.userFront.service.UserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userFront.Dao.UserDao;
import com.userFront.service.User;
import com.userFront.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao uerDao;
	
	 public boolean checkUserExists(String username, String email){
	        if (checkUsernameExists(username) || checkEmailExists(username)) {
	            return true;
	        } else {
	            return false;
	        }
	    }

	    public boolean checkUsernameExists(String username) {
	        if (null != findByUsername(username)) {
	            return true;
	        }

	        return false;
	    }
	    
	    public boolean checkEmailExists(String email) {
	        if (null != findByEmail(email)) {
	            return true;
	        }

}
	    
	    

		
}
