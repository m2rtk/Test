mvn package
curl -T target/server*dependencies.jar --insecure -u $FTPUSER:$FTPPASS scp://213.168.29.165/~/server.jar
