
package guest.book;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addcomments")
public class CommentManagerServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/views/addcomments.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
              
            CommentManager posts = (CommentManager) getServletContext().getAttribute("posts");
            String author = request.getParameter("author");
            String title = request.getParameter("title");
            String content = request.getParameter("content");
            
            posts.addPost(author, title, content);
            request.setAttribute("posts", posts);
                
            response.sendRedirect("/guestbook/index");
    }
      
}
