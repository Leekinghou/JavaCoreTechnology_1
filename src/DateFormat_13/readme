# 格式化类

## 格式化类(1)

### java.text包java.text.Format的子类
NumberFormat:数字格式化，抽象类
- DecimalFormat
	- 查看代码DecimalFormaterRuleTest.java
```java
//整数部分为0的情况，0/#的区别
整数部分为0， #认为整数不存在，可不写；0认为没有，但写至少一位，写0
//小数部分0/#的区别
#代表最多有几位，0代表必须有且只能有几位
//整数不为0时
0和#对整数部分多位时的处理是一致的，有几位写几位
```
MessageFormat:字符串格式化
- DateFormat：日期/时间格式化，抽象类
	- 查看SimpleDateFormat.java
### java.time.format包下
DateTimeFormatter


## 格式化类(2)

### NumberFormat:数字格式化，抽象类
	- DecimalFormat 工厂模式
	- 例如将1234567格式化输出1,234,567
- 查看DecimalFormaterRuleTest.java
- 查看DecimalFormatTest.java

- DateFormat：时间格式化，抽象类
	- SimpleDateFormat 工厂模式
	- parse：将字符串格式化为时间对象
	- format：将时间对象格式化为字符串
	- 如将当前时间转为YYYY - MM - DD - HH24：MI：SS输出
- 查看SimpleDateFormatTest.java

### java.time.format.DateFormatter:时间格式化
	- JDK8中发布，线程安全(vs SimpleDateFormat线程不安全)
	- ofPattern:设定时间格式
	- parse：将字符串格式化为时间对象
	- format：将时间对象格式化为字符串
	- 如将当前时间转为YYYY - MM - DD - HH24：MI：SS输出
- 查看DateFormatterTest.java

## 格式化类(3)
	- 支持多个参数-值对位复制文本
	- 支持变量的自定义格式
	- 例如将“Hello{1}”根据变量值格式化为Hello World
- 查看MessageFormatTest.java

## 总结
- 三种格式化
	- 数字格式化
	- 字符串格式化
	- 时间格式化
