package Collection;

import org.junit.Test;

import java.util.*;


/**
 * @describe:
 * @user: pxq
 * @date: 2019/12/4 10:31
 */
//list有序(有序即按照插入顺序)，元素可重复；set无序(不按照插入顺序，按照set内部排序)，元素不可重复。
public class Thinking002 {
    @Test
    public void test() {
        Set set = new HashSet() {{
            add(1);
            add(4);
            add(2);
        }};
        List list1 = new ArrayList() {{
            add(1);
            add(2);
        }};
        List list = new ArrayList();
        Collection collection = new ArrayList() {
            {
                add(1);
                add(2);
            }
        };
        Integer[] month = {11, 12, 13, 14};
        Collections.addAll(set, 2, 3, 4, 5, 6);
        Collections.addAll(set, Arrays.asList(month));
        list1.addAll(collection);
        System.out.println(list1);
        boolean b = set.add(-1);
        System.out.println(b);
        for (Object tmp : set) {
            System.out.println(tmp);
        }
        /*
         * 将array转化为list可通过Arrays.aslist(array)，也可通过Arrays.stream(array).collect(Collectors.toList)。
         * 只要通过Arrays.asList初始化List,就不能向list添加,删除元素
         * 但是第一种转化为list后不能向里面添加元素，第二种可以
         * */
        String[] arr = new String[]{"1", "4", "2", "6", "3"};
//        List list = Arrays.asList(arr);
////        list.add(2);
//        List list = Arrays.stream(arr).collect(Collectors.toList());
//        list.add("eeeeeeeeeee");
//        Iterator iterator = list.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
        Set set2 = new HashSet();
        Set set1 = new HashSet();
        set1.addAll(Arrays.asList(month));
        Collections.addAll(set2, month);
        System.out.println(set1);
        System.out.println(set2);
    }

    @Test
    public void test1() {
        List list = new ArrayList() {{
            add(1);
            add(2);
        }};
        List list1 = new ArrayList() {{
            add(1);
            add(2);
        }};
        list.addAll(new ArrayList() {{
            add(3);
            add(4);
        }}); //将列表的元素添加到list中
        Collections.addAll(list1, new ArrayList() {{
            add(3);
            add(4);
        }});//将整个列表添加到list中
        list.stream().forEach(p -> System.out.println(p));
        list1.stream().forEach(p -> System.out.println(p));
    }

    @Test
    public void test2() {
        class Snow {
        }
        class Powder extends Snow {
        }
        class Light extends Powder {
        }
        class Heavy extends Powder {
        }
        class Crusty extends Snow {
        }
        class Slush extends Snow {
        }
        List<Snow> snow1 = Arrays.asList(new Crusty(), new Slush(), new Powder());
        List<Snow> snow2 = Arrays.<Snow>asList(new Light(), new Heavy());
        List<Snow> snow3 = new ArrayList<Snow>();
        Collections.addAll(snow3, new Light(), new Heavy());
    }

    @Test
    //11.4
    //HashSet,TreeSet,LinkedHashSet
    //HashSet是最快的获取元素的方式,不知道排序规则，TreeSet按照比较的结果升序排序，LinkedHashSet按照输入的顺序排序
    //HashMap是最快的获取元素的方式,不知道排序规则，TreeMap按照键比较的结果升序排序，LinkedHashMap按照键输入的顺序排序
    public void test3() {
       Integer[] arr = new Integer[]{1,2,3,4,5};
        System.out.println(Arrays.toString(arr));//打印数组

    }

    @Test
    //11.5
    //ArrayList,LinkedList
    //ArrayList随机访问快(根据索引)，插入删除慢(要移动数据)
    //LinkedList插入删除快(只要变指针)，随机访问慢(从头到尾顺序的找)
    public void test4(){
        Random random = new Random(47);
        System.out.println(random.nextInt(11));

    }

    @Test
    public void test5(){
        
    }

}
