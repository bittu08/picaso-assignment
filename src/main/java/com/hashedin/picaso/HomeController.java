package com.hashedin.picaso;

import java.util.*;
import java.util.HashMap;
import java.util.Map;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {
	@RequestMapping(value="/test/{id}")
	public ModelAndView getData(@PathVariable String id){
		Map model= new HashMap<String, Object>();
	List<AlbumDbHandler> listAlbum= DataImporter.getAlbumData();
		model.put("listAlbum",listAlbum);
	return new ModelAndView("home",model);
	
	/*	Map model= new HashMap<String, Object>();
		model.put("name", id+"sdkfjs");
		model.put("title", "vikas");
		return new ModelAndView("home", model);*/
	
	}

}