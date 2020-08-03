package com.tian.article.service.client;

import com.tian.article.common.utils.JsonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("user")
public interface UserService {
    @RequestMapping(value = "/user")
    JsonResult user();
}
