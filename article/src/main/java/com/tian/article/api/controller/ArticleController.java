package com.tian.article.api.controller;

import com.tian.article.common.utils.JsonResult;
import com.tian.article.message.StreamClient;
import com.tian.article.pojo.vo.ArticleVO;
import com.tian.article.service.ArticleService;
import com.tian.article.client.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(value = "文章", tags = "文章相关接口")
@RestController
@RequestMapping(value = "article", produces = MediaType.APPLICATION_JSON_VALUE)
@RefreshScope
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @Autowired
    private UserService userService;

    @Autowired
    private StreamClient streamClient;

    @Value("${server.port}")
    private String port;

    @GetMapping("/testUserClient/{id}")
    @ApiOperation(value = "测试用户服务", notes = "测试用户服务", httpMethod = "GET")
    public JsonResult testUserClient(
            @ApiParam(name = "id", value = "用户id", required = true)
            @PathVariable Integer id) {

        JsonResult uJ = userService.user(id);
        return uJ;
    }

    @GetMapping("/config")
    @ApiOperation(value = "测试配置中心", notes = "测试配置中心", httpMethod = "GET")
    public String config() {
        return port;
    }


    @ApiOperation(value = "测试stream", notes = "测试stream", httpMethod = "GET")
    @GetMapping("/processStream")
    public void processStream() {
        streamClient.output().send(MessageBuilder.withPayload("a").build());
    }

    @ApiOperation(value = "获取文章列表", notes = "获取文章列表", httpMethod = "GET")
    @GetMapping("/getArticleList")
    public JsonResult getArticleList() {
        List<ArticleVO> res = articleService.getArticleList(1);

        return JsonResult.ok(res);
    }

}
