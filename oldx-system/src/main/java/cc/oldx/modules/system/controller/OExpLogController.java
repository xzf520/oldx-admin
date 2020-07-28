package cc.oldx.modules.system.controller;

import cc.oldx.common.utils.CommonResult;
import cc.oldx.common.utils.PageUtils;
import cc.oldx.mbg.domain.OExpLogEntity;
import cc.oldx.modules.system.service.OExpLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;





/**
 * 
 *
 * @author moli
 * @email 974751082@qq.com
 * @date 2020-07-28 21:57:52
 */
@RestController
@RequestMapping("ware/oexplog")
public class OExpLogController {
    @Autowired
    private OExpLogService oExpLogService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("ware:oexplog:list")
    public CommonResult list(@RequestParam Map<String, Object> params){
        PageUtils page = oExpLogService.queryPage(params);

        return CommonResult.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("ware:oexplog:info")
    public CommonResult info(@PathVariable("id") String id){
		OExpLogEntity oExpLog = oExpLogService.getById(id);

        return CommonResult.ok().put("oExpLog", oExpLog);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("ware:oexplog:save")
    public CommonResult save(@RequestBody OExpLogEntity oExpLog){
		oExpLogService.save(oExpLog);

        return CommonResult.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("ware:oexplog:update")
    public CommonResult update(@RequestBody OExpLogEntity oExpLog){
		oExpLogService.updateById(oExpLog);

        return CommonResult.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("ware:oexplog:delete")
    public CommonResult delete(@RequestBody String[] ids){
		oExpLogService.removeByIds(Arrays.asList(ids));

        return CommonResult.ok();
    }

}