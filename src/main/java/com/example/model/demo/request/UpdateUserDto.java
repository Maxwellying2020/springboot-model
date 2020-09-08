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
 * <b>Class name</b>: UpdateUserDto
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
 * 2019-12-24    zhang ying        1.0          Initial Creation
 *
 * </pre>
 *
 * @author zhang ying
 * @date 2019-12-24
 * </p>
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateUserDto {

    @NotNull(message="userId不能为空")
    private Long id;

    @NotBlank(message = "realname不能为空")
    private String realname;

    @NotNull(message="roleId不能为空")
    private Long roleId;

    @NotNull(message="organizationId不能为空")
    private Long organizationId;

    @NotBlank(message = "phone不能为空")
    @ApiModelProperty(value="用户手机号")
    private String phone;

    @ApiModelProperty(value = "邮箱")
    private String email;
}
