# JavaDesignPattern

基于Java的设计模式学习示例

### 构建

* 项目构建 gradle
* 语言描述 Java


### 设计原则

* 1、开闭原则（Open Close Principle）    
开闭原则就是说对扩展开放，对修改关闭。在程序需要进行拓展的时候，不能去修改原有的代码，实现一个热插拔的效果。所以一句话概括就是：为了使程序的扩展性好，易于维护和升级。想要达到这样的效果，我们需要使用接口和抽象类，后面的具体设计中我们会提到这点。
* 2、里氏代换原则（Liskov Substitution Principle）    
里氏代换原则(Liskov Substitution Principle LSP)面向对象设计的基本原则之一。 里氏代换原则中说，任何基类可以出现的地方，子类一定可以出现。 LSP是继承复用的基石，只有当衍生类可以替换掉基类，软件单位的功能不受到影响时，基类才能真正被复用，而衍生类也能够在基类的基础上增加新的行为。里氏代换原则是对“开-闭”原则的补充。实现“开-闭”原则的关键步骤就是抽象化。而基类与子类的继承关系就是抽象化的具体实现，所以里氏代换原则是对实现抽象化的具体步骤的规范。
* 3、依赖倒转原则（Dependence Inversion Principle）    
这个是开闭原则的基础，具体内容：真对接口编程，依赖于抽象而不依赖于具体。
* 4、接口隔离原则（Interface Segregation Principle）    
这个原则的意思是：使用多个隔离的接口，比使用单个接口要好。还是一个降低类之间的耦合度的意思，从这儿我们看出，其实设计模式就是一个软件的设计思想，从大型软件架构出发，为了升级和维护方便。所以上文中多次出现：降低依赖，降低耦合。
* 5、迪米特法则（最少知道原则）（Demeter Principle）    
为什么叫最少知道原则，就是说：一个实体应当尽量少的与其他实体之间发生相互作用，使得系统功能模块相对独立。
* 6、合成复用原则（Composite Reuse Principle）    
原则是尽量使用合成/聚合的方式，而不是使用继承。

### 设计模式分类
* 创建型模式（5）：工厂方法模式、抽象工厂模式、单例模式、建造者模式、原型模式。
* 结构型模式（7）：适配器模式、装饰器模式、代理模式、外观模式、桥接模式、组合模式、享元模式。
* 行为型模式（11）：策略模式、模板方法模式、观察者模式、迭代子模式、责任链模式、命令模式、备忘录模式、状态模式、访问者模式、中介者模式、解释器模式。

### 详解
* Decorator模式
 

* Proxy  代理模式


* Factory 工厂模式

* Builder 建造模式
 
* Prototype 原型模式
* Singleton 单例模式

* Adapter  适配器模式 

适配器模式将某个类的接口转换成客户端期望的另一个接口表示，目的是消除由于接口不匹配所造成的类的兼容性问题。主要分为三类：类的适配器模式、对象的适配器模式、接口的适配器模式。

 * 类的适配器模式：当希望将一个类转换成满足另一个新接口的类时，可以使用类的适配器模式，创建一个新类，继承原有的类，实现新的接口即可。    
 * 对象的适配器模式：当希望将一个对象转换成满足另一个新接口的对象时，可以创建一个Wrapper类，持有原类的一个实例，在Wrapper类的方法中，调用实例的方法就行。    
 * 接口的适配器模式：当不希望实现一个接口中所有的方法时，可以创建一个抽象类Wrapper，实现所有方法，我们写别的类的时候，继承抽象类即可。     
