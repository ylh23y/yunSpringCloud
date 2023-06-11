FROM moxm/java:1.8-full

RUN mkdir -p /yun-gateway

WORKDIR /yun-gateway

ARG JAR_FILE=target/yun-gateway.jar

COPY ${JAR_FILE} app.jar

EXPOSE 9999

ENV TZ=Asia/Shanghai JAVA_OPTS="-Xms128m -Xmx256m -Djava.security.egd=file:/dev/./urandom"

CMD sleep 60; java $JAVA_OPTS -jar app.jar
