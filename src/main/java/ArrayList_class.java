import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Project name(项目名称)：List集合
 * Package(包名): PACKAGE_NAME
 * Class(类名): ArrayList_class
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/19
 * Time(创建时间)： 18:48
 * Version(版本): 1.0
 * Description(描述)： List 是一个有序、可重复的集合，集合中每个元素都有其对应的顺序索引。List 集合允许使用重复元素，
 * 可以通过索引来访问指定位置的集合元素。List 集合默认按元素的添加顺序设置元素的索引，
 * 第一个添加到 List 集合中的元素的索引为 0，第二个为 1，依此类推。
 * List 实现了 Collection 接口，它主要有两个常用的实现类：ArrayList 类和 LinkedList 类。
 * ArrayList 类
 * ArrayList 类实现了可变数组的大小，存储在内的数据称为元素。它还提供了快速基于索引访问元素的方式，对尾部成员的增加和删除支持较好。
 * 使用 ArrayList 创建的集合，允许对集合中的元素进行快速的随机访问，不过，向 ArrayList 中插入与删除元素的速度相对较慢。
 * ArrayList 类的常用构造方法有如下两种重载形式：
 * ArrayList()：构造一个初始容量为 10 的空列表。
 * ArrayList(Collection<extends >c)：构造一个包含指定 Collection 元素的列表，这些元素是按照该 Collection 的迭代器返回它们的顺序排列的。
 * ArrayList 类除了包含 Collection 接口中的所有方法之外，还包括 List 接口中提供的如表 1 所示的方法。
 * 表 1 ArrayList类的常用方法
 * 方法名称	说明
 * E get(int index)	获取此集合中指定索引位置的元素，E 为集合中元素的数据类型
 * int index(Object o)	返回此集合中第一次出现指定元素的索引，如果此集合不包含该元
 * 素，则返回 -1
 * int lastIndexOf(Object o)	返回此集合中最后一次出现指定元素的索引，如果此集合不包含该
 * 元素，则返回 -1
 * E set(int index, Eelement)	将此集合中指定索引位置的元素修改为 element 参数指定的对象。
 * 此方法返回此集合中指定索引位置的原元素
 * List<E> subList(int fromlndex, int tolndex)	返回一个新的集合，新集合中包含 fromlndex 和 tolndex 索引之间
 * 的所有元素。包含 fromlndex 处的元素，不包含 tolndex 索引处的元素
 */

public class ArrayList_class
{
    public static void main(String[] args)
    {
        //新版jdk已弃用
    }
}

