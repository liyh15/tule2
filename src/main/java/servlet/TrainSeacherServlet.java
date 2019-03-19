package servlet;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import dao.TrainDao;
import entity.TrainArrange;
public class TrainSeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		//��ȡ��ҳ����ҳ����������
		String startArea=request.getParameter("startArea");
		String endArea=request.getParameter("endArea");
		String date=request.getParameter("date");
		System.out.println(startArea);
		System.out.println(endArea);
		System.out.println(date);
		TrainDao trainDao=new TrainDao();
		List<TrainArrange> trainArranges=trainDao.findTrain(startArea, endArea, date);
		HttpSession session=request.getSession();
		String contextPath=request.getContextPath();
		if(trainArranges.size()>0){
			session.setAttribute("trainArranges", trainArranges);
			request.setAttribute("start", startArea);
			request.setAttribute("end", endArea);
			request.getRequestDispatcher("WEB-INF/train_detail.jsp").forward(request, response);
		}else{
			request.setAttribute("line", "��ǰ·����δ��ͨ");
			response.sendRedirect("user/trainView.do");			
		}		
	}
}
