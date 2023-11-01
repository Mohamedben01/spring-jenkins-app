FROM openjdk:17
EXPOSE 9191
ADD target/spring-jenkins-app.jar spring-jenkins-app.jar
ENTRYPOINT ["java", "-jar", "/spring-jenkins-app.jar"]