# 不可变对象（Immutable Object）
- 一旦创建，这个对象（状态/值）不能被更改
- 其内在的成员变量的值就不能更改了
- 典型的不可变对象
	- 八个基本型别的包装类的对象
	- String，BigInteger和BigDecimal等的对象
- 可变对象（Mutable Object）
	- 普通对象
```java
String a = new String("abc");
String b = a;
System.out.println(b);
a = "def";
System.out.println(b);

>>> both of them are "abc"
```
- 如何创建不可变对象
	- immutable对象是不可改变的，有改变，就用`clone`**/**`new`一个对象进行修改
	- 所有属性都是final和private的
	- 不提供setter方法
	- 类是final的，或者所有的方法都是final
	- 类中包含`mutable`对象，那么返回拷贝需要深度clone

## 优点
- 只读，线程安全
- 并发读，提高性能
- 可以重复使用

## 缺点
- 制造垃圾，浪费空间


## 字符串
- 字符串是Java使用最多的类，是一种典型的不可变对象

### String定义方法有两种
```java
String a = "abc";
String b = new String("abc"); //new对象，堆分配内存
```
- 字符串内容比较：equals方法

- 是否指向同一个对象：指针比较==

## Java常量池
- 保存在编译期间就已经确定的数据
- 是一块特殊的内存
- 相同的常量字符串只存储一份，节省内存，共享访问

## 字符串加法
```java
String a = "abc";
a = a + "def";
//由于String不可修改，效率差
```
- 使用StringBuffer/StringBuilder类的`append方法`进行修改
- StringBuffer **（同步，线程安全，修改快速）**
- StringBuilder **（不同步，线程不安全，修改更快）**
- StringAppendTest.java比较字符串操作时间性能
- StringPassingTest.java和ArgumentPassing.java理解可变对象传参

## 总结
- 不可变对象可以提高读效率
- 要学会不可变对象设计的方法
- 字符串append操作速度：StringBuilder > StringBuffer > String































