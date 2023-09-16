package com.example.frontend4backendbasic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoParameterAjaxRestController {

    @RequestMapping("/get-with-no-parameter")
    public String getWithNoParameter() {
        return "파라미터가 없는 GET 요청";
    }

}