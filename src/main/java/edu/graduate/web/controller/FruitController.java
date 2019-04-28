package edu.graduate.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.graduate.bean.extend.FruitVM;
import edu.graduate.service.IFruitService;
import edu.graduate.util.MsgResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description = "水果相关接口")
@RestController
@RequestMapping("/Fruit")
public class FruitController {
	@Autowired
	private IFruitService fruitService;

	@ApiOperation(value = "(VM)查询所有水果及其所包含的营养信息")
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

	@ApiOperation(value = "(VM)根据Id查询所有水果及其所包含的营养信息")

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

	@ApiOperation(value = "(VM)根据关键字查询所有水果及其所包含的营养信息")

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

	@ApiOperation(value = "(VM)查询此水果所包含的营养信息")

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

	@ApiOperation(value = "(VM)保存和修改水果及其所包含的营养信息")

	@PostMapping("saveOrUpdateFruitVM")
	public MsgResponse saveOrUpdateFruitVM(FruitVM fruitVM) {
		try {
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}

	@ApiOperation(value = "(VM)根据Id删除水果及其所包含的营养信息")

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

	@ApiOperation(value = "(VM)根据Id批量删除水果及其所包含的营养信息")

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

}