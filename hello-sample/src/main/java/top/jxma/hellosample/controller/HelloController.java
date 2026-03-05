package top.jxma.hellosample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.jxma.hellosample.vo.ResultVO;

/**
 * Hello接口控制器
 */
@RestController
@RequestMapping("/api")
public class HelloController {

    /**
     * 欢迎接口
     * @return 统一格式的欢迎信息
     */
    @GetMapping("/hello")
    public ResultVO<String> hello() {
        return new ResultVO<>("Hello Spring Boot");
    }
}