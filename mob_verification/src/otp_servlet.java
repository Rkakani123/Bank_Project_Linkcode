

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mob_verification.otp_verification;

/**
 * Servlet implementation class otp_servlet
 */
@WebServlet("/otp_servlet")
public class otp_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public otp_servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		otp_verification ov=new otp_verification();
		System.out.println(""+ov.getOtp());

		doGet(request, response);
		String otp=request.getParameter("otpvalue");
		
		if(otp!=ov.getOtp())
		{
			  getServletContext().getRequestDispatcher("/thank.jsp").forward(request, response);
		        
		}
		
	 	
		
		
	}

}
