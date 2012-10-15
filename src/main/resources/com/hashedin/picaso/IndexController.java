package com.hashedin.picaso;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author somit
 *
 */
@Controller
public class IndexController {
	@RequestMapping(value="/test/{id}")
	public ModelAndView getEmployee(@PathVariable String id){
		Map model= new HashMap<String, Object>();
		model.put("name", id+"sdkfjs");
		model.put("title", "vikas");
		return new ModelAndView("home", model);
	}

}

