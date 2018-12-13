#  相关Jvm学习了解
## 类加载器
*  作用
    > * 装载.class文件
*  classloader 有两种装载class的方式 （时机）：
    > * 隐式：运行过程中，碰到new方式生成对象时，隐式调用classLoader到JVM
    > * 显式：通过class.forname()动态加载
* 采用双亲委派模型
    > * 除了Bootstrap class loader加载器，每个加载器都有它的父类加载器，但并不是通过继承的方式，而是以组合的关系复用父类加载器的代码。
    > * 每个加载器有自己的命名空间，该命名是由父类加载器和该加载器中组成。在同一个命名空间，不会存在类的完整名字(包含类的包名)相同的两个
    类
*  工作过程
    > * 当前的CLassLoader从已经加载的类中查询是否已经被加载（每个类加载器有自己的缓存，类加载的时候会将其放入缓存），有则直接缓存。
    > * 当前的ClassLoader没有找到缓存，父类去找，父类没有，再往上找(查找策略同上)，直到 Bootstrap class loader顶层加载器，都没有，再由当前的ClassLoader进行加载并放入缓存
*   好处
    > * 避免了核心类（java.lang）的替换和重复加载，相同的class被不同的ClassLoader加载就是两个类，转型会抛出java.lang.ClassCaseException 
*   结构:
    > * Bootstrap classLoader 最顶层父类加载器，C/C++编写，加载核心类 java.lang.*
    > * Extension classLoader 加载器由sun.misc.Launcher$ExtClassLoader实现，它负责加载JDK\jre\lib\ext目录中相关类,如 javax.*
    > * Application ClassLoader 该类加载器由sun.misc.Launcher$AppClassLoader来实现，它负责加载用户类路径（ClassPath）所指定的类，开发者可以直接使用该类加载器
* * *       
## jvm结构
* 结构图
    >![结构图](https://camo.githubusercontent.com/0f136629b1032b8ca6cb159d902ed76c461aeffa/68747470733a2f2f7365676d656e746661756c742e636f6d2f696d672f62566d786c38)
* PC计数器（PC Register）
    >一块较小的内存空间，可以看做是当前线程所执行的字节码的行号指示器, NAMELY存储每个线程下一步将执行的JVM指令，如该方法为native的，则PC寄存器中不存储任何信息。
    Java 的多线程机制离不开程序计数器，每个线程都有一个自己的PC，以便完成不同线程上下文环境的切换
* java虚拟机栈
    >也是线程私有的，和线程一样被创建，生命周期和线程相同。描述的是 java方法执行的内存模型 :每个方法创建的时候同时创建一个栈帧（Stack Frame），用来存储局部变量表
    操作数栈，动态链接，方法出口等。每一个方法被调用直至执行完成的过程就对应着一个栈帧在虚拟机栈中从入栈到出栈的过程。
* 本地方法栈
    >和java虚拟机栈相类似，虚拟机栈为虚拟机执行java方法服务，而本地方法栈则为虚拟机使用本地方法服务
*  java 堆(heap)
    > * 所有线程共享的一块区域，虚拟机启动的时候创建，是jvm用来存储对象实例和数组值的区域，可以认为java所有new出来的对象内存都在此分配。
    > * 堆在 JVM 启动的时候就进行创建，堆中存储了各种对象，这些对象被GC所管理。这些对象无需，也无法显示的被销毁
    > * JVM将Heap分为两块：新生代New Generation和旧生代Old Generation 
    > * 堆在JVM是所有线程共享的，因此在其上进行对象内存的分配均需要进行加锁，这也是new开销比较大的原因  
    > * 由于上面原因 Sun Hotspot JVM 为了提高对象内存分配的效率，为所创建的线程的线程分配独立的空间，这块空间称为TLAB
    > * TLAB 只用于新生代的伊甸区，因此多个小对象比大对象分配起来更加高效
* 方法区
    > * 方法区和堆一样，也是线程共享，存储类的结构信息，包括 _常量池_ , _成员变量_ , _方法数据_ , _构造函数_ 和 _普通函数的字节码_ ,还有类,实例，接口初始化用到的特殊方法。
    当开发人员通过Class对象中的getName,isInstance等方法获取信息时，这些数据都来自于方法区
    > * 方法区也是全局共享，在JVM启动的时候创建，在一定条件下可以被GC。这块区域对应持久代 。
    > * PermSize 指定大小
## GC相关    
         
