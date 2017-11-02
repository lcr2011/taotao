taotao商城项目
=========================

tomcat热部署：部分模块部署演示：<br>
将taotao-manager模块部署到远程tomcat服务器<br>
(1)在 taotao-manager/pom.xml 文件的<configuration>中添加
```
    <configuration>
        <path>/taotao-manager</path>
        <port>8080</port>
        <!-- 在 tomcat7 上部署路径为：http://192.168.25.135:8080/manager/text -->
        <url>http://192.xx.xx.xx:8080/manager/text</url>
        <!-- 在 tomcat6 上部署路径为：http://192.168.25.135:8080/manager -->
        <url>http://192.xx.xx.xx:8080/manager</url>
        <username>xxx</username>
        <password>xxx</password>
    </configuration>
```
(2)修改taotao-manager-service模块下的db.properties 文件中的`jdbc.url`数据库地址<br>
```
    jdbc.driver=com.mysql.jdbc.Driver
    jdbc.url=jdbc:mysql://192.xx.xx.xx:3306/taotao?characterEncoding=utf-8
    jdbc.username=xxx
    jdbc.password=xxx
```