package com.example.daybyday.dto;

import lombok.*;


@Getter
@Setter
@ToString //필드값 확인
@NoArgsConstructor // 기본생성자글 자동으로 생성하게
@AllArgsConstructor
public class GuestLoginUserDTO {
  private Long id;
  private String guestname;
  private  String guestemail;
  private String guestpassword;

}
