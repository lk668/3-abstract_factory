##抽象工厂模式
#####应用场合：
在一个产品族中，定义多个产品
#####描述：
工厂之上的工厂，即超级工厂
#####实现：

1. 创建Shape和Color接口
2. 创建实现接口的具体类
3. 创建抽象工厂AbstractFactory，用于定义获取Shape和Color实例的方法
4. 创建ShapeFactory和ColorFactory，两者实现了AbstractFactory的抽象方法
5. 创建FactoryProducer类，用来获取AbstractFactory对象。
6. 创建主函数，实现相应功能

