import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Servlet142")
public class Servlet142 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        response.getWriter().append("jesteś w servlecie 142\n");
        String id = request.getParameter("id");
        response.getWriter().append("id = " + id + "\n");
        String products[] = {
                "Asus Transformr;2999.99",
                "iPhone 6';3499.18",
                "Converse Sneakers;125.00",
                "LG OLED55B6P OLED TV;6493.91",
                "Samsung HT-J4100;800.99",
                "Alpine Swiss Dress Belt;99.08",
                "60 Watt LED;1.50",
                "Arduino Nano;3.26",
        };
//        String product = products[Integer.valueOf(id)].
//        response.getWriter().write(products[Integer.valueOf(id)]);
        String[] product = products[Integer.valueOf(id)].split(";");
        response.getWriter().write(product[0] + " - " + product[1]);
    }
}
