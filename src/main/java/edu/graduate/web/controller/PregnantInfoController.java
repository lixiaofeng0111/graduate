package edu.graduate.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.graduate.bean.PregnantInfo;
import edu.graduate.bean.extend.PregnantInfoVM;
import edu.graduate.service.IPregnantInfoService;
import edu.graduate.util.MsgResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
@Api(description = "孕妈信息接口")
@RestController
@RequestMapping("/PregnantInfo")
@EnableAutoConfiguration
public class PregnantInfoController {
	@Autowired
	private IPregnantInfoService pregnantInfoService;

//PregnantInfoVM
	@ApiOperation(value = "(VM)查询孕妈信息及其所需水果信息")
	@GetMapping("findAllPregnantInfoVM")
	public MsgResponse findAllPregnantInfoVM() {
		try {
			List<PregnantInfoVM> list = pregnantInfoService.selectAllPregnantInfoVMs();
			return MsgResponse.success("查询成功", list);
			
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
		
	}
	
	@ApiOperation(value = "(VM)根据Id查询孕妈信息及其所需水果信息")
	@GetMapping("findPregnantInfoVMById")
	public MsgResponse findPregnantInfoVMById(Long id) {
		try {
			PregnantInfoVM pregnantInfoVM = pregnantInfoService.findByPreganInfoVMId(id);
			return MsgResponse.success("查询成功", pregnantInfoVM);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@ApiOperation(value = "(VM)根据孕妈Id查询其所需要的水果信息")
	@GetMapping("selectFruitVMByPregnantInfoId")
	public MsgResponse selectFruitVMByPregnantInfoId(Long pregnantInfoId) {
		List<PregnantInfoVM> list;
		try {
			list = pregnantInfoService.selectFruitVMByPregnantInfoId(pregnantInfoId);
			return MsgResponse.success("查询成功", list);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	
	@ApiOperation(value = "(VM)保存或修改孕妈信息，包括孕妈需要的水果信息", notes = "id为空执行新增操作，id不为空执行修改操作")
	@PostMapping("saveOrUpdatePregnantVMInfo")
	  public MsgResponse saveOrUpdatePregnantVMInfo(PregnantInfoVM preganInfoVM) {
		  try {
			pregnantInfoService.saveOrUpdatePregnantVMInfo(preganInfoVM);
			return MsgResponse.success("success", "操作成功");
			} catch (Exception e) {
				e.printStackTrace();
				return MsgResponse.error(e.getMessage());
	  }
	}
	  
	
	  @ApiOperation(value = "(VM)根据Id删除孕妈信息及其所需要的水果") 
	  @PostMapping("deletePregnantInfoVMById") 
	  public MsgResponse deletePregnantInfoVMById(Long id) {
		  try {
			pregnantInfoService.deletePregnantInfoVMById(id);
			return MsgResponse.success("success", "删除成功");
			} catch (Exception e) {
				e.printStackTrace();
				return MsgResponse.error(e.getMessage());
		}
	  
	  }
	  
	  @ApiOperation(value = "(VM)根据Id批量删除孕妈信息及其所需要的水果")
	  
	  @PostMapping("batchDeletePregnantInfoVMById") 
	  public MsgResponse batchDeletePregnantInfoVMById(Long[] ids) {
		  try {
			pregnantInfoService.batchDeletePregnantInfoVMById(ids);
			return MsgResponse.success("Success", "批量删除成功");
		  } catch (Exception e) {
				e.printStackTrace();
				return MsgResponse.error(e.getMessage());
		}
		  
	  
	  }

//PregnantInfo
	  
	  @ApiOperation(value = "查询孕妈信息")
		@GetMapping("findAllPregnantInfo")
		public MsgResponse findAllPregnantInfo() {
			try {
				List<PregnantInfo> list = pregnantInfoService.selectPregnantInfo();
				return MsgResponse.success("查询成功", list);
				
			} catch (Exception e) {
				e.printStackTrace();
				return MsgResponse.error(e.getMessage());
			}
			
		}
		
		@ApiOperation(value = "根据Id查询孕妈信息")
		@GetMapping("findPregnantInfoById")
		public MsgResponse findPregnantInfoById(Long id) {
			try {
				PregnantInfo pregnantInfo = pregnantInfoService.findPregnantInfoById(id);
				return MsgResponse.success("查询成功", pregnantInfo);
			} catch (Exception e) {
				e.printStackTrace();
				return MsgResponse.error(e.getMessage());
			}
		}
	
		@ApiOperation(value = "保存或修改孕妈信息", notes = "id为空执行新增操作，id不为空执行修改操作")
		@PostMapping("saveOrUpdatePregnantInfo")
		  public MsgResponse saveOrUpdatePregnantInfo(PregnantInfo pregnanInfo) {
			  try {
				pregnantInfoService.saveOrUpdatePregnantInfo(pregnanInfo);
				return MsgResponse.success("success", "操作成功");
				} catch (Exception e) {
					e.printStackTrace();
					return MsgResponse.error(e.getMessage());
		  }
		}
		  
		
		  @ApiOperation(value = "根据Id删除孕妈信息及其所需要的水果") 
		  @PostMapping("deletePregnantInfoById") 
		  public MsgResponse deletePregnantInfoById(Long id) {
			  try {
				pregnantInfoService.delete(id);
				return MsgResponse.success("success", "删除成功");
				} catch (Exception e) {
					e.printStackTrace();
					return MsgResponse.error(e.getMessage());
			}
		  
		  }
		  
		  @ApiOperation(value = "根据Id批量删除孕妈信息")
		  
		  @PostMapping("batchDeletePregnantInfoById") 
		  public MsgResponse batchDeletePregnantInfoById(Long[] ids) {
			  try {
				pregnantInfoService.batchDelete(ids);
				return MsgResponse.success("Success", "批量删除成功");
			  } catch (Exception e) {
					e.printStackTrace();
					return MsgResponse.error(e.getMessage());
			}
			  
		  
		  }


}
