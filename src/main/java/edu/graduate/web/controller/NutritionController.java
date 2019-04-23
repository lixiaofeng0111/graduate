package edu.graduate.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.graduate.bean.extend.NutritionVM;
import edu.graduate.service.INutritionService;
import edu.graduate.util.MsgResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@Api(description="营养成分相关接口")
@RestController
@RequestMapping("/NutritionVM")
public class NutritionController {
	@Autowired
	private INutritionService nutritionService;
	
	@ApiOperation(value = "(VM)查询所有营养成分及包含其的水果信息")
	@PostMapping("selectAllNutritionVM")
	public MsgResponse selectAllNutritionVM() {
		try {
			List<NutritionVM> list = nutritionService.selectAllNutritionVM();
			return MsgResponse.success("查询成功", list);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@ApiOperation(value = "(VM)根据Id查询所有营养成分及包含其的水果信息")
	@PostMapping("selectNutritionVMById")
	public MsgResponse selectNutritionVMById(Long id) {
		try {
			NutritionVM nutritionVM = nutritionService.selectNutritionVMById(id);
			return MsgResponse.success("查询成功", nutritionVM);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@ApiOperation(value = "(VM)根据关键字查询所有营养成分及包含其的水果信息")
	@PostMapping("selectNutritionVMByKeyword")
	public MsgResponse selectNutritionVMByKeyword(String keyword) {
		try {
			List<NutritionVM> list = nutritionService.selectNutritionVMByKeyword(keyword);
			return MsgResponse.success("查询成功", list);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@ApiOperation(value = "(VM)查询此水果所包含的营养信息")
	@PostMapping("selectFruitsBynfId")
	public MsgResponse selectFruitsBynfId(Long nutritionId) {
		try {
			List<NutritionVM> list = nutritionService.selectFruitsBynfId(nutritionId);
			return MsgResponse.success("查询成功", list);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@ApiOperation(value = "(VM)根据Id删除营养成分及包含其的水果信息")
	@GetMapping("deleteNutritionVMById")
	public MsgResponse deleteNutritionVMById(Long id) {
		try {
			nutritionService.deleteNutritionVMById(id);
			return MsgResponse.success("Success","删除成功");
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@ApiOperation(value = "(VM)根据Id批量删除营养成分及包含其的水果信息")
	@GetMapping("batchDeleteNutritionVMById")
	public MsgResponse batchDeleteNutritionVMById(Long[] ids) {
		try {
			nutritionService.batchDeleteNutritionVMById(ids);
			return MsgResponse.success("Success","批量删除成功");
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}

}
