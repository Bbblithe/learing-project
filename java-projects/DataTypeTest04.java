/*
	  关于java当中的整数型：
	  数据类型                  占用空间大小   默认值       取值范围
	  ————————————————————————————————————————————————————————————
	  byte                       1            0          【-128～127】
	  short                      2            0          【-32768～32767】
	  int                        4            0          【-2147483648～2147483647】
	  long                       8            OL          

	#java当中的“整数型字面值”被默认当做int类型来处理。要让这个“整数型字面值”被当作long类型来处理的话，需要在“整数型字面值”后面添加1/L，建议使用大写的L

	#java语言中的整数型字面值有三种表示方式：
	  第一种：十进制【是一种缺省默认的方式】（就是直接啥都不加默认是十进制）
	  第二种：八进制【在编写八进制整理数型字面值的时候需要以0开始】 
	  第三种：十六进制【在编写十六进制整数型的时候需要以0x开始】   
*/

public class DataTypeTest04
{
	public static void main(String[] args)
	{
          int a =10;
          int b =010;
          int c =0x10;

          System.out.println(a);
          System.out.println(b);// 这里最前面的0就相当于说明这里后面的'10'是六进制10 所以输出的值应该是六进制转回十进制的结果
          //输出的结果就应该是8（因为八进制满八进下一位）
          System.out.println(c);//而这里的c同样的道理，‘0x’说明了这里的‘10‘是十六进制的10，所以输出结果也就是对应十进制的16e

          System.out.println(a+b+c);

          int i = 123;  //123这个整数类型是int类型 。i变量声明的时候也是int类型。int类型的123赋值给int类型的变量i，不存在类型转换
          System.out.println(i);

          //456整数类型字面值被当作int类型，占用4个字节
          //x变量在声明的时候是long类型,占用8个字节
          //int类型的字面值456赋值给long类型的变量x，存在类型转换
          //int类型转换成long类型
          //int类型是小容量
          //long类型是大容量
          //小容量可以自动转换为大容量，称为自动转换类型机制。
          long x = 456;
          System.out.println(x);

           //2147483647字面值是int类型，占用四个字节
          //y是long类型占用八个类型，自动类型转换
          long y = 2147483647;
          System.out.println(y);

           //编译错误：过大的整数
           //2147483648被默认当作int类型4个字节处理，但是这个字节超出了int类型的范围
          // 解决方法就是一来就把后面的2147483648当作long类型处理
          //
          //long z = 2147483648;
          long z =2147483648L;

          System.out.println(z);
    }      
}	      