package com.example.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.jdbc.core.SqlParameter;
//import org.springframework.jdbc.core.simple.SimpleJdbcCall;
//import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.main.dao.Employee;
import com.example.main.dao.EmployeeImpl;
import com.example.main.dao.MainEmployee;

@Controller
public class Login
{
	/*@Autowired 
	Employee employee;*/
	
	@Autowired
	MainEmployee emp;
	
	Employee empl = new EmployeeImpl();
	
	@RequestMapping(path = "/login", method = RequestMethod.GET)
    public String demo(Model model) {
        model.addAttribute("name", "bhakti");
        System.out.println(empl.changeName());
        System.out.println(emp.changeName());
        return "/login";
    }
	
	@RequestMapping(path = "/onLogin", method = RequestMethod.GET)
	public String onLogin(Model model,@RequestParam("username") String username,@RequestParam("password") String password) {
        System.out.println("username "+username+" password "+password);
//        SimpleJdbcCall jdbcCall = new SimpleJdbcCall(getJdbcTemplate()).withProcedureName("spMsc_GetSalary");
//		jdbcCall.addDeclaredParameter(new SqlParameter("fin_year", Types.VARCHAR));
//		jdbcCall.addDeclaredParameter(new SqlParameter("month", Types.VARCHAR));
//		jdbcCall.addDeclaredParameter(new SqlParameter("sal_img", Types.VARCHAR));
//		jdbcCall.addDeclaredParameter(new SqlParameter("emp_id", Types.VARCHAR));
//		Map<String, Object> empSalImg = jdbcCall.execute();
//        String sql = "SELECT COUNT(*) FROM dbo.HR_Mst_EMPHead where com_email";
//        String abc= getJdbcTemplate().queryForObject(sql, new Object[] { "" }, String.class);
        return "/home";
    }

}
