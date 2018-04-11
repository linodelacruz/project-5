
package guest.book;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/index")
public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CommentManager manager = getCommentManager();
        List<Post> posts = manager.getAllPosts(0, 10);
        request.setAttribute("posts", posts);
        System.out.println("These are the default posts:"+ posts);
        getServletContext().getRequestDispatcher("/WEB-INF/views/index.jsp").forward(request, response);
    }
    private CommentManager getCommentManager() {
        return (CommentManager)getServletContext().getAttribute("posts");
    }
}
