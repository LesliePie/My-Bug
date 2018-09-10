redis 序列化
# backGround : 
    采用spring data redis 插入 hash类型
# error:
    class cast Exception
# case by:
     1.了解StringRedisTemplate 和 redisTemplate 区别
     2.采用StringRedisTemplate，为其设置hash序列规则
     
      @Bean
         public RedisTemplate<String,String> redisTemplate(RedisConnectionFactory factory){
             StringRedisTemplate stringRedisTemplate=new StringRedisTemplate();
             stringRedisTemplate.setConnectionFactory(factory);
             Jackson2JsonRedisSerializer<Object> jackson2JsonRedisSerializer=new Jackson2JsonRedisSerializer<Object>(Object.class);
             ObjectMapper objectMapper=new ObjectMapper();
             objectMapper.setVisibility(PropertyAccessor.ALL,JsonAutoDetect.Visibility.ANY);
             objectMapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
             jackson2JsonRedisSerializer.setObjectMapper(objectMapper);
             //设置value序列化
             stringRedisTemplate.setValueSerializer(jackson2JsonRedisSerializer);
             //hash序列化
             stringRedisTemplate.setHashKeySerializer(jackson2JsonRedisSerializer);
             stringRedisTemplate.setHashValueSerializer(jackson2JsonRedisSerializer);
             stringRedisTemplate.setKeySerializer(jackson2JsonRedisSerializer);
             stringRedisTemplate.afterPropertiesSet();
             return stringRedisTemplate;
         }
#  backGround：
    redis作为shiro的缓存管理，序列化方式为 jackson序列化
#  error:
    反序列化失败
#  case by:
    shiro采用jackson序列化出错，网上有篇类似博客，采用 jdk序列化           
#  backGround:
    采用jdk 序列化，@Cacheable 注解标记字典缓存 
#   case by:
    该service返回值为PageResult<Dictionary> 泛型，大胆猜测是因为未固定类型所致，改变返回值，相信查阅泛型相关后，会有更深一步了解