# Java类

- Java8有217个包，4240个类，主要是java，javax，org三个包

- [Java类文档](http://docs.oracle.com/javase/8/docs/api)

|       -    |     -      |
|:----------|:----------|
| java.applet.*   | 提供了创建applet需要的所有类|
| java.awt.*    | 提供了创建用户界面以及绘制和管理图形、图像的类  |
| java.beans.*    | 提供了开发Java Beans需要的所有类    |
| java.io.*    | 提供了通过数据流、对象序列以及文件系统实现的系统输入、输出    |
| java.lang.*   | Java编程语言的基本类库    |
|java.math.*	|提供了简明的整数运算以及十进制运算的基本函数|
|java.net.*		|用于网络通讯应用的所有类|
|java.nio.*		|提供用于实现nio应用的所有类|
|java.rmi.*		|提供与远程方法调用相关的类|
|java.security.*|提供设计网络安全相关的一些类|
|java.sql.*		|提供访问和处理来自java标准数据源数据的类|
|java.text.*	|包括一种独立于自然语言的方式处理文本、日期、数字和消息的类和接口|
|java.time.*	|提供Java日期，时间类(java 8新增)|
|java.util.*	|包括集合类、时间处理模式、日期时间工具等各类常用工具包|



## 数字相关类
- Java数字类
	- 整数 Short，Int，Long
	- 浮点数 Float，Double
	- 大数类BigInteger（大整数），BigDecimal（大浮点数）
	- 随机数类Random
	- 工具类Math
- java.math包

| -  		| - 	     | - 		 |
|:----------|:----------|:----------|
| short     | 16位，2个字节   | -32768～32767    |
| int  	    | 32位，4个字节(ins)| -    |
| long      | 64位，8个字节    | 默认值0L ，L去掉出错  |
| float    | 32位，4个字节    | -   |
|double		|32位，4个字节	|默认值0.0d|



### 大数字类BigInteger
- 支持无限大的整数运算
- `对象`加法操作：b1.add(b2);
- `对象`减法操作：b1.subtract(b2);
- `对象`乘法操作：b1.multiply(b2);
- `对象`除法操作：b1.divide(b2);
- `对象`求最大值操作：b1.max(b2);
- `对象`求最小值操作：b1.min(b2);
- `对象`求余数操作:
```java
BigInteger res[] = b1.divideAndRemainder(b2);
System.out.println("商是："+res[0]+"余数是："+res[1]);
```
- `对象`比较操作:
```
flag = b1.compareTo(b2);
if(flag == -1 ) then:b1 < b2
if(flag == 0) then:b1 ==b2
else bi > b2
```


### 大浮点数BigDecimal
- 支持无限大的小数运算
```
BigDecimal num1  = new BigDecimal("10");
BigDecimal num2  = new BigDecimal("3");
BigDecimal num3  = num1.divide(num2 , 3 , BigDecimal.ROUND_HALF_UP);
```

### Random随机数
- nextInt() 返回一个随机int
- nextInt(int a) 返回一个[0,a)之间的随机int
- nextDouble() 返回一个[0.0,1.0]之间的double
- ints方法批量返回随机数数组
- Math.random()返回一个[0.0,1.0]之间的double


### java.lang.Math
- 绝对值函数abs
- 对数函数log
- 比较函数max、min
- 幂函数pow
- 四舍五入函数round等
- 向下取整floor
- 向上取整ceil


## 总结
- 注意浮点数精度

