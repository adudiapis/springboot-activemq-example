Working example for Active MQ Queue messaging service between Spring Boot apps.
#Consumer
1. Run Subscriber app with Active MQ URL configuration in application.properties file
2. Check topic values or copy from producer.

#Producer
1. Run Producer app with mvn springboot:run
2. Check topics and Active MQ URL in configuration file src/main/resources/application.properties

#ActiveMQ
For this example we are runnign Active MQ as docker contianer
run below command:
```docker run --rm -it -p 61616:61616 -p 8161:8161 rmohr/activemq:latest```
