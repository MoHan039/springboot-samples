package top.jxma.healthsample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.jxma.healthsample.vo.ResultVO;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class HealthController {

    @GetMapping("/health")
    public ResultVO<Map<String, Object>> health() {
        Map<String, Object> data = new HashMap<>();
        data.put("appName", "demo-service");
        data.put("version", "1.0.0");
        data.put("time", OffsetDateTime.now(ZoneId.of("Asia/Shanghai")).format(DateTimeFormatter.ISO_OFFSET_DATE_TIME));
        data.put("status", "UP");
        data.put("env", "dev");
        return ResultVO.success(data);
    }
}