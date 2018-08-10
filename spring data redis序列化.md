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
    
