server.port=8095

spring.application.name=zuul
eureka.client.service-url.defaultZone=http://localhost:8090/eureka

#zuul.routes.getclient.url=http://localhost:8097

#zuul.routes.getclienttwo.service-id=client1
#zuul.routes.getproduce.service-id=produce
#zuul.routes.getconsume.service-id=consume
#zuul.routes.getui.service-id=appui
zuul.routes.getproduce.service-id=producer
zuul.routes.getconsume.service-id=consumer
zuul.routes.getui.service-id=ui