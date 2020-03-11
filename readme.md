查看日志
docker logs -f ID
systemctl start docker
mysql
docker run -di --name=tensquare_mysql -p 3306:3306 MYSQL_ROOT_PASSWORD=4321`qaz centos/mysql-57-centos7

docker restart id

docker kill id

docker run -di --name=tensquare_redis -p 6379:6379 redis

redis
docker run -di --name=tensquare_redis -p 6379:6379 redis

elasticsearch
docker run -di --name=tensquare_es -p 9200:9200 -p 9300:9300 elasticsearch:5.6.8

远程连接配置修改
docker cp tensquare_es:/usr/share/elasticsearch/config/elasticsearch.yml /usr/share/elasticsearch.yml
停止
docker stop tensquare_es
删除
docker rm tensquare_es
创建带配置文件的es容器
docker run -di --name=tensquare_es -p 9200:9200 -p 9300:9300 -v /usr/share/elasticsearch.yml:/usr/share/elasticsearch/config/elasticsearch.yml elasticsearch:5.6.8

nofile是单个进程允许打开的最大文件个数 soft nofile 是软限制 hard nofile是硬限制
修改vi /etc/security/limits.conf ，追加内容
* soft nofile 65536
* hard nofile 65536

限制一个进程可以拥有的VMA(虚拟内存区域)的数量
修改/etc/sysctl.conf，追加内容
vm.max_map_count=655360
重启
reboot

rabbitmq
docker run -di --name=tensquare_rabbitmq -p 5671:5617 -p 5672:5672 -p 4369:4369 -p 15671:15671 -p 15672:15672 -p 25672:25672 rabbitmq:management

zookeeper
docker run -di --name=zookeeper -p 2181:2181 zookeeper
docker exec -it zkid bash 进入容器
cd bin
./zkCli.sh