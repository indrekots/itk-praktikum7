package ee.itcollege.i377.praktikum7;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


//web.xml http://pastebin.com/4zhE7rmr
//ivy.xml http://pastebin.com/zgFzcc06


@WebServlet("/logTest")
public class ReloadCounterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final Logger log = LoggerFactory.getLogger(ReloadCounterServlet.class);
       
    public ReloadCounterServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		log.debug("mina olen logi");
		response.getOutputStream().write("Hello smth else".getBytes());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
