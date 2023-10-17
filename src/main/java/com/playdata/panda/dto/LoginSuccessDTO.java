package com.playdata.panda.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class LoginSuccessDTO {

    private long id;
    private String userId;

    public LoginSuccessDTO(long id, String userId) {
        super();
        this.id = id;
        this.userId = userId;
    }

    public static LoginSuccessDTO create(long id, String userId) {
        return new LoginSuccessDTO(id, userId);
    }
}
