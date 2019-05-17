package edu.graduate.web.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import edu.graduate.bean.ImgPregnant;
import edu.graduate.service.IImgPregnantService;

@RestController
public class ImgPregnantCotroller {
	@Autowired
	private IImgPregnantService iImgPregnantService;
	
	@GetMapping("/imgPregnant")
	public ModelAndView findAllImgPregnant(Map<String, Object> map) throws Exception {
		List<ImgPregnant> findImgPregnants = iImgPregnantService.findAllImgPregnant();
		
		map.put("findImgPregnant",findImgPregnants);
		
		return new ModelAndView("about",map);
	}

}
