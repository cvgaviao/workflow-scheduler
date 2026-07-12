# workflow-scheduler

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: <https://quarkus.io/>.

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:

```shell script
./mvnw quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at <http://localhost:8080/q/dev/>.

## Packaging and running the application

The application can be packaged using:

```shell script
./mvnw package
```

It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:

```shell script
./mvnw package -Dquarkus.package.jar.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using:

```shell script
./mvnw package -Dnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using:

```shell script
./mvnw package -Dnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/workflow-scheduler-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult <https://quarkus.io/guides/maven-tooling>.

## Related Guides

- AsyncAPI Scanner ([guide](https://quarkiverse.github.io/quarkiverse-docs/quarkus-asyncapi/dev/scanner.html)): This extension creates an AsyncApi-document, describing data your server publishes/subscribes to/from Kafka-topics.
- Messaging - Kafka Connector ([guide](https://quarkus.io/guides/kafka-getting-started)): Connect to Kafka with Reactive Messaging
- REST Client - OpenID Connect Token Propagation ([guide](https://quarkus.io/guides/security-openid-connect-client)): Use REST Client to propagate the incoming Bearer access token or token acquired from Authorization Code Flow as HTTP Authorization Bearer token
- Flow Runner ([guide](https://docs.quarkiverse.io/quarkus-flow/dev/)): API to enable running Quarkus Flow from HTTP endpoints

- Flow ([guide](https://docs.quarkiverse.io/quarkus-flow/dev/)): Workflow engine for Quarkus based on the CNCF Workflow Specification, with Java DSL and Agentic AI support.

- Flow Messaging ([guide](https://docs.quarkiverse.io/quarkus-flow/dev/)): SmallRye Messaging support for Quarkus Flow.
Please see the main extension for more details.

- Flow Persistence Common ([guide](https://docs.quarkiverse.io/quarkus-flow/dev/)): Common persistence components shared across Flow persistence implementations

- Flow Scheduler ([guide](https://docs.quarkiverse.io/quarkus-flow/dev/)): Flow scheduler implemetation relying on quarkus scheduler


## Provided Code

### Messaging codestart

Use Quarkus Messaging

[Related Apache Kafka guide section...](https://quarkus.io/guides/kafka-reactive-getting-started)

