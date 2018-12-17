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

Linux/OSX

```shell
curl -v -H "Content-Type: application/json" \
    -d '{"id":0, "method":"sayHelloWorld", "params":["John Doe"]}' \
    http://localhost:8080/rpc/myservice
```
Windows

```shell
curl -v -H "Content-Type: application/json"  ^
    -d "{\"id\":0, \"method\":\"sayHelloWorld\", \"params\":[\"John Doe\"]}" ^
    http://localhost:8080/rpc/myservice
```

## output

```
> POST /rpc/myservice HTTP/1.1
> Host: localhost:8080
> User-Agent: curl/7.45.0
> Accept: */*
> Content-Type: application/json
> Content-Length: 57
> 
* upload completely sent off: 57 out of 57 bytes
< HTTP/1.1 200 OK
< Server: Apache-Coyote/1.1
< Content-Type: application/json-rpc;charset=UTF-8
< Transfer-Encoding: chunked
< Date: Wed, 16 Dec 2015 00:12:59 GMT
< 
{"jsonrpc":"2.0","id":0,"result":"Hello world, John Doe"}

```
