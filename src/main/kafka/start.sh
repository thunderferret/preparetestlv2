/bin/bash ./bin/zookeeper-server-start.sh ./config/zookeeper.properties
/bin/bash ./bin/kafka-server-start.sh ./config/server.properties
/bin/bash ./bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic testch
