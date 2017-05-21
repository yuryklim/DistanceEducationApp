package servlets;

import org.junit.Test;
import org.mockito.Mockito;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Testing class Registration.
 */
public class RegistrationTest extends Mockito {
    @Test
    public void doPost() throws Exception {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletRequest requestRegistration = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        HttpServletResponse responseRegistration = mock(HttpServletResponse.class);
        RequestDispatcher rd = mock(RequestDispatcher.class);
        RequestDispatcher rdRegistration = mock(RequestDispatcher.class);
        when(request.getParameter("login")).thenReturn("test");
        when(requestRegistration.getParameter("registration")).thenReturn("test");
        when(request.getRequestDispatcher("/CheckUser")).thenReturn(rd);

        new Registration().doPost(request, response);
        verify(request, atLeast(1)).getParameter("login");


        when(requestRegistration.getRequestDispatcher("/registration.jsp")).thenReturn(rdRegistration);
        new Registration().doPost(requestRegistration,responseRegistration);
        verify(requestRegistration, atLeast(1)).getParameter("registration");
    }
}