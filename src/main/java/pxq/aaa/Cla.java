package pxq.aaa;

/**
 * @describe:
 * @user: pxq
 * @date: 2019/12/4 11:09
 */
//抽象类内的方法可以不为抽象方法
//抽象类实现接口时，想实现的方法直接实现，不想实现的方法指定为抽象方法
public abstract class Cla implements Inter{
    @Override
    public abstract void test();

    @Override
    public int test11() {
        return 0;
    }
    public abstract void test2();


}
