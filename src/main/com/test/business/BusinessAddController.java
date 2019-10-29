package com.test.business;

import com.test.business.services.AddService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author F0urth
 */
public class BusinessAddController {

    private AddService service = new AddService();
//HttpServletRequest request, HttpServletResponse response
    public ModelAndView add(int i, int i2) {
//        System.out.println("Hello");
//        int i = Integer.parseInt(request.getParameter("t1"));
//        int i2 = Integer.parseInt(request.getParameter("t2"));
        int k = service.add(i, i2);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("display");
        mv.addObject("result", k);
        return mv;
    }

    public String comeback() {
        return "index";
    }
}
