FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/MPEI-RZA-1.0-SNAPSHOT.jar MPEI-RZA-1.0-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","MPEI-RZA-1.0-SNAPSHOT.jar"]