package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Tester;
import model.TesterLogic;


@WebServlet("/TesterServlet")
public class TesterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String oyako = request.getParameter("oyako");
		String fu = request.getParameter("fu");
		String han = request.getParameter("han");

		//インスタンスの生成
		Tester tester = new Tester(oyako,fu,han);
		//インスタンスを生成してリクエストスコープに保存
		TesterLogic testerLogic = new TesterLogic();
		if(oyako.equals("1")){
			String[] test = testerLogic.test1(tester);
			request.setAttribute("test", test);
		}else{
			String[] test = testerLogic.test2(tester);
			request.setAttribute("test", test);
		}
		request.setAttribute("oyako", oyako);

		RequestDispatcher dispatcher=
				request.getRequestDispatcher("/WEB-INF/jsp/result.jsp");
		dispatcher.forward(request,response);

	}

}
