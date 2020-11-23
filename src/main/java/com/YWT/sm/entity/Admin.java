package com.YWT.sm.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Admin{
    private Integer id;
    public void setId(Integer id) {
        this.id = id;
    }

    private  String account;
    public void setAccount(String account) {
        this.account = account;
    }
    private  String password;
    public void setPassword(String password) {
        this.password = password;
    }
    private  String adminName;
    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }
}
