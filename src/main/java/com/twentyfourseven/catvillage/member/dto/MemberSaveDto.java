package com.twentyfourseven.catvillage.member.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class MemberSaveDto {

    @NotBlank(message = "이메일 입력은 필수입니다.")
    @Email(message = "이메일 형식을 확인해주세요.")
    @Length(max = 254, message = "이메일은 최대 254자까지 입력 가능합니다.")
    private String email;

    // 비밀번호는 암호화 과정에서 최대 80자 미만으로 변경되어 엔티티에 할당
    @NotBlank(message = "비밀번호 입력은 필수입니다.")
    @Length(max = 254, message = "비밀번호는 최대 254자까지 입력 가능합니다.")
    private String password;

}
