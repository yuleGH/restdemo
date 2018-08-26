# restdemo
使用 springmvc + maven 简单实现一个符合 RESTful 架构风格的程序

##首先，介绍一下 RESTful 架构：

    <a href="https://www.cnblogs.com/yuxiaole/p/9536739.html" target="_blank">理解 RESTful 架构</a>
##然后，开始尝试
　　**需求：**
　　简单实现 CRUD

　　**设计一下 API：**<br>
GET  http://localhost:8080/api/users  返回用户列表<br>
GET  http://localhost:8080/api/user/1 返回用户 id=1 的数据<br>
POST  http://localhost:8080/api/user 创建用户<br>
PUT  http://localhost:8080/api/user/1 更新用户 id=1 的数据<br>
DELETE  http://localhost:8080/api/user/1 删除用户 id=1 的数据<br>
DELETE  http://localhost:8080/api/users 删除所有用户<br>

　　**使用技术：**
　　idea + springMVC + maven
