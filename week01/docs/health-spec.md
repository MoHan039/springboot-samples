# 系统健康检查接口规格文档

## 1. 核心目标
- 提供一个系统健康检查接口，返回统一格式的欢迎信息，用于验证 Spring Boot 项目的基本配置是否正确，方便快速确认服务是否正常运行。

## 2. 业务规则
- 接口路径：GET /api/health
- 返回字段：
  - appName：应用名称
  - version：应用版本
  - time：当前服务器时间
  - status：运行状态（UP/DOWN）
  - env：返回部分安全的环境变量

## 3. 技术约束
- 使用 Spring Boot 3.5.11
- 使用 Java 17
- 端口使用默认 8080
- 统一返回类型 ResultVO

## 4. 输入输出

### 4.1 输入
- 无请求体，无查询参数

### 4.2 输出
- 成功示例：
{
  "code": 200,
  "msg": "success",
  "data": {
    "appName": "demo-service",
    "version": "1.0.0",
    "time": "2024-12-25T10:30:00+08:00",
    "status": "UP",
    "env": "dev"
  }
}

## 5. 验收标准
- 项目能成功启动
- 访问 /api/health 返回 HTTP 状态码 200
- 返回 JSON 结构中包含 code、msg、data 三个字段
- data 字段中包含 appName、version、time、status、env 五个字段
- 所有字段均为非空值
- time 字段格式为 ISO 8601 标准时间格式
- status 字段值为 "UP" 表示服务正常