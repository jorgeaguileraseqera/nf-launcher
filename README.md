# nf-launcher

Dump nextflow dependencies using Gradle Tooling API

## Build

build the project `./gradlew build`

## Run

For example to output the dependencies of Nextflow version `22.10.0-RC3` 

`java -jar build/libs/nf-launcher.jar 22.10.0-RC3`

it will output

```
$HOME/.gradle/caches/modules-2/files-2.1/io.nextflow/nextflow/22.10.0-RC3/c386e13793f8ddabfd0d931b0267a1ce8f360c32/nextflow-22.10.0-RC3.jar
$HOME/.gradle/caches/modules-2/files-2.1/io.nextflow/nf-httpfs/22.10.0-RC3/e0ad9f98b986a12bfd0e389c6921468f431c38eb/nf-httpfs-22.10.0-RC3.jar
$HOME/.gradle/caches/modules-2/files-2.1/io.nextflow/nf-commons/22.10.0-RC3/4c20caa4fedf773da855490341d9c760e1cbf2/nf-commons-22.10.0-RC3.jar
$HOME/.gradle/caches/modules-2/files-2.1/org.codehaus.groovy/groovy-nio/3.0.13/bfdc9d5c9ca5dc1efb0f9543dd732b7c20647fcd/groovy-nio-3.0.13.jar
$HOME/.gradle/caches/modules-2/files-2.1/org.codehaus.groovy/groovy-xml/3.0.13/ddfcf27160748971f2d3aafc00ede067da2f5ee9/groovy-xml-3.0.13.jar
$HOME/.gradle/caches/modules-2/files-2.1/org.codehaus.groovy/groovy-json/3.0.13/21a3d9aeaf975d40d82c4d497e29d9feff066292/groovy-json-3.0.13.jar
$HOME/.gradle/caches/modules-2/files-2.1/org.codehaus.groovy/groovy-templates/3.0.13/fa252df34a67831060c47fd5e00099b6cbef2e31/groovy-templates-3.0.13.jar
$HOME/.gradle/caches/modules-2/files-2.1/org.codehaus.groovy/groovy/3.0.13/7652b22000c2cebbfdcfdf530a64e41baa518cb/groovy-3.0.13.jar
$HOME/.gradle/caches/modules-2/files-2.1/org.slf4j/jcl-over-slf4j/1.7.36/d877e195a05aca4a2f1ad2ff14bfec1393af4b5e/jcl-over-slf4j-1.7.36.jar
$HOME/.gradle/caches/modules-2/files-2.1/org.slf4j/jul-to-slf4j/1.7.36/ed46d81cef9c412a88caef405b58f93a678ff2ca/jul-to-slf4j-1.7.36.jar
$HOME/.gradle/caches/modules-2/files-2.1/org.slf4j/log4j-over-slf4j/1.7.36/2a753acda077203a4794f106871bb237501c9a53/log4j-over-slf4j-1.7.36.jar
$HOME/.gradle/caches/modules-2/files-2.1/ch.qos.logback/logback-classic/1.2.11/4741689214e9d1e8408b206506cbe76d1c6a7d60/logback-classic-1.2.11.jar
$HOME/.gradle/caches/modules-2/files-2.1/ch.qos.logback/logback-core/1.2.11/a01230df5ca5c34540cdaa3ad5efb012f1f1f792/logback-core-1.2.11.jar
$HOME/.gradle/caches/modules-2/files-2.1/org.codehaus.gpars/gpars/1.2.1/c3ea0fbcd67a163bd5e3a3efdaa3428262d0d437/gpars-1.2.1.jar
$HOME/.gradle/caches/modules-2/files-2.1/ch.grengine/grengine/1.3.0/d8f8ed672be287d1e32fd66be67bc7d090b85b8d/grengine-1.3.0.jar
$HOME/.gradle/caches/modules-2/files-2.1/commons-lang/commons-lang/2.6/ce1edb914c94ebc388f086c6827e8bdeec71ac2/commons-lang-2.6.jar
$HOME/.gradle/caches/modules-2/files-2.1/org.pf4j/pf4j-update/2.3.0/27b5ac44b6017013ed29727383026b592c351478/pf4j-update-2.3.0.jar
$HOME/.gradle/caches/modules-2/files-2.1/commons-codec/commons-codec/1.15/49d94806b6e3dc933dacbd8acb0fdbab8ebd1e5d/commons-codec-1.15.jar
$HOME/.gradle/caches/modules-2/files-2.1/commons-io/commons-io/2.11.0/a2503f302b11ebde7ebc3df41daebe0e4eea3689/commons-io-2.11.0.jar
$HOME/.gradle/caches/modules-2/files-2.1/com.beust/jcommander/1.35/47592e181b0bdbbeb63029e08c5e74f6803c4edd/jcommander-1.35.jar
$HOME/.gradle/caches/modules-2/files-2.1/com.esotericsoftware.kryo/kryo/2.24.0/c6b206e80cfd97e66a1364003724491c757b92f/kryo-2.24.0.jar
$HOME/.gradle/caches/modules-2/files-2.1/org.iq80.leveldb/leveldb/0.12/12ea5d0e5640d91695210bfb065562ee969a25ff/leveldb-0.12.jar
$HOME/.gradle/caches/modules-2/files-2.1/org.eclipse.jgit/org.eclipse.jgit/6.2.0.202206071550-r/d59e7ae8528fcc3854acbb307de8443b28a5c945/org.eclipse.jgit-6.2.0.202206071550-r.jar
$HOME/.gradle/caches/modules-2/files-2.1/javax.mail/mail/1.4.7/9add058589d5d85adeb625859bf2c5eeaaedf12d/mail-1.4.7.jar
$HOME/.gradle/caches/modules-2/files-2.1/javax.activation/activation/1.1.1/485de3a253e23f645037828c07f1d7f1af40763a/activation-1.1.1.jar
$HOME/.gradle/caches/modules-2/files-2.1/org.yaml/snakeyaml/1.30/8fde7fe2586328ac3c68db92045e1c8759125000/snakeyaml-1.30.jar
$HOME/.gradle/caches/modules-2/files-2.1/org.jsoup/jsoup/1.14.3/c43a81e18e6d0eb71951aa031d55d5c293c531a6/jsoup-1.14.3.jar
$HOME/.gradle/caches/modules-2/files-2.1/jline/jline/2.9/84693d4d75aa2a3af8447873cac8c0aed25ce863/jline-2.9.jar
$HOME/.gradle/caches/modules-2/files-2.1/org.pf4j/pf4j/3.4.1/6ba44242fa925f48af1784b3e57d9ab7fd186215/pf4j-3.4.1.jar
$HOME/.gradle/caches/modules-2/files-2.1/dev.failsafe/failsafe/3.1.0/3a5bda837103d319e841f8fe7a3eb98f2bdb480a/failsafe-3.1.0.jar
$HOME/.gradle/caches/modules-2/files-2.1/com.google.guava/guava/31.1-jre/60458f877d055d0c9114d9e1a2efb737b4bc282c/guava-31.1-jre.jar
$HOME/.gradle/caches/modules-2/files-2.1/org.slf4j/slf4j-api/1.7.36/6c62681a2f655b49963a5983b8b0950a6120ae14/slf4j-api-1.7.36.jar
$HOME/.gradle/caches/modules-2/files-2.1/org.multiverse/multiverse-core/0.7.0/db77d55199bc5672f05f5d725b70dd10033251ed/multiverse-core-0.7.0.jar
$HOME/.gradle/caches/modules-2/files-2.1/org.codehaus.jsr166-mirror/jsr166y/1.7.0/8547fcb1c29b4f8c745c3f49a536aca58fc30f54/jsr166y-1.7.0.jar
$HOME/.gradle/caches/modules-2/files-2.1/org.objenesis/objenesis/2.1/87c0ea803b69252868d09308b4618f766f135a96/objenesis-2.1.jar
$HOME/.gradle/caches/modules-2/files-2.1/org.iq80.leveldb/leveldb-api/0.12/c97c934e9de3be7b48f6677385e1294c9ec25cc6/leveldb-api-0.12.jar
$HOME/.gradle/caches/modules-2/files-2.1/com.googlecode.javaewah/JavaEWAH/1.1.13/32cd724a42dc73f99ca08453d11a4bb83e0034c7/JavaEWAH-1.1.13.jar
$HOME/.gradle/caches/modules-2/files-2.1/com.github.zafarkhaja/java-semver/0.9.0/59a83ca73c72a5e25b3f0b1bb305230a11000329/java-semver-0.9.0.jar
$HOME/.m2/repository/com/google/guava/failureaccess/1.0.1/failureaccess-1.0.1.jar
$HOME/.m2/repository/com/google/guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava/listenablefuture-9999.0-empty-to-avoid-conflict-with-guava.jar
$HOME/.m2/repository/com/google/code/findbugs/jsr305/3.0.2/jsr305-3.0.2.jar
$HOME/.gradle/caches/modules-2/files-2.1/org.checkerframework/checker-qual/3.12.0/d5692f0526415fcc6de94bb5bfbd3afd9dd3b3e5/checker-qual-3.12.0.jar
$HOME/.gradle/caches/modules-2/files-2.1/com.google.errorprone/error_prone_annotations/2.11.0/c5a0ace696d3f8b1c1d8cc036d8c03cc0cbe6b69/error_prone_annotations-2.11.0.jar
$HOME/.m2/repository/com/google/j2objc/j2objc-annotations/1.3/j2objc-annotations-1.3.jar
$HOME/.gradle/caches/modules-2/files-2.1/com.google.code.gson/gson/2.2.4/a60a5e993c98c864010053cb901b7eab25306568/gson-2.2.4.jar

```