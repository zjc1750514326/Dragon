Spring Cloud Config 也提供本地存储配置的方式。我们只需要设置属性spring.profiles.active=native，
Config Server 会默认从应用的src/main/resource目录下检索配置文件。
也可以通过spring.cloud.config.server.native.searchLocations=file:E:/properties/属性来指定配置文件的位置。
虽然 Spring Cloud Config 提供了这样的功能，但是为了支持更好的管理内容和版本控制的功能，还是推荐使用 Git 的方式。

果我们的 Git 仓库需要权限访问，那么可以通过配置下面的两个属性来实现；
spring.cloud.config.server.git.username：访问 Git 仓库的用户名
spring.cloud.config.server.git.password：访问 Git 仓库的用户密码



# http://127.0.0.1:9001/config-client-dev.yml   直接访问git上的application-dev.properties文件
# http://127.0.0.1:9001/config-client/dev  得到配置文件的位置、版本、配置文件的名称以及配置文件中的JSON具体内容
仓库中的配置文件会被转换成 Web 接口，访问可以参照以下的规则：
/{application}/{profile}[/{label}]
/{application}-{profile}.yml
/{label}/{application}-{profile}.yml
/{application}-{profile}.properties
/{label}/{application}-{profile}.properties
上面的 URL 会映射{application}-{profile}.yml对应的配置文件，其中{label}对应 Git 上不同的分支，
默认为 master。以 config-client-dev.yml 为例子，它的 application 是 config-client，profile 是 dev。