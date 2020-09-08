package com.example.model.demo.request;

import com.example.model.common.Patterns;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * <p>
 * <b>Class name</b>: CreateUserDto
 * </p>
 * <p>
 * <b>Class description</b>: Class description goes here.
 * </p>
 * <p>
 * <b>Author</b>: zhang ying
 * </p>
 * <b>Change History</b>:<br/>
 * <p>
 *
 * <pre>
 * Date          Author       Revision     Comments
 * ----------    ----------   --------     ------------------
 * 2019-04-24    zhang ying        1.0          Initial Creation
 *
 * </pre>
 *
 * @author zhang ying
 * @date 2019-04-24
 * </p>
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserDto {

    private static final long serialVersionUID = 1L;

    @NotBlank(message="username不能为空")
    private String username; 		//用户名

    @NotNull(message="password不能为空")
    private String password; 		//密码

    @NotNull(message = "realname不能为空")
    @Pattern(regexp = Patterns.REG_USER_REAL_NAME, message = "管理员姓名字段只能输入汉字、字母和数字")
    private String realname;

    @NotNull(message="roleId不能为空")
    private Long roleId;			 //拥有的角色列表

    @NotNull(message="organizationId不能为空")
    private Long organizationId;

    @ApiModelProperty(value="用户手机号")
    private String phone;

    @ApiModelProperty(value = "邮箱", required = true)
    private String email;
}
