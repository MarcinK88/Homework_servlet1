import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

@WebServlet("/Servlet15")
public class Servlet15 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Random random = new Random();

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100));
        }

        for (Integer number : numbers) {
            response.getWriter().append(number + "\n");
        }

        Collections.sort(numbers);

        response.getWriter().append("\nposortowane:\n");

        for (Integer number : numbers) {
            response.getWriter().append(number + "\n");
        }
    }
}
