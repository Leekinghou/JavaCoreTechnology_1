- **核心：父亲有的，儿子就有**

## 继承出现的原因
面向过程的编程语言没有继承，导致出现了很多类型的重复定义

## 什么是？
将类的共同点提取出来就构成了父类/基类/超类

- Parent class/Extend_00.Base class/Super class
而其他类自动成为子类/派生类

- Child class/Derived class


## 原则
1. 根据信息隐藏的原则：子类会继承父类所有的方法，可以直接使用

2. 子类会继承父类的所有属性和方法（但不能直接访问private成员）

3. 单根继承原则：每个类只能继承一个类

## 主要内容
- 如果不写extends，实际上每个Java类都是在默认继承[java.lang.Object](https://baike.baidu.com/item/java.lang.Object)类

``` java
class Human extends java.lang.Object

```

- Java所有类从java.lang.Object开始，构建出一个类型继承树

- Object类里面默认就有以下等待方法
```
clone,equals,finalize,getClass,hashCode,toString
```


- 每个Java类必须有构造函数，而Java没有析构函数

- 如果没有显示定义构造函数，**`java编译器`**会自动为该类产生一个空的**`无形参的`**构造函数，如果有写好的有参数的构造函数，java编译器不会越俎代庖

## 总结
- 子类继承父类们所有的东西 **(但是不能直接访问private成员)**
- Java所有的类都继承自java.lang.Object类
- Java所有的类都是单根继承
- 子类构造函数默认第一句话都会去调用父类的构造函数
