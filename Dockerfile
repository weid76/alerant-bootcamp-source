FROM registry.access.redhat.com/ubi8/openjdk-11-runtime:latest

USER root
RUN mkdir /application && chown 1001:0 /application && chmod 755 /application
COPY --chown=1001:0 target/*.jar /application/app.jar
RUN chmod 644 /application/app.jar
EXPOSE 8080

USER 1001
ENTRYPOINT [ "java", "-jar", "/application/app.jar" ]
