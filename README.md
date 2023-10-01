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

八种数据结构

- SDS（主要用于存储动态字符串）
- 

## String类型的使用
存储序列化后的数据，存储整个对象，可以用来存储session，token等
## hash类型的使用
存储对象的字段值，相比较String类型存储那种字段经常进行更改的，比如购物车清单
## set类型的使用
存储不重复的对象，用于随机抽奖，动态点赞，文章点赞，共同好友，推荐好友等
## zset类型的使用
## list类型的使用



# sort
## 介绍八种排序方式

 
