FROM openjdk:17
EXPOSE 8761
ADD target/EurekaSAE6-0.0.1-SNAPSHOT.jar eureka.jar
ENTRYPOINT ["java", "-jar","eureka.jar"]