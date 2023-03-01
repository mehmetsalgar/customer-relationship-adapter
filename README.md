https://blog.softwaremill.com/small-fast-docker-images-using-graalvms-native-image-99c0bc92e70b
docker build -t graalvm-native-image .

docker run -v /Volumes/Data1/wss/fsm/customer-relationship-adapter-application/src/main/java:/opt/src -v /Volumes/Data1/wss/fsm/customer-relationship-adapter-application/build/libs:/opt/cp -v /Volumes/Data1/wss/fsm/customer-relationship-adapter-application/build/native:/opt/graalvm graalvm-native-image "-cp" "/opt/src:/opt/cp/*" "--static" "-H:Name=out" "org.salgar.akka.fsm.cra.CustomerRelationshipAdapterApplication"

docker run --rm -v /Users/msalgar/.gradle/native-build-tools/repositories/4a31c5f3a67ff88b40f20c54f610d8a75b1c913c/exploded/:/opt/configFiles -v /Volumes/Data1/wss/fsm/customer-relationship-adapter-application/target/native:/opt/graalvm graalvm-native-image "-cp" "/opt/classpath/*" "-H:ConfigurationFileDirectories=/opt/configFiles/*" "--static" --no-fallback "-H:Name=out" "-H:+ReportExceptionStackTraces" -J-Xmx4g -J-Xmx4g "org.salgar.akka.fsm.cra.CustomerRelationshipAdapterApplication"

docker run --rm -v /Users/msalgar/.gradle/native-build-tools/repositories/4a31c5f3a67ff88b40f20c54f610d8a75b1c913c/exploded/:/opt/configFiles -v /Volumes/Data1/wss/fsm/customer-relationship-adapter-application/target/native:/opt/graalvm gni "-cp" "/opt/classpath/*" "-H:ConfigurationFileDirectories=/opt/configFiles/*" "--static" --no-fallback "-H:Name=out" "-H:+ReportExceptionStackTraces" -J-Xmx4g -J-Xmx4g "org.salgar.akka.fsm.cra.CustomerRelationshipAdapterApplication"

docker run --rm  -v /Users/msalgar/.gradle/native-build-tools/repositories/4a31c5f3a67ff88b40f20c54f610d8a75b1c913c/exploded/:/opt/configFiles -v /Users/msalgar/output:/opt/graalVM gni "-cp"  "/opt/classpath/*" "-H:ConfigurationFileDirectories=/opt/configFiles/*" "--static" --no-fallback "-H:Name=out" "-H:+ReportExceptionStackTraces" -J-Xmx4g -J-Xmx4g "org.salgar.akka.fsm.cra.CustomerRelationshipAdapterApplication"

 -H:Path=/Volumes/Data1/wss/fsm/customer-relationship-adapter-application/build/native/nativeCompile  -H:ConfigurationFileDirectories=/Volumes/Data1/wss/fsm/customer-relationship-adapter-application/build/native/generated/generateResourcesConfigFile,/Users/msalgar/.gradle/native-build-tools/repositories/4a31c5f3a67ff88b40f20c54f610d8a75b1c913c/exploded/ch.qos.logback/logback-classic/1.4.1,/Users/msalgar/.gradle/native-build-tools/repositories/4a31c5f3a67ff88b40f20c54f610d8a75b1c913c/exploded/org.hdrhistogram/HdrHistogram/2.1.12,/Users/msalgar/.gradle/native-build-tools/repositories/4a31c5f3a67ff88b40f20c54f610d8a75b1c913c/exploded/org.apache.tomcat.embed/tomcat-embed-core/10.0.20

docker run --rm  -v /Users/msalgar/.gradle/native-build-tools/repositories/4a31c5f3a67ff88b40f20c54f610d8a75b1c913c/exploded/:/opt/configFiles -v /Users/msalgar/output:/opt/graalVM gni "-cp"  "/opt/classpath/aot:/opt/classpath/aotClasses:/opt/classpath/*:/opt/resourceFiles" "-H:ConfigurationFileDirectories=/opt/configFiles,/opt/resourceFiles" "--static" --no-fallback "-H:Name=customer-relationship-adapter-application" "-H:+ReportExceptionStackTraces" -J-Xmx4g -J-Xmx4g --verbose


Starting process 'command 
'/Library/Java/JavaVirtualMachines/graalvm-ce-java17-22.3.0/Contents/Home/bin/java''. 
Working directory: /Volumes/Data1/wss/fsm/customer-relationship-adapter-application Command: 
/Library/Java/JavaVirtualMachines/graalvm-ce-java17-22.3.0/Contents/Home/bin/java 
-Dfile.encoding=UTF-8
-Duser.country=DE 
-Duser.language=en 
-Duser.variant 
-cp 
/Volumes/Data1/wss/fsm/customer-relationship-adapter-application/build/classes/java/main:
/Volumes/Data1/wss/fsm/customer-relationship-adapter-application/build/resources/main:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.springframework.boot/spring-boot-starter-actuator/3.0.0/bc775ac676465e9da4d191d5b8378e1391fc708c/spring-boot-starter-actuator-3.0.0.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.springframework.boot/spring-boot-starter-web/3.0.0/5dd6c38f60b915dce2c4a340f4ea68f2e52306f8/spring-boot-starter-web-3.0.0.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.springframework.boot/spring-boot-starter-json/3.0.0/beb1a175ad3cdec82ebd36dd1ddd08a9738a2d86/spring-boot-starter-json-3.0.0.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.springframework.boot/spring-boot-starter/3.0.0/18c02ab19529d866723b40c03021cd731c3edb50/spring-boot-starter-3.0.0.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.springframework.boot/spring-boot-actuator-autoconfigure/3.0.0/4d437f988e82692b969fdec4a43002d8857e1c01/spring-boot-actuator-autoconfigure-3.0.0.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/io.micrometer/micrometer-core/1.10.2/ca69ca5d4d1fea81ec5f3e05bc159db4e3c87e1/micrometer-core-1.10.2.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.springframework/spring-webmvc/6.0.2/cf96960288ba6a95da3488b6d255803c50fa1927/spring-webmvc-6.0.2.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.springframework/spring-web/6.0.2/39dde8bfcc9074af0fcec924ca7465cb90eb25d4/spring-web-6.0.2.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/io.micrometer/micrometer-observation/1.10.2/5b63205c0e9f3acf4b84f852ea707f9f9fffda6f/micrometer-observation-1.10.2.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.springframework.boot/spring-boot-starter-tomcat/3.0.0/cbaf1a7a69a4a4126896bc397c14b9281634f8e7/spring-boot-starter-tomcat-3.0.0.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.springframework.boot/spring-boot-autoconfigure/3.0.0/11c57cfd7a6c6ef2cf16cc91c4d9173f6ab16dd2/spring-boot-autoconfigure-3.0.0.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.springframework.boot/spring-boot-actuator/3.0.0/647ddeb370cfc79329663b28edc32e1fbf6ca10f/spring-boot-actuator-3.0.0.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.springframework.boot/spring-boot/3.0.0/dcf84aaccdb294b8fe53a92b57efecf16708eb2c/spring-boot-3.0.0.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.springframework.boot/spring-boot-starter-logging/3.0.0/af37a21b0be9c0c8cd11e3f8a3330b314af639d3/spring-boot-starter-logging-3.0.0.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/jakarta.annotation/jakarta.annotation-api/2.1.1/48b9bda22b091b1f48b13af03fe36db3be6e1ae3/jakarta.annotation-api-2.1.1.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.springframework/spring-context/6.0.2/649dc1c9947da39a0d4e3869d61e7270489aaa25/spring-context-6.0.2.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.springframework/spring-aop/6.0.2/fe73295dd65e6b2f53986622c1e622cd3d09aa03/spring-aop-6.0.2.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.springframework/spring-beans/6.0.2/87ded7c3d973ec0bfebe0b6511375ffebe178ae5/spring-beans-6.0.2.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.springframework/spring-expression/6.0.2/89687daffb67231f6be7783775c1f0d46f4541fe/spring-expression-6.0.2.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.springframework/spring-core/6.0.2/43f8a6c8b522181d507705aac0e1f1b1e81e7701/spring-core-6.0.2.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.yaml/snakeyaml/1.33/2cd0a87ff7df953f810c344bdf2fe3340b954c69/snakeyaml-1.33.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/com.fasterxml.jackson.datatype/jackson-datatype-jdk8/2.14.1/da194197d187bf24a8699514344ebf0abd7c342a/jackson-datatype-jdk8-2.14.1.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/com.fasterxml.jackson.module/jackson-module-parameter-names/2.14.1/2e05a86dba3d4b05074b6a313c4d5b7ff844c8dd/jackson-module-parameter-names-2.14.1.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/com.fasterxml.jackson.core/jackson-annotations/2.14.1/2a6ad504d591a7903ffdec76b5b7252819a2d162/jackson-annotations-2.14.1.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/com.fasterxml.jackson.core/jackson-core/2.14.1/7a07bc535ccf0b7f6929c4d0f2ab9b294ef7c4a3/jackson-core-2.14.1.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/com.fasterxml.jackson.datatype/jackson-datatype-jsr310/2.14.1/f24e8cb1437e05149b7a3049ebd6700f42e664b1/jackson-datatype-jsr310-2.14.1.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/com.fasterxml.jackson.core/jackson-databind/2.14.1/268524b9056cae1211b9f1f52560ef19347f4d17/jackson-databind-2.14.1.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/io.micrometer/micrometer-commons/1.10.2/3a97e1874b8ca9c1c08f67d58bf7d567bb748601/micrometer-commons-1.10.2.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.hdrhistogram/HdrHistogram/2.1.12/6eb7552156e0d517ae80cc2247be1427c8d90452/HdrHistogram-2.1.12.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.latencyutils/LatencyUtils/2.0.3/769c0b82cb2421c8256300e907298a9410a2a3d3/LatencyUtils-2.0.3.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.apache.tomcat.embed/tomcat-embed-websocket/10.1.1/c5a12c16c7ae8dc39f6dad01e486f6c76ef10343/tomcat-embed-websocket-10.1.1.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.apache.tomcat.embed/tomcat-embed-core/10.1.1/d3bbf1c2c71a79c5c472090c31e3c28efea5304e/tomcat-embed-core-10.1.1.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.apache.tomcat.embed/tomcat-embed-el/10.1.1/a5282bdc29026cacc8e2941b53c78621beed4c7/tomcat-embed-el-10.1.1.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/ch.qos.logback/logback-classic/1.4.5/28e7dc0b208d6c3f15beefd73976e064b4ecfa9b/logback-classic-1.4.5.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.apache.logging.log4j/log4j-to-slf4j/2.19.0/30f4812e43172ecca5041da2cb6b965cc4777c19/log4j-to-slf4j-2.19.0.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.slf4j/jul-to-slf4j/2.0.4/37418ab81680501a3a1e58e04d1341a5efe1c162/jul-to-slf4j-2.0.4.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.springframework/spring-jcl/6.0.2/5eec2672aab8f80a54ea9047938884813c9eeec8/spring-jcl-6.0.2.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/ch.qos.logback/logback-core/1.4.5/e9bb2ea70f84401314da4300343b0a246c8954da/logback-core-1.4.5.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.slf4j/slf4j-api/2.0.4/30d5eb5360bd113ce96f9e49e3431993bbf1b247/slf4j-api-2.0.4.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.apache.logging.log4j/log4j-api/2.19.0/ea1b37f38c327596b216542bc636cfdc0b8036fa/log4j-api-2.19.0.jar 
org.springframework.boot.SpringApplicationAotProcessor org.salgar.akka.fsm.cra.CustomerRelationshipAdapterApplication /Volumes/Data1/wss/fsm/customer-relationship-adapter-application/build/generated/aotSources /Volumes/Data1/wss/fsm/customer-relationship-adapter-application/build/generated/aotResources /Volumes/Data1/wss/fsm/customer-relationship-adapter-application/build/generated/aotClasses org.salgar.akka.fsm customer-relationship-adapter-application
Successfully started process 'command '/Library/Java/JavaVirtualMachines/graalvm-ce-java17-22.3.0/Contents/Home/bin/java''

/Library/Java/JavaVirtualMachines/graalvm-ce-java17-22.3.0/Contents/Home/bin/native-image 
-cp 
/Volumes/Data1/wss/fsm/customer-relationship-adapter-application/build/libs/customer-relationship-adapter-application-1.0.0-SNAPSHOT-plain.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.springframework.boot/spring-boot-starter-actuator/3.0.0/bc775ac676465e9da4d191d5b8378e1391fc708c/spring-boot-starter-actuator-3.0.0.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.springframework.boot/spring-boot-starter-web/3.0.0/5dd6c38f60b915dce2c4a340f4ea68f2e52306f8/spring-boot-starter-web-3.0.0.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.springframework.boot/spring-boot-starter-json/3.0.0/beb1a175ad3cdec82ebd36dd1ddd08a9738a2d86/spring-boot-starter-json-3.0.0.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.springframework.boot/spring-boot-starter/3.0.0/18c02ab19529d866723b40c03021cd731c3edb50/spring-boot-starter-3.0.0.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.springframework.boot/spring-boot-actuator-autoconfigure/3.0.0/4d437f988e82692b969fdec4a43002d8857e1c01/spring-boot-actuator-autoconfigure-3.0.0.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/io.micrometer/micrometer-core/1.10.2/ca69ca5d4d1fea81ec5f3e05bc159db4e3c87e1/micrometer-core-1.10.2.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.springframework/spring-webmvc/6.0.2/cf96960288ba6a95da3488b6d255803c50fa1927/spring-webmvc-6.0.2.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.springframework/spring-web/6.0.2/39dde8bfcc9074af0fcec924ca7465cb90eb25d4/spring-web-6.0.2.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/io.micrometer/micrometer-observation/1.10.2/5b63205c0e9f3acf4b84f852ea707f9f9fffda6f/micrometer-observation-1.10.2.jar
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.springframework.boot/spring-boot-starter-tomcat/3.0.0/cbaf1a7a69a4a4126896bc397c14b9281634f8e7/spring-boot-starter-tomcat-3.0.0.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.springframework.boot/spring-boot-autoconfigure/3.0.0/11c57cfd7a6c6ef2cf16cc91c4d9173f6ab16dd2/spring-boot-autoconfigure-3.0.0.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.springframework.boot/spring-boot-actuator/3.0.0/647ddeb370cfc79329663b28edc32e1fbf6ca10f/spring-boot-actuator-3.0.0.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.springframework.boot/spring-boot/3.0.0/dcf84aaccdb294b8fe53a92b57efecf16708eb2c/spring-boot-3.0.0.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.springframework.boot/spring-boot-starter-logging/3.0.0/af37a21b0be9c0c8cd11e3f8a3330b314af639d3/spring-boot-starter-logging-3.0.0.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/jakarta.annotation/jakarta.annotation-api/2.1.1/48b9bda22b091b1f48b13af03fe36db3be6e1ae3/jakarta.annotation-api-2.1.1.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.springframework/spring-context/6.0.2/649dc1c9947da39a0d4e3869d61e7270489aaa25/spring-context-6.0.2.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.springframework/spring-aop/6.0.2/fe73295dd65e6b2f53986622c1e622cd3d09aa03/spring-aop-6.0.2.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.springframework/spring-beans/6.0.2/87ded7c3d973ec0bfebe0b6511375ffebe178ae5/spring-beans-6.0.2.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.springframework/spring-expression/6.0.2/89687daffb67231f6be7783775c1f0d46f4541fe/spring-expression-6.0.2.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.springframework/spring-core/6.0.2/43f8a6c8b522181d507705aac0e1f1b1e81e7701/spring-core-6.0.2.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.yaml/snakeyaml/1.33/2cd0a87ff7df953f810c344bdf2fe3340b954c69/snakeyaml-1.33.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/com.fasterxml.jackson.datatype/jackson-datatype-jdk8/2.14.1/da194197d187bf24a8699514344ebf0abd7c342a/jackson-datatype-jdk8-2.14.1.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/com.fasterxml.jackson.module/jackson-module-parameter-names/2.14.1/2e05a86dba3d4b05074b6a313c4d5b7ff844c8dd/jackson-module-parameter-names-2.14.1.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/com.fasterxml.jackson.core/jackson-annotations/2.14.1/2a6ad504d591a7903ffdec76b5b7252819a2d162/jackson-annotations-2.14.1.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/com.fasterxml.jackson.core/jackson-core/2.14.1/7a07bc535ccf0b7f6929c4d0f2ab9b294ef7c4a3/jackson-core-2.14.1.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/com.fasterxml.jackson.datatype/jackson-datatype-jsr310/2.14.1/f24e8cb1437e05149b7a3049ebd6700f42e664b1/jackson-datatype-jsr310-2.14.1.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/com.fasterxml.jackson.core/jackson-databind/2.14.1/268524b9056cae1211b9f1f52560ef19347f4d17/jackson-databind-2.14.1.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/io.micrometer/micrometer-commons/1.10.2/3a97e1874b8ca9c1c08f67d58bf7d567bb748601/micrometer-commons-1.10.2.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.hdrhistogram/HdrHistogram/2.1.12/6eb7552156e0d517ae80cc2247be1427c8d90452/HdrHistogram-2.1.12.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.latencyutils/LatencyUtils/2.0.3/769c0b82cb2421c8256300e907298a9410a2a3d3/LatencyUtils-2.0.3.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.apache.tomcat.embed/tomcat-embed-websocket/10.1.1/c5a12c16c7ae8dc39f6dad01e486f6c76ef10343/tomcat-embed-websocket-10.1.1.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.apache.tomcat.embed/tomcat-embed-core/10.1.1/d3bbf1c2c71a79c5c472090c31e3c28efea5304e/tomcat-embed-core-10.1.1.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.apache.tomcat.embed/tomcat-embed-el/10.1.1/a5282bdc29026cacc8e2941b53c78621beed4c7/tomcat-embed-el-10.1.1.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/ch.qos.logback/logback-classic/1.4.5/28e7dc0b208d6c3f15beefd73976e064b4ecfa9b/logback-classic-1.4.5.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.apache.logging.log4j/log4j-to-slf4j/2.19.0/30f4812e43172ecca5041da2cb6b965cc4777c19/log4j-to-slf4j-2.19.0.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.slf4j/jul-to-slf4j/2.0.4/37418ab81680501a3a1e58e04d1341a5efe1c162/jul-to-slf4j-2.0.4.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.springframework/spring-jcl/6.0.2/5eec2672aab8f80a54ea9047938884813c9eeec8/spring-jcl-6.0.2.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/ch.qos.logback/logback-core/1.4.5/e9bb2ea70f84401314da4300343b0a246c8954da/logback-core-1.4.5.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.slf4j/slf4j-api/2.0.4/30d5eb5360bd113ce96f9e49e3431993bbf1b247/slf4j-api-2.0.4.jar:
/Users/msalgar/.gradle/caches/modules-2/files-2.1/org.apache.logging.log4j/log4j-api/2.19.0/ea1b37f38c327596b216542bc636cfdc0b8036fa/log4j-api-2.19.0.jar:
/Volumes/Data1/wss/fsm/customer-relationship-adapter-application/build/classes/java/aot:
/Volumes/Data1/wss/fsm/customer-relationship-adapter-application/build/resources/aot:
/Volumes/Data1/wss/fsm/customer-relationship-adapter-application/build/generated/aotClasses 
--no-fallback 
-H:Path=/Volumes/Data1/wss/fsm/customer-relationship-adapter-application/build/native/nativeCompile 
-H:Name=customer-relationship-adapter-application 
-H:ConfigurationFileDirectories=/Volumes/Data1/wss/fsm/customer-relationship-adapter-application/build/native/generated/generateResourcesConfigFile,
/Users/msalgar/.gradle/native-build-tools/repositories/4a31c5f3a67ff88b40f20c54f610d8a75b1c913c/exploded/ch.qos.logback/logback-classic/1.4.1,
/Users/msalgar/.gradle/native-build-tools/repositories/4a31c5f3a67ff88b40f20c54f610d8a75b1c913c/exploded/org.hdrhistogram/HdrHistogram/2.1.12,
/Users/msalgar/.gradle/native-build-tools/repositories/4a31c5f3a67ff88b40f20c54f610d8a75b1c913c/exploded/org.apache.tomcat.embed/tomcat-embed-core/10.0.20

DEV-5
