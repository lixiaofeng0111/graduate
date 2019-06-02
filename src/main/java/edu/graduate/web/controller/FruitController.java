package edu.graduate.web.controller;

import java.util.List;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import edu.graduate.bean.Fruit;
import edu.graduate.bean.extend.FruitVM;
import edu.graduate.service.IFruitService;
import edu.graduate.util.MsgResponse;

@RestController
public class FruitController {
	@Autowired
	private IFruitService fruitService;
	
	
	@GetMapping("/fruit")		
		public ModelAndView pageFruit(@RequestParam(value = "page", defaultValue = "1") Integer page, HttpServletRequest request,
			Map<String, Object> map) throws Exception {
			PageHelper.startPage(page, 9);
			List<Fruit> findAllFruits = fruitService.findAllFruit();
			PageInfo<Fruit> pageInfoFruit = new PageInfo<>(findAllFruits);
			List<Fruit> pageListFruit = pageInfoFruit.getList();
			
			map.put("currentPage",page);
			map.put("totalPage", pageInfoFruit.getPages());   //获取总页面
			map.put("fruit", pageListFruit);
			return new ModelAndView("services",map);
	}
	
	@GetMapping("/selectById")
	public ModelAndView pageFruitVM(Map<String, Object> map,@RequestParam Long id) throws Exception {
		FruitVM findAllFruitVM = fruitService.selectFruitVMById(id);
		map.put("fruitVMInfo", findAllFruitVM);
		return new ModelAndView("pagefruit",map);
	}
	

	@PostMapping("selectAllFruitVM")
	public MsgResponse selectAllFruitVM() {
		try {
			List<FruitVM> list = fruitService.selectAllFruitVM();
			return MsgResponse.success("查询成功", list);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}


	@PostMapping("selectFruitVMById")
	public MsgResponse selectFruitVMById(Long id) {
		try {
			FruitVM fruitVM = fruitService.selectFruitVMById(id);
			return MsgResponse.success("查询成功", fruitVM);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}


	@PostMapping("selectFruitVMLikeKeyword")
	public MsgResponse selectFruitVMLikeKeyword(String keyword) {
		try {
			List<FruitVM> list = fruitService.selectFruitVMLikeKeyword(keyword);
			return MsgResponse.success("查询成功", list);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}


	@PostMapping("selectFruitByNutritionId")
	public MsgResponse selectFruitByNutritionId(Long NutritionId) {
		try {
			List<FruitVM> list = fruitService.selectFruitByNutritionId(NutritionId);
			return MsgResponse.success("查询成功", list);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}


	@PostMapping("saveOrUpdateFruitVM")
	public MsgResponse saveOrUpdateFruitVM(FruitVM fruitVM) {
		try {
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}


	@GetMapping("deleteFruitVMById")
	public MsgResponse deleteFruitVMById(Long id) {
		try {
			fruitService.deleteFruitVMById(id);
			return MsgResponse.success("Success", "删除成功");
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}


	@GetMapping("batchDeleteFruitVMById")
	public MsgResponse batchDeleteFruitVMById(Long[] ids) {
		try {
			fruitService.batchDeleteFruitVMById(ids);
			return MsgResponse.success("Success", "批量删除成功");
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@PostMapping("/searchFruitByName")
	public ModelAndView searchFruitByName(Map<String, Object> map,@RequestParam String fruitName) throws Exception {
		List<FruitVM> selectFruitVMByName = fruitService.selectFruitVMByName(fruitName);
		System.out.println(selectFruitVMByName);
		map.put("searchFruitByName", selectFruitVMByName);
		return new  ModelAndView("searchFruit",map);
		
	}

}