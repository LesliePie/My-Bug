#连接阿里云redis

#阿里云的redis是只能ecs服务器内部才能进行访问，外网如果访问，则需要添加配置

#   1.阿里云ecs服务器安装redis
    
    下载redis相关tar包
    $ wget http://download.redis.io/releases/redis-4.0.10.tar.gz
    解压
    $ tar xzf redis-4.0.10.tar.gz
    打开redis解压后包
    cd redis-4.0.10
    make 
    make install
    至此，redis安装完成
#  2.连接redis
    redis地址和密码
    redis-cli -h xxxx.redis.rds.aliyuncs.com -p 6379 -a password
    连接失败,原因：ecs服务器和redis必须处于同一网络，进入控制台修改为同一网络
    再次连接，失败
    修改redis白名单，添加ecs服务器地址至白名单中
    连接成功！！！
    
#  3.配置外网访问
    下载rinetd工具
    wget http://www.boutell.com/rinetd/http/rinetd.tar.gz
    解压
    tar -xvf rinetd.tar.gz
    设置端口范围
    sed -i 's/65536/65535/g' rinetd.c
    安装
    mkdir /usr/man/  
    make && make install
    写不下去了
    https://help.aliyun.com/document_detail/43850.html?spm=a2c4g.11186623.6.572.k7uuRY
    注意事项，ecs服务开启安全组规则6379即可
      
    