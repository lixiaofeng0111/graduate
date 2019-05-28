package edu.graduate.web.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


import edu.graduate.bean.extend.NutritionVM;
import edu.graduate.bean.extend.PregnantDescriptionVM;

import edu.graduate.service.INutritionService;
import edu.graduate.service.IPregnantDescriptionService;

@RestController
public class PregnantRecommendController {
	@Autowired 
	private IPregnantDescriptionService ipregnantDescriptionService;
	
	@Autowired
	private INutritionService iNutritionService;
	@GetMapping("/pregnantRecomment")
	public ModelAndView pagePregnantRecomment(Map<String, Object> map) throws Exception {
		List<PregnantDescriptionVM> selectAllPregnantDescriptionVMs = ipregnantDescriptionService.selectAllPregnantDescriptionVM();
		
		System.out.println(selectAllPregnantDescriptionVMs);
		map.put("PregnantDescriptionVM", selectAllPregnantDescriptionVMs);
		return new ModelAndView("typo",map);
	}
	
	@PostMapping("/searchRecommendByNutritionName")
	public ModelAndView searchByMonth(Map<String, Object> map,@RequestParam String nutritionName) throws Exception{
		    List<NutritionVM> searchByNutritionName = iNutritionService.selectNutritionVMByName(nutritionName);
		    map.put("searchRecommendByNutritionName", searchByNutritionName);
			return new ModelAndView("searchPregnantRecommend",map);
		}
	
	}
