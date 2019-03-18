package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.CityDao;
import entity.User;
import service.UserService;

public class BasicSetUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		UserService userService = new UserService();
		
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("user");
		
		String nickname = request.getParameter("nickname");
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String birthday = request.getParameter("birthday");
		String email = request.getParameter("email");
		if("".equals(birthday) || birthday == null) {
			birthday = "2018-10-17";
		}
		String gender = request.getParameter("gender");
		String city = request.getParameter("city");
		// �õ����еı��
		if("��ѡ��".equals(city)) {
			city = "";
		}
		
		String address_detail =request.getParameter("address_detail");
		String marriage = request.getParameter("marriage");
		System.out.println(marriage);
		if("��ѡ��".equals(marriage)) {
			marriage = "";
		}
		String job = request.getParameter("job");
		if("��ѡ��".equals(job)) {
			job = "";
		}
		String education = request.getParameter("education");
		if("��ѡ��".equals(education)) {
			education = "";
		}
		
		user.setNickName(nickname);
		user.setName(name);
		user.setPhone(phone);
		user.setBirthday(birthday);
		user.setSex(gender);
		// iΪ���б��
		user.setLiveCity(city);
		user.setAddress(address_detail);
		user.setMarried(marriage);
		user.setJob(job);
		user.setEducation(education);
		user.setEmail(email);
		
		boolean flag = userService.basicSetUp(user);
		if(flag) {
			session.setAttribute("user", user);	
			response.sendRedirect("orderlist");
		} else {
		}
		
	}

}
