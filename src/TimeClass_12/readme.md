# 时间类

## 种类
- java.util.Date 基本废弃
- java.sql.Date (与数据库对应的时间类)
- Calendar，是`抽象类`
	- Calendar gc = Calendar.getInstance();
	- Calendar gc = new GregorianCalendar();
	- 简单工厂模式
	- CalendarClassTest.java

## Calendar
- get(Field) 获取时间中每个属性的值，`月份是0-11`
- getTime(),返回相应的Date对象
- getTimeInMillis()，返回1970.1.1以来的毫秒数
- set(Field)设置时间字段
- add(field,amount)根据制定字段增加/减少时间
- roll(field.amount)根据制定字段增加/减少时间，但不影响上一级的时间段


- Java8推出新的时间API java.time包
## 原因
- 旧的设计不好（重名的类、线程不安全等）
- 新版本优点
	- 不变性，在多线程环境下
	- 遵循设计模式，设计得更好，可扩展性强

## 概述
- java.time包：新的Java日期/时间API的基础包
- java.time.chrono包：为非ISO的日历系统定义了一些泛化的API,
- java.time.format包：`格式化和解析日期时间对象`的类
- java.time.temporal包：包含一些时态对象，可以用其找出关于日期/时间对象的某个特定日期或时间
- java.time.zone包：包含`支持不同时区以及相关规则`的类

- LocalDate:日期类
- LocalTime:时间类（时分秒-纳秒）
- LocalDateTime:LocalDate+LocalTime
- Instant:时间戳


## 使用方法
### 获取当前时间
```java
	Calendar calendar = Calendar.getInstance();  f
	//获取年
        int year = calendar.get(Calendar.YEAR);

        //获取月，月份为0-11，所以+1才是真实年份
        int month = calendar.get(Calendar.MONTH) + 1;

        //获取日
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        //获取时
        int hour = calendar.get(Calendar.HOUR_OF_DAY); //24小时制表示

        //获取分
        int minute = calendar.get(Calendar.MINUTE);

        //获取秒
        int second = calendar.get(Calendar.SECOND);
```
### 获取之后时间
```java
	calendar.add(Calendar.YEAR,1);
	//获取年
	int year = calendar.get(Calendar.YEAR);
	……
```

### 获取任意时间
```java
	//假设求6月的最后一天
	int currentMonth = 6;
	//先求出7月份的第一天，时间上这里的6为外部传递进来的curentMonth变量
	calendar.set(calendar.get(Calendar.YEAR),currentMonth,1);
	calendar.add(Calendar.DATE,-1);
	//获取日
	int day = calendar.get(Calendar.DAY_OF_MONTH);
	System.out.println("6月最后一天是" + day +"号");
```






































