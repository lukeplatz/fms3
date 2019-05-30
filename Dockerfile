FROM openjdk:8-jre-alpine

USER root

ADD ./target/fms3-0.1-SNAPSHOT.jar /opt/fms3-0.1-SNAPSHOT.jar
CMD ["java", "-Xmx200m", "-jar", "/opt/fms3-0.1-SNAPSHOT.jar"]

EXPOSE 8080

