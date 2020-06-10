package cc.oldx.mbg.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * 岗位
 * 
 * @author MrOldx
 * @email 974751082@qq.com
 * @date 2020-06-04 14:11:58
 */
@Data
@TableName("o_job")
public class OJobEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId
	private Long id;
	/**
	 * 岗位名称
	 */
	@NotEmpty
	private String name;
	/**
	 * 岗位状态
	 */
	@NotEmpty
	private Boolean enabled;
	/**
	 * 岗位排序
	 */
	@NotEmpty
	private Long sort;
	/**
	 * 部门ID
	 */
	@NotEmpty
	private Long deptId;
	/**
	 * 创建日期
	 */
	@NotEmpty
	private Date createTime;

}
