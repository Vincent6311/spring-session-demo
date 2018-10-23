/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: MainController
 * Author:   wangdgc
 * Date:     2018-10-23 10:17
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.session.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author wangdgc
 * @create 2018-10-23
 * @since 1.0.0
 */
@RestController
public class MainController {

    @RequestMapping("/test")
    public Map<String, Object> test(HttpServletRequest request){
        Map<String, Object> map = new HashMap<>();

        request.getSession().setAttribute("url", request.getRequestURL());

        map.put("sessionId", request.getSession().getId());
        map.put("requestURL", request.getRequestURL());

        return map;
    }

    @RequestMapping("/sessions")
    public Object sessions(HttpServletRequest request){
        return request.getSession().getAttribute("url");
    }
}