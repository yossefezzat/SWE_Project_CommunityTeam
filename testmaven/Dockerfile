FROM java:8
EXPOSE 8080
VOLUME /tmp
RUN bash -c 'touch/community.jar'
ADD target/Community-docker.jar community.jar
ENTRYPOINT ["java" , "-jar" , "/community.jar"]