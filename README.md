This repository provides a small working example showing the use of Spring Boot (with Gradle) and JSON-RPC. As JSON-RPC implementation [jsonrpc4j](https://github.com/briandilley/jsonrpc4j) is used.

This code is forked from [SubOptimal's example](https://github.com/SubOptimal/spring-boot-jsonrpc4j), which does everything this does, just with maven instead of Gradle.

## build

```shell
./gradlew clean && ./gradlew build
```

## run the server

```
./gradlew bootRun
```

## send a JSON RPC request

request:
```bash
curl -H "Content-Type:application/json" -d '{"id":"1","jsonrpc":"2.0","method":"sayHello","params":{"name":"luke"}}' http://localhost:8080/hello
```

response:
```bash
{"jsonrpc":"2.0","id":"1","result":"Hello, luke"}
```
