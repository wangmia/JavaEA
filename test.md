
# Table of Contents

1.  [什么是DI？](#orgf142cc7)
2.  [在Spring中注入Bean有几种方式？你认为那种方式最好， 为什么？](#org5fdb94b)
3.  [BeanFactory和ApplicationContext之间的区别是什么？](#org513de46)
4.  [什么是Spring Bean？](#orgcb14a18)
5.  [如何定义Spring Bean的作用域？](#org78cf737)
6.  [Spring Bean的生命周期是怎样的？](#org575c7bd)
7.  [Spring Boot是什么？](#org74af3dc)
8.  [列举Spring Framework所使用的设计模式](#org1d7859a)
9.  [Bean Scope Prototype如何工作？](#org05d6de8)
10. [描述在Spring MVC模型下对于一次请求的完整工作流](#org1663bef)
11. [AOP的实现原理及其优点](#org821b839)


<a id="orgf142cc7"></a>

# 什么是DI？
答：DI是依赖注入的意思，是指程序依赖容器创建并注入它所需要的依赖对象。

<a id="org5fdb94b"></a>

# 在Spring中注入Bean有几种方式？你认为那种方式最好， 为什么？
答：1.用setter方式注入，需要些bean和Dao的setter方法，
2.用注解方式，@Autowired，配置.xml


<a id="org513de46"></a>

# BeanFactory和ApplicationContext之间的区别是什么？
答：ApplicationContext作为一个外部的接口，是BeanFactory的子接口，同时也是作为Spring的容器，里面包括了Bean的工厂，BeanFactory又叫做Bean工厂。

<a id="orgcb14a18"></a>

# 什么是Spring Bean？
答：Spring Bean是实例化的，被Spring IOC容器管理的Java类的对象。

<a id="org78cf737"></a>

# 如何定义Spring Bean的作用域？
答：Spring有5种作用域，分别为singleton（单例）、prototype（原型）、request、session和global session


<a id="org575c7bd"></a>

# Spring Bean的生命周期是怎样的？
答：通过容器ApplicationContext创建，使用BeanFactory创建新建一个新的Bean，然后初始化，在调用getBean()方法,就可以使用Bean了，最后在调用destory()的方法删除Bean

<a id="org74af3dc"></a>

# Spring Boot是什么？
答：Spring Boots就是为了简化Spring应用初始搭建以及开发过程繁琐步骤而衍生的新型架构。

<a id="org1d7859a"></a>

# 列举Spring Framework所使用的设计模式
答：单例模式 ：Spring Bean 实例
        工厂模式 ：ApplicationContext 容器 里的 BeanFactory 
        代理模式 ：Spring 是面向切面AOP的编程

<a id="org05d6de8"></a>

# Bean Scope Prototype如何工作？
答：scope="prototype"的bean容器在接受到该bai类型的对象的请求的时候，会每次都重新生成一个新的对象给请求方

<a id="org1663bef"></a>

# 描述在Spring MVC模型下对于一次请求的完整工作流
答：客户端发送请求到前端控制器Dispatch servlet 来处理，它负责将请求分发给别的模块处理。
Dispatch收到请求后，会根据请求信息的URL到处理映射选择器Handler Mapping里找到对应请求的Handler，并返回一串URL给Dispatch Servlet。
Dispatch会把请求发送给 拦截器 Handler Interceptor 解析一些判断信息等，然后再到对应的Controller处理请求以及给予回应，然后就再返回到Dispatch，而Dispatch要借助View Resolver 的功能，来完成对视图的解析工作，最后Dispatch会根据视图模型渲染返还给客户端
客户端得到响应后，可能是一个HTML页面，也可能是一个json格式的字符串。

<a id="org821b839"></a>

# AOP的实现原理及其优点
答：AOP是面向切面的编程，它利用一种称为“横切”的技术，剖解开封装的对象内部，并将那些影响了多个类的公共行为封装到一个可重用模块，就是将那些与业务无关，却为业务模块所共同调用的逻辑或责任封装起来，便于减少系统的重复代码，降低模块间的耦合度，并有利于未来的可操作性和可维护性。
优点是可以简化原来OOP的代码，它应用了代理模式

