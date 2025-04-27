FROM openjdk:11-jre-slim

WORKDIR /app

COPY target/rmm-agent-3.1.jar rmm-agent.jar

CMD ["java", "-jar", "rmm-agent.jar"]
