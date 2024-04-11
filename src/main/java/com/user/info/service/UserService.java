package com.user.info.service;

import com.user.info.dto.UserDetails;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

@Service
public class UserService {
    private String propertyFilePath = "C:/Users/dell/Desktop/Sita Assesment/property.txt";

    public UserDetails getUserDetails(String username) {

        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(propertyFilePath));
            if (properties.containsKey(username)) {
                String workstation = properties.getProperty(username);
                return new UserDetails(username, workstation, "200", "user exist in database and has access to given workstation");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}

