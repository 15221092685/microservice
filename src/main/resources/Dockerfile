FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD target/webtest-0.0.1-SNAPSHOT.jar account-service.jar
#ENTRYPOINT ["java", "-jar", "/account-service.jar"]
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /account-service.jar" ]
EXPOSE 9090