package 接口在开发中的作用;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/2 18:29
 * Description:
 *
 */

//顾客
public class Customer {
    //顾客手里有一个菜单
    //Customer has a FoodMenu(这句话什么意思：顾客有一个菜单)
    //记住：以后凡是能够使用 has a 来描述的，统一以属性的方式存在。
    //实例变量，属性
    private FoodMenu foodMenu;//养成封装的好习惯。

    //如果以下这样写，就表示写死了（焊接了。没有空插拔了。）
    //中餐厨师
    //ChinaCooker1 cc;

    //西餐厨师
    //AmericCooker ac;

    //构造方法
    public Customer(){

    }

    public Customer(FoodMenu foodMenu){
        this.foodMenu=foodMenu;
    }

    //setter and getter方法

    public FoodMenu getFoodMenu() {
        return foodMenu;
    }

    public void setFoodMenu(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }

    //提供一个点菜的方法
    public void order(){
        //先拿到菜单才能点菜
        //调用get方法拿菜单。
        //FoodMenu fm=this.getFoodMenu();
        //也可以不调用get方法，因为在本类中私有的属性是可以访问的
        foodMenu.shiZhiChaoJiDan();
        foodMenu.yuXiangRouSi();

    }
}
/*
    Cat is a Animal,但凡满足is a的表示都可以设置为继承。
    Customer has a FoodMenu，但凡是满足has a的表示都可以以属性的形式存在。
 */

/*
class Address {
    String city;
    String street;
    String zipcode;
    public void Address(String city,String street,String zipcode){
        this.city=city;
        this.street=street;
        this.zipcode=zipcode;
    }
}

class User{

    String id;

    //和这个一样。
    //String是一个类。
    //name是变量名。
    //name是一个引用
    String name;

    //Address是一个类名。
    //这就是一个变量。
    //实例变量。
    Address addr;   // addr 是一个引用，是一个变量。

    public static void main(String[] args){
        //局部变量
        //Address addr;
        //addr =new Address();

        //合并
        Address addr=new Address();

        User u=new User();
        u.id="2015022136";
        u.name= "zhangsan";
        u.addr =new Address();

        System.out.println(u.addr.city); //null
        System.out.println(u.addr.street);  //null
        System.out.println(u.addr.zipcode); //null
    }
}

//"自己"类
//Myself has a friend
class Myself{
    //  你这个对象，应该有一个朋友对象的电话号码。
    //  电话号码就是一个对象的内存地址。联系你朋友的时候，打电话。
    //  f是一个引用，f默认值是null，是null表示，你没有朋友。
    Friend f;

    //通过构造方法能不能给你一个朋友对象。
    public Myself(Friend f){
        this.f=f;
    }

    public static void main(String[] args){
        //创建朋友对象
        Friend f =new Friend(); //朋友对象有了

        //创建对象的同时交朋友。
        Myself m2=new Myself(f);


        //创建自己对象
        //目前还没有交朋友。
        Myself m =new Myself(); //自己对象
        //交朋友
        m.f = f;  //把朋友的地址给了你。
    }
}

//"朋友类"
class Friend{

}
 */
