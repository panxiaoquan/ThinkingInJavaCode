package pxq.aaa;

/**
 * @describe:
 * @user: pxq
 * @date: 2019/12/2 14:19
 */
public enum MembersEnum {
    Member1("zhangsan","男","111111"),
    Member2("lisi","男","222222222"),
    Member3("wangwu","男","33333333333333");
    private String name;
    private String sex;
    private String hobby;
    MembersEnum(String name, String sex, String hobby){
        this.name = name;
        this.sex = sex;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }}

