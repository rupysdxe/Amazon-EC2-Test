FROM openjdk:8-jdk-alpine
ADD build/libs/app-1.0.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]
