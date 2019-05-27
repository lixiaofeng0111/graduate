package edu.graduate.web.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import edu.graduate.bean.PregnantDescription;
import edu.graduate.bean.extend.PregnantDescriptionVM;
import edu.graduate.service.IPregnantDescriptionService;

@RestController
public class PregnantRecommendController {
	@Autowired 
	private IPregnantDescriptionService pregnantDescriptionService;
	
	@GetMapping("/pregnantRecomment")
	public ModelAndView pagePregnantRecomment(Map<String, Object> map) throws Exception {
		
		List<PregnantDescriptionVM> selectAllPregnantDescriptionVMs = pregnantDescriptionService.selectAllPregnantDescriptionVM();
		
		System.out.println(selectAllPregnantDescriptionVMs);
		map.put("PregnantDescriptionVM", selectAllPregnantDescriptionVMs);
		return new ModelAndView("typo",map);
	}

}
