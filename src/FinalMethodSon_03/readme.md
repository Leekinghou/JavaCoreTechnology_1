Java的final关键字可以用来修饰
    - 类
    - 方法
    - 字段
final的类，不能被继承
父类中如果有final 方法，子类中不能改写此方法

final的变量不能再次被赋值
    - 如果是基本型别的变量，不能修改其值
    - 如果是对象实例，那么不能修改其指针（但是可以修改对象内部的值）

总结：
    - final类：没有子类继承
    - final方法：不能被子类改写
    - final变量：基本类型不能修改值，对象类型不能修改指针
