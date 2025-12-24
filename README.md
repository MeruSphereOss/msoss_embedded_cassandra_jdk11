# Embedded Cassandra runs on JDK11 only

## Make sure you install JDK11 and use it for this project

## How to build ?
Once you checkout the code Please run the code with the following command

```
mvn clean install
```

## Us this as a dependency in Other projects

```
<dependency>
    <groupId>com.merusphere.oss.ut</groupId>
    <artifactId>embedded-cassandra-jdk11</artifactId>
    <version>1.0.0</version>
    <scope>test</scope>
</dependency>
```

## How to check whether the Embedded Cassandra is Running or not
Run the following command for TCP Port Listen

```
lsof -nP -iTCP:9142 -sTCP:LISTEN
```

Check the Logg files at

```
tail -f <target>/cassandra/*.log
```
