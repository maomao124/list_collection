import java.util.LinkedList;

/**
 * Project name(项目名称)：List集合
 * Package(包名): PACKAGE_NAME
 * Class(类名): LinkedList_class
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/19
 * Time(创建时间)： 19:11
 * Version(版本): 1.0
 * Description(描述)： LinkedList类
 * LinkedList 类采用链表结构保存对象，这种结构的优点是便于向集合中插入或者删除元素。需要频繁向集合中插入和删除元素时，
 * 使用 LinkedList 类比 ArrayList 类效果高，但是 LinkedList 类随机访问元素的速度则相对较慢。
 * 这里的随机访问是指检索集合中特定索引位置的元素。
 * LinkedList 类除了包含 Collection 接口和 List 接口中的所有方法之外，还特别提供了表 2 所示的方法。
 * 表 2 LinkList类中的方法
 * 方法名称	            说明
 * void addFirst(E e)	将指定元素添加到此集合的开头
 * void addLast(E e)	将指定元素添加到此集合的末尾
 * E getFirst()	        返回此集合的第一个元素
 * E getLast()	        返回此集合的最后一个元素
 * E removeFirst()	    删除此集合中的第一个元素
 * E removeLast()	    删除此集合中的最后一个元素
 */

public class LinkedList_class
{
    public static void main(String[] args)
    {
        LinkedList<String> p=new LinkedList<String>();
        String p1=new String("abc");
        String p2="def";
        String p3="g...";
        String p4=new String("xyz");
        p.add(p1);
        p.add(p2);
        p.add(p3);
        p.add(p4);
        p.addLast(",end");
        p.addFirst("first,");
        System.out.println("显示：");
        for (String s:p)
        {
            System.out.print(s);
        }
        System.out.println();
        System.out.println("第一个：");
        System.out.println(p.getFirst());
        System.out.println("最后一个：");
        System.out.println(p.getLast());
        System.out.println("显示：");
        for (String s:p)
        {
            System.out.print(s);
        }
        System.out.println();
        System.out.println("删除第一个：");
        System.out.println(p.removeFirst());
        System.out.println("删除最后一个：");
        System.out.println(p.removeLast());
        System.out.println("显示：");
        for (String s:p)
        {
            System.out.print(s);
        }
        System.out.println();
        System.out.println("将元素‘123’添加到此集合的开头：");
        p.addFirst("123");
        System.out.println("将元素‘456’添加到此集合的末尾：");
        p.addLast("456");
        System.out.println("显示：");
        for (String s:p)
        {
            System.out.print(s);
        }
    }
}
