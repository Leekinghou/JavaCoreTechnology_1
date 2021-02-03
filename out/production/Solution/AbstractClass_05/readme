# 抽象类和接口

## 抽象类
类：属性+ 方法 （属性和方法可以是0个或多个）

一个完整的类：所有方法都有实现

类可以没有方法，但是有方法就肯定要有实现，这才是一个完整的类

一个完整的类就可以new一个对象
```java
ClassA obj = new ClassA();
```

如果一个类暂时有方法还没实现，需要被定义为 **`抽象类`**

```java
public abstract class Shape {
    int area;
    public abstract void calArea();
}
```

- 抽象类关键字 **`abstract`**
- 抽象类的组成
	- (可选)成员变量，个数不限
	- (可选)具体方法，方法有实现，个数不限
	- (可选)抽象方法，加abstract关键字，个数不限

### 注意
抽象类也是类！
抽象类也是类！
抽象类也是类！
一个类继承于抽象类，就不能继承于其他(抽象)类

子类如果要继承一个抽象类，那么就要在子类中实现抽象的父类，否则这个子类也要加abstract定义为抽象类。

## 接口
如果类的所有方法都未实现，那么这个类就算是接口interface
```java
public interface class Shape {
	public void eat();
	public void move();
}
```

接口不算类，只能算特殊的类

类只继承(extends)一个类，但是可以实现(implements)多个借口，继承和接口可以同时

- 接口可以继承(多个)接口，没有实现的方法将会叠加
- 类实现接口，就必须实现所有未实现的方法。如果没有全部实现，那么只能成为一个抽象类。
- 接口里可以定义变量，但是一般是常量

## 总结
- 抽象类和接口相同点：两者都不能被实例化，不能new操作
- 不同点:
	- 抽象类abstract，接口interface
	- 抽象类部分方法已经实现，接口所有方法都没实现
	- 一个类只能继承(extends)一个(抽象)类,实现(implements)多个接口
	- 接口可以继承(extends)多个接口
	- 抽象类有构造函数，接口没有
	- 抽象类可以有main函数，接口没有
	- 抽象类方法有private和protected，接口方法都是public

|           | 抽象类     |接口        |
|:----------|:----------|:----------|
| 标记       | abstract  |interface  |
|方法        | 部分实现   | 都未实现    |
| 继承       |    一个   | 多个        |
|构造函数     | 有        |       无  |
| main方法  | 有        |      无   |
| 方法类型  | private和protected   | Cpublic  |

> 抽象类部分方法已经实现，接口所有方法都没实现
```java
//抽象类
public abstract class LandAnimal {
    public abstract void eat();

    public void move(){
        System.out.println("I can walk by feet");
    }
}
```
```java
//接口
public interface Animal {
    public void eat();
    public void move();
}
```
> 一个类只能继承(extends)一个(抽象)类,实现(implements)多个接口

```java
public interface CatFamily extends Animal,ClimbTree{
    public void eat();
    public void move();
    public void climb();
}

```
