package com.test.spring.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.business.BusinessAddController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author f0urth
 * tutorial => https://www.youtube.com/watch?v=g2b-NbR48Jo 47:38
 */
@Controller
public class AddController {

    private BusinessAddController logic;

    public AddController() {
        this.logic = new BusinessAddController();
    }

    @RequestMapping("/add")
//    HttpServletRequest request, HttpServletResponse response
    public ModelAndView add(@RequestParam("t1") int i, @RequestParam("t2") int i2) {
        return logic.add(i, i2);
    }
    @RequestMapping("/comeback")
    public String comeback() {
        return logic.comeback();
    }
}