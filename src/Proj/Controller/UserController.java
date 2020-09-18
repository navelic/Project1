package Proj.Controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import Proj.entity.User;
import Proj.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public String showForm(Model theModel) {
		String msg="";
		theModel.addAttribute("message",msg);
		return "loginpage";
	}
	
	@RequestMapping("/login")
	public String dashboard(HttpServletRequest request,Model theModel)
	{
		String msg="";
		String theEmail = request.getParameter("email");
		String thePass = request.getParameter("password");
		
		User theUser = userService.getUser(theEmail,thePass);
		if(theUser!=null) {
			theModel.addAttribute("userid", theUser.getId());
			theModel.addAttribute("username", theUser.getName().toUpperCase());
			return "dashboard";
		}
		else {
			msg="No User Found!! Try Again..";
			theModel.addAttribute("message",msg);
			return "loginpage";
		}
	}
}
