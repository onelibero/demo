# demo
记录一些关于java的语法知识
# Collection
## 实现了list接口
## 实现了queen接口
## 实现了set接口
## 实现了map接口（map不属于collection）

# Internet
## 网络地址获取
## TCP和UDP的一些使用
## URL的一些使用

# IO
## 文件流

# JUC
## 双重效验的单例模式

# Lambda
可以将Lambda表达式理解为一个匿名函数； Lambda表达式允许将一个函数作为另外一个函数的参数； 
- 避免匿名内部类定义过多
- 可以让你的代码看起来很简洁
- 去掉一堆没有意义的代码，只留下核心逻辑
    - 函数式接口：任何接口如果只包含唯一一个抽象方法，那么它就是一个函数式接口(public abstract void run())
    - 对于函数式接口，我们可以通过lamda表达式来创建该接口的对象
- 其实质属于函数式编程的概念
  - (params)->expression[表达式]
  - (params)->statement[语句]
  - (params)->{statements}
此处写了九种类型的参考

# redis
 单线程模型,处理高性能和高并发的问题的缓存数据库


- SDS(动态字符串)
- list

## String类型的使用
### 存储对象 
存储序列化后的数据，存储整个对象，key是对象，value是值
### 操作(跟key value或key)
set,get,setnx,mset,mget,strlen,incr,decr,exists,del,expire(+key +时间)
### 场景
可以用来存储session，token,或者是通过记录整数型数据来记录用户单位时间内请求数量进行限流，还可以用于实现分布式锁（setnx）等
## hash类型的使用
### 存储对象及其字段
存储对象的字段值，相比较String类型存储那种字段经常进行更改的，key是对象，filed是字段名，value是字段值
### 操作(跟key filed value或key或key filed)
hset,hget,hsetnx,hmset,hmget,hgetall,hexists,hdel,hlen,HINCRBY key field increment
### 场景 
比如用户信息，购物车信息等
## set类型的使用
### 存储对象
存储不重复的对象,一个key相当于是个集合，value是集合里面的值
### 操作(跟key value,value或key)
sadd,smembers(获取所有的key),scad(获取数量),sismember key member(判断是否在key里面)
- 交集 sinter
### 场景 
主要是作用于并集，交集用于随机抽奖，动态点赞，文章点赞，共同好友，推荐好友等
## zset类型的使用
相对set类型
## list类型的使用



# sort
## 介绍八种排序方式

 
