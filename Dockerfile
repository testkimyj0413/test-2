FROM openjdk:17
COPY ./build/libs/test-2-0.0.1-SNAPSHOT.jar /usr/src/myapp/test-2.jar
ENTRYPOINT ["java", "-Dspring.profiles.active=dev", "-jar", "/usr/src/myapp/test-2.jar"]
EXPOSE 8080
WORKDIR /usr/src/myapp