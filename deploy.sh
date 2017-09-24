whereis curl
whereis mvn
mvn package
curl -T target/server*dependencies.jar --insecure -u $1:$2 scp://213.168.29.165/~/server.jar
