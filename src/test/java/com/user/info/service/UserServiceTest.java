package com.user.info.service;

import com.user.info.dto.UserDetails;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.io.IOException;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class UserServiceTest {

    @Mock
    private Properties properties;

    @InjectMocks
    private UserService userService;


    @Test
    void testGetUserDetails_UserNotExists() throws IOException {
        // Arrange
        MockitoAnnotations.openMocks(this); // Initialize mocks
        String username = "nonexistentUser";
        String workstation = "testWorkstation";

        Mockito.when(properties.getProperty(Mockito.anyString())).thenReturn(workstation);

        UserDetails userDetails = userService.getUserDetails(username);
        assertNull(userDetails);
    }
}
