<p align="center">
 <img src="https://img.shields.io/badge/yun-3.6-success.svg" alt="Build Status">
 <img src="https://img.shields.io/badge/Spring%20Cloud-2021-blue.svg" alt="Coverage Status">
 <img src="https://img.shields.io/badge/Spring%20Boot-2.7-blue.svg" alt="Downloads">
 <img src="https://img.shields.io/badge/Vue-3.2-blue.svg" alt="Downloads">
 <img src="https://img.shields.io/github/license/yun-mesh/yun"/>
</p>

## 系统说明

- 基于 Spring Cloud 2021 、Spring Boot 2.7、 OAuth2 的 RBAC **权限管理系统**
- 基于数据驱动视图的理念封装 element-plus，即使没有 vue 的使用经验也能快速上手
- 提供对常见容器化支持 Docker、Kubernetes、Rancher2 支持
- 提供 lambda 、stream api 、webflux 的生产实践



## 快速开始

### 分支说明

- master: java8 + springboot 2.7 + springcloud 2021
- jdk17: java17 + springboot 3.0 + springcloud 2022

| 分支              | 说明                                                               |
|-----------------|------------------------------------------------------------------|
| master          | java8 + springboot 2.7 + springcloud 2021                        |
| sca-springboot3 | java17 + springboot 3.0 + springcloud 2022 |
| sct-springboot3 | java17 + springboot 3.0 + springcloud 2022 |


### 核心依赖

| 依赖                   | 版本         |
| ---------------------- |------------|
| Spring Boot            | 2.7.9      |
| Spring Cloud           | 2021.0.6   |
| Spring Cloud Alibaba   | 2021.0.4.0 |
| Spring Authorization Server | 0.4.1      |
| Mybatis Plus           | 3.5.3.1    |
| hutool                 | 5.8.12     |

### 模块说明

```lua
yun-ui  -- https://gitee.com/log4j/yun-ui

yun
├── yun-auth -- 授权服务提供[3000]
└── yun-common -- 系统公共模块
     ├── yun-common-bom -- 全局依赖管理控制
     ├── yun-common-core -- 公共工具类核心包
     ├── yun-common-datasource -- 动态数据源包
     ├── yun-common-job -- xxl-job 封装
     ├── yun-common-log -- 日志服务
     ├── yun-common-mybatis -- mybatis 扩展封装
     ├── yun-common-seata -- 分布式事务
     ├── yun-common-security -- 安全工具类
     ├── yun-common-swagger -- 接口文档
     ├── yun-common-feign -- feign 扩展封装
     └── yun-common-xss -- xss 安全封装
├── yun-register -- Nacos Server[8848]
├── yun-gateway -- Spring Cloud Gateway网关[9999]
└── yun-upms -- 通用用户权限管理模块
     └── yun-upms-api -- 通用用户权限管理系统公共api模块
     └── yun-upms-biz -- 通用用户权限管理系统业务处理模块[4000]
└── yun-visual
     └── yun-monitor -- 服务监控 [5001]
     ├── yun-codegen -- 图形化代码生成 [5002]
     ├── yun-sentinel-dashboard -- 流量高可用 [5003]
     └── yun-xxl-job-admin -- 分布式定时任务管理台 [5004]
```



<table>
  <tr>
    <td><a href="https://www.bilibili.com/video/av45084065" target="_blank"><img src="https://minio.yunx.vip/oss/1655474345.jpg"></a></td>
    <td><a href="https://www.bilibili.com/video/av77344954" target="_blank"><img src="https://minio.yunx.vip/oss/1656837143.jpg"></a></td>
  </tr>
    <tr>
    <td><a href="https://www.bilibili.com/video/BV1J5411476V" target="_blank"><img src="https://minio.yunx.vip/oss/1655474369.jpg"></a></td>
    <td><a href="https://www.bilibili.com/video/BV14p4y197K5" target="_blank"><img src="https://minio.yunx.vip/oss/1655474381.jpg"></a></td>
  </tr>
</table>


### 开源协议

yun 开源软件遵循 [Apache 2.0 协议](https://www.apache.org/licenses/LICENSE-2.0.html)。
允许商业使用，但务必保留类作者、Copyright 信息。

![](https://minio.yunx.vip/oss/1655474288.jpg)


### 其他说明

1. 欢迎提交 [PR](https://dwz.cn/2KURd5Vf)，注意对应提交对应 `dev` 分支
   代码规范 [spring-javaformat](https://github.com/spring-io/spring-javaformat)

   <details>
    <summary>代码规范说明</summary>

    1. 由于 <a href="https://github.com/spring-io/spring-javaformat" target="_blank">spring-javaformat</a>
       强制所有代码按照指定格式排版，未按此要求提交的代码将不能通过合并（打包）
    2. 如果使用 IntelliJ IDEA
       开发，请安装自动格式化软件 <a href="https://repo1.maven.org/maven2/io/spring/javaformat/spring-javaformat-intellij-idea-plugin/" target="_blank">
       spring-javaformat-intellij-idea-plugin</a>
    3. 其他开发工具，请参考 <a href="https://github.com/spring-io/spring-javaformat" target="_blank">spring-javaformat</a>
       说明，或`提交代码前`在项目根目录运行下列命令（需要开发者电脑支持`mvn`命令）进行代码格式化
       ```
       mvn spring-javaformat:apply
       ```
   </details>

