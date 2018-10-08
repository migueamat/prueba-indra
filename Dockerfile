FROM centos

RUN yum install -y java

VOLUME /tmp

ADD YOUR_JAR_FILENAME.jar ANY_NAME.jar

RUN sh -c 'touch ANY_NAME.jar'

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/ANY_NAME.jar"]