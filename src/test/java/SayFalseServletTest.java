import com.javarush.quest.SayFalseServlet;
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

public class SayFalseServletTest {

    private SayFalseServlet servlet;
    private HttpServletRequest request;
    private HttpServletResponse response;
    private RequestDispatcher requestDispatcher;

    @BeforeEach
    public void setUp() {
        servlet = new SayFalseServlet();
        request = Mockito.mock(HttpServletRequest.class);
        response = Mockito.mock(HttpServletResponse.class);
        requestDispatcher = Mockito.mock(RequestDispatcher.class);
    }

    @Test
    public void testDoGet() throws ServletException, IOException {
        when(request.getRequestDispatcher("/WEB-INF/view/say-false.jsp")).thenReturn(requestDispatcher);

        servlet.doGet(request, response);

        verify(requestDispatcher).forward(request, response);
    }
}
