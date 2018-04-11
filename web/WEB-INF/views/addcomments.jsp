<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index</title>
        <link rel="stylesheet" type="text/css" href="/guestbook/resources/bootstrap.css">
    </head>
    <body>
        
        <div class="jumbotron text-center">
            <h1><b>Post your comments here!</b></h1>
            <p>Please do not exceed 500 words.</p> 
        </div>
        <form action="addcomments" method="POST">
             <h4>Enter your name, nick name or email:</h4>
             <input type="text" name="author"/><br/>
              <h4>What's your comment about?</h4>
             <input type="text" name="title"/><br/>
             <h4>Enter your comment:</h4>
             <textarea cols="50" rows="4" name="content"></textarea><br/>
             <input type="submit" value="Share your comment!"/>
        </form>
        
</div><br>

<!-- END gb-content -->
</div>

<!-- Footer -->
<footer class="gb-container gb-dark-grey gb-padding-32 gb-margin-top">
    <center><p>Registered&trade; Lino De la Cruz 2018</p></center>
</footer>
    </body>
</html>