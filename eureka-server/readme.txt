# 打包
mvn clean package  -Dmaven.test.skip=true

# 分别以 peer1 和 peer2 配置信息启动 Eureka
java -jar eureka-server-0.0.1-SNAPSHOT.jar  --spring.profiles.active=peer1
java -jar eureka-server-0.0.1-SNAPSHOT.jar  --spring.profiles.active=peer2
