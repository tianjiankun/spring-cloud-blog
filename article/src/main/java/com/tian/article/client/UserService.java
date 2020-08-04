package com.tian.article.client;

import com.tian.article.common.utils.JsonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("user")
public interface UserService {
    @RequestMapping(value = "/user/{id}")
    JsonResult user(@PathVariable("id") Integer id);
}
