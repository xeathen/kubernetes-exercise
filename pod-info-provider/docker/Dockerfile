FROM openjdk:15.0.2-oraclelinux8

LABEL app="pod-info-provider"

ADD pod-info-provider-1.0.0.jar app.jar

ENTRYPOINT [ "java", "-jar", "app.jar"]