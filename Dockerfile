FROM openjdk:8-jdk-alpine
ADD build/libs/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]


#FROM openjdk:8-jdk-alpine
#COPY connectUni.jar /app.jar
#EXPOSE 8080
#ENTRYPOINT ["java", "-jar", "/app.jar"]
