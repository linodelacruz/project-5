
package guest.book;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class StartupListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        CommentManager posts = new CommentManager();
        posts.addPost("Peter", "First Comment","Hey, This is my first Post!");
        posts.addPost("John", "Places to eat","Anybody know a good place to eat in Austin?");
        posts.addPost("Michael", "Things to do in Austin", "Where's the fun at in this town?");
        sce.getServletContext().setAttribute("posts", posts);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
       
    }
}
