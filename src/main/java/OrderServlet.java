import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name="orderServlet", urlPatterns = "/orders")
public class OrderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("ContextPath: " + req.getContextPath());
        resp.getWriter().println("User: " + req.getRemoteUser());
        resp.getWriter().println("Method: " + req.getMethod());

        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1,"Apple",10.0));
        productList.add(new Product(2,"Orange", 15.5));
        productList.add(new Product(3,"Carrot", 11.1));
        productList.add(new Product(4,"Cabbage", 7.5));
        productList.add(new Product(5,"Peach", 1.2));
        productList.add(new Product(6,"Lemon", 10.5));
        productList.add(new Product(7,"Watermelon", 25.8));
        productList.add(new Product(8,"Pineapple", 34.5));
        productList.add(new Product(9,"Kiwi", 10.5));
        productList.add(new Product(10,"Potato", 1.5));

        for (Product product : productList) {
            resp.getWriter().println("Product: id = " +
                    product.getId() +
                    ", Title = " + product.getTitle() +
                    ", Cost = " + product.getCost());
        }

    }
}
