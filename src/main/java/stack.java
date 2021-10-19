import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

/**
 * Project name(项目名称)：List集合
 * Package(包名): PACKAGE_NAME
 * Class(类名): stack
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/19
 * Time(创建时间)： 19:31
 * Version(版本): 1.0
 * Description(描述)： 使用linkedList实现栈
 */

abstract class s
{
    abstract public char popStack();

    abstract public void pushStack(char c);

    abstract public void displayStack();

    abstract public void exitStack();
}

public class stack extends s
{
    private LinkedList<Character> p = new LinkedList<Character>();

    public char popStack()
    {
        if (p.isEmpty())
        {
            System.out.println("栈空！！！");
            return '\0';
        }
        else
        {
            char c;
            c = p.getLast();
            p.removeLast();
            return c;
        }
    }

    public void pushStack(char c)
    {
        p.addLast(c);
    }

    public void displayStack()
    {
        System.out.println("全部元素如下：");
        for (char c : p)
        {
            System.out.print(c + " ");
        }
        System.out.print("      -----长度为" + p.size());
        System.out.println();
    }

    public void exitStack()
    {
        System.out.println("感谢使用！！！");
        System.exit(1);
    }

    public static void main(String[] args)
    {
        stack st = new stack();
        System.out.println("----栈-----");
        char n = '0';
        while (true)
        {
            System.out.println("1.进栈   2.出栈   3.显示   4.退出");
            System.out.print("请输入序号：");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try
            {
                n = (char) br.read();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            if (n == '1')
            {
                System.out.print("请输入要进栈的字符：");
                char c1 = '\0';
                try
                {
                    c1 = (char) br.read();     //清掉\n
                    c1 = (char) br.read();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
                st.pushStack(c1);
            }
            else if (n == '2')
            {
                char c3 = '\0';
                c3 = st.popStack();
                if (c3 != '\0')
                {
                    System.out.println("出栈元素：" + c3);
                }
            }
            else if (n == '3')
            {
                st.displayStack();
            }
            else if (n == '4')
            {
                st.exitStack();
            }
            else
            {
                System.out.println("输入错误！！！ 自动退出");
                st.exitStack();
            }
        }
    }
}
