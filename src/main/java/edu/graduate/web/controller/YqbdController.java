package edu.graduate.web.controller;

import java.util.List;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import edu.graduate.bean.Kind;
import edu.graduate.bean.MeituShow;
import edu.graduate.bean.PregnantAnalysis;
import edu.graduate.bean.PregnantWeek;
import edu.graduate.bean.Topic;
import edu.graduate.bean.Yqbd;
import edu.graduate.service.IKindService;
import edu.graduate.service.IMeituShowService;
import edu.graduate.service.IPregnantAnalysisService;
import edu.graduate.service.IPregnantWeekService;
import edu.graduate.service.ITopicService;
import edu.graduate.service.IYqbdService;

@RestController
public class YqbdController {
	@Autowired
	private IYqbdService yqbdService;
	
	@Autowired
	private ITopicService iTopicService;
	
	@Autowired 
	private IPregnantWeekService pregnantWeekService ;
	
	@Autowired
	private IKindService kingService;
	
	@Autowired 
	private IPregnantAnalysisService pregnantAnalysisService;
	
	@Autowired
	private IMeituShowService meituShowService;
	
	@GetMapping("/pregnant")
	public ModelAndView pageYqbd(Map<String, Object> map) throws Exception{
		List<Yqbd> selectYqbd = yqbdService.selectAllYqbd();
		
		List<Kind> selectKinds = kingService.selectAllKind();
		
		List<PregnantAnalysis> selectPregnantAnalysis = pregnantAnalysisService.selectAllPregnantAnalysis();
		
		List<MeituShow> selectMeituShows = meituShowService.selectAllMeituShow();
		PageHelper.startPage(1, 6);
		List<Topic> findAllTopic1 = iTopicService.findAllTopic();
		PageInfo<Topic> pageInfoTopic = new PageInfo<>(findAllTopic1);
		List<Topic> pageListTopic = pageInfoTopic.getList();
		
		map.put("selectKind", selectKinds);
		map.put("selectPregnantAnalysis", selectPregnantAnalysis);
		map.put("selectMeituShows", selectMeituShows);
		map.put("selectEarly", selectYqbd);
		map.put("pregnantKonwledge",pageListTopic);
		return new ModelAndView("about",map);
	}
	
	@GetMapping("/selectByWeek")
	public ModelAndView pageSelectByWeek(Map<String, Object> map,@RequestParam Integer week) throws Exception{
		PregnantWeek findAllPregnantWeek = pregnantWeekService.selectPregnantWeekByweek(week);
		
		map.put("pregnantWeek", findAllPregnantWeek);
		return new ModelAndView("pagePregnantWeek",map);
		
	}
	
	
	@GetMapping("/selectYqbdById")
	public ModelAndView pageYqbdById(Map<String, Object> map,@RequestParam Integer id) throws Exception{
		Yqbd selectYqbdById = yqbdService.selectById(id);
		map.put("selectYqbd", selectYqbdById);
		return new ModelAndView("pageYqbd",map);
	}
	@GetMapping("/selectTopicById")
	public ModelAndView pageTopicdById(Map<String, Object> map,@RequestParam Long id) throws Exception{
		Topic selectTopicById = iTopicService.selectById(id);
		map.put("selectTopic", selectTopicById);
		return new ModelAndView("pagePregnantAnalysisTopic",map);
	}
	
	
	
	
	/*
	 * public static String upload(String oldPath, MultipartFile file,
	 * HttpServletRequest request) throws IllegalStateException, IOException {
	 * String fileSuffix =
	 * file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(
	 * ".")); String dir = null; dir =
	 * request.getServletContext().getRealPath("/imgs/upload"); File fileDir = new
	 * File(dir); if (!fileDir.exists()) { fileDir.mkdirs(); } String fileName =
	 * UUID.randomUUID().toString() + fileSuffix; File files = new File(fileDir +
	 * "/" + fileName); File old = new File(fileDir + "/" + oldPath);
	 * if(old.exists()){ old.delete(); } file.transferTo(files); return fileName; }
	 */
	
	

}
