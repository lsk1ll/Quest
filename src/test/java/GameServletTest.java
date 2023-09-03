import com.javarush.quest.GameServlet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class GameServletTest {

    private GameServlet servlet;
    private HttpServletRequest request;
    private HttpServletResponse response;
    private HttpSession session;
    private RequestDispatcher requestDispatcher;

    @BeforeEach
    public void setUp() {
        servlet = new GameServlet();
        request = Mockito.mock(HttpServletRequest.class);
        response = Mockito.mock(HttpServletResponse.class);
        session = Mockito.mock(HttpSession.class);
        requestDispatcher = Mockito.mock(RequestDispatcher.class);

        when(request.getSession()).thenReturn(session);
        when(request.getRequestDispatcher("/WEB-INF/view/game.jsp")).thenReturn(requestDispatcher);
    }



    @Test
    public void testDoGetWhenAuthorized() throws ServletException, IOException {
        when(session.getAttribute("authorized")).thenReturn(true);

        servlet.doGet(request, response);

        verify(requestDispatcher).forward(request, response);
    }

    @Test
    public void testDoGetWhenNotAuthorized() throws ServletException, IOException {
        when(session.getAttribute("authorized")).thenReturn(false);

        servlet.doGet(request, response);

    }
}


