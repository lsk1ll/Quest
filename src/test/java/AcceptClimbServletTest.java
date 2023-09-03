import com.javarush.quest.AcceptClimbServlet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class AcceptClimbServletTest {

    private AcceptClimbServlet servlet;
    private HttpServletRequest request;
    private HttpServletResponse response;
    private RequestDispatcher requestDispatcher;

    @BeforeEach
    public void setUp() {
        servlet = new AcceptClimbServlet();
        request = Mockito.mock(HttpServletRequest.class);
        response = Mockito.mock(HttpServletResponse.class);
        requestDispatcher = Mockito.mock(RequestDispatcher.class);
    }

    @Test
    public void testDoGet() throws ServletException, IOException {
        when(request.getRequestDispatcher("/WEB-INF/view/accept-climb.jsp")).thenReturn(requestDispatcher);

        servlet.doGet(request, response);

        verify(requestDispatcher).forward(request, response);
    }
}

