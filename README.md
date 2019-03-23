# 2小时学会Spring Boot 播放和新版本源码

慕课网视频已下线，可用的安卓缓存及[播放方式](<https://github.com/Gitsifu/imooc-sping-boot-liaoshixiong>)，更新[源码](<https://github.com/dalongm/2H-Spring-Boot>)。

Spring Boot版本为2.1.3.RELEASE

## 新版本注意事项

1. 配置文件切换，需在pom文件添加标签
```xml
<profiles>
    <profile>
        <!-- 本地开发环境 -->
        <id>dev</id>
        <properties>
            <profiles.active>dev</profiles.active>
        </properties>
        <activation>
            <!-- 开启本地开发环境 -->
            <activeByDefault>true</activeByDefault>
        </activation>
    </profile>
    <profile>
        <!-- 测试环境 -->
        <id>test</id>
        <properties>
            <profiles.active>test</profiles.active>
        </properties>
    </profile>
    <profile>
        <!-- 生产环境 -->
        <id>prod</id>
        <properties>
            <profiles.active>prod</profiles.active>
        </properties>
    </profile>
</profiles>
```
2. 数据库配置时区、字符编码和方言
```yml
spring:
  profiles:
    active: dev

  datasource:
    driver-class-name: com.mysql.cj.jdbc.Driver
    url: jdbc:mysql://127.0.0.1:3306/dbgirl?characterEncoding=UTF-8&useUnicode=true&allowMultiQueries=true&useSSL=false&serverTimezone=GMT%2B8

  jpa:
    database-platform: org.hibernate.dialect.MySQL5InnoDBDialect
```
3. 显示启用配置属性类
```java
@EnableConfigurationProperties(GirlProperties.class)
public class GirlApplication {}
```
4. 指定Entity类主键递增策略跟随MySql数据库递增
```java
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
```