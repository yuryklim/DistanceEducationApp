package servlets;

import org.junit.Test;
import org.mockito.Mockito;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Yuriy on 21.05.2017.
 */
public class CancelServletTest extends Mockito{
    @Test
    public void doPost() throws Exception {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        RequestDispatcher rd = mock(RequestDispatcher.class);
        when(request.getParameter("cancel")).thenReturn("test");
        when(request.getRequestDispatcher("/index.jsp")).thenReturn(rd);
        new CancelServlet().doPost(request, response);
        verify(request, atLeast(1)).getParameter("cancel");
    }

}