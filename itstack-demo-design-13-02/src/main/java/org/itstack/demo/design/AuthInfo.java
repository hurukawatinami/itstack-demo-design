package org.itstack.demo.design;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AuthInfo {

    private String code;
    private String info = "";

    public AuthInfo(String code, String ...infos) {
        this.code = code;
        for (String str:infos){
            this.info = this.info.concat(str);
        }
    }

}
