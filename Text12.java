public class Text12 {
    public static void main(String[] args) {
        ArrayListOne<String> a=new ArrayListOne<String>();
          a.isEmpty();//判空
        //第一种无下索引参数的加法   O(1)
          a.add("a");
          a.add("C");
          //第二种有索引参数的加法
          a.add(0,"b");
          //正序遍历
         a.traverse();
         //第一种删除指定元素
        a.remove("a");
        //第二种删索引
        a.remove(0);
        //正序遍历
        a.traverse();
        //更新
        a.renew(0,"元素");
        //正序遍历
        a.traverse();
        //查找元素，获取元素，获取长度）
        System.out.println("*元素*的索引位置为"+a.index("元素"));
        System.out.println("第一个元素是："+a.index(0));
        System.out.println("线性表的表长度为："+a.getLength());
        System.out.println("线性表的元素数量长度为："+a.getData());
    }
}
