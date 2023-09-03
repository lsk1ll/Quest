import com.javarush.quest.NameServlet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

import static org.mockito.Mockito.*;

public class NameServletTest {

    private NameServlet servlet;
    private HttpServletRequest request;
    private HttpServletResponse response;
    private HttpSession session;

    @BeforeEach
    public void setUp() {
        servlet = new NameServlet();
        request = Mockito.mock(HttpServletRequest.class);
        response = Mockito.mock(HttpServletResponse.class);
        session = Mockito.mock(HttpSession.class);

        when(request.getSession()).thenReturn(session);
    }

    @Test
    public void testDoPostWithValidName() throws ServletException, IOException {
        when(request.getParameter("name")).thenReturn("John Doe");

        servlet.doPost(request, response);


        verify(session).setAttribute("name", "John Doe");
        verify(session).setAttribute("authorized", true);

        verify(response).sendRedirect("/game");
    }





}


