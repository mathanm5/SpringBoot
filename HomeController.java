package com.maddy.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")//home page
    public String home(){
        System.out.println("Home method called..");
       // return "index.jsp";
        return "index";
    }

    @RequestMapping("/add")

    public ModelAndView add(@RequestParam("num1") int number1, @RequestParam("num2") int number2, ModelAndView mv){


    //public String add(@RequestParam("num1") int number1, @RequestParam("num2") int number2, Model model){
    //public String add(@RequestParam("num1") int number1, @RequestParam("num2") int number2, HttpSession session){
    //by using @RequestParam we can give any name to the variable because the techical was mentioned inside that annotation... from index.jsp
        //public String add(HttpServletRequest req, HttpSession session){


        //  System.out.println("in add");

      //  int num1 = Integer.parseInt(req.getParameter("num1"));
       // int num2 = Integer.parseInt(req.getParameter("num2"));
        int result = number1 + number2;

        //model.addAttribute("result", result);
       //session.setAttribute("result", result);// you must pass two things one must be name and another one is data..
        //System.out.println(result);

        mv.addObject("result", result);
        mv.setViewName("result");
        //return "result.jsp";
        return mv;
        //return "result"; // because it may come from thymeleaf or somewhere else.. frontend code
    }
}
