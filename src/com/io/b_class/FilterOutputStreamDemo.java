package com.io.b_class;

/**
 * @author y15079
 * @create 2017-11-03 15:37
 * @desc
 *
 * FilterOutputStream 的作用是用来“封装其它的输出流，并为它们提供额外的功能”。
 * 它主要包括BufferedOutputStream, DataOutputStream和PrintStream。
 *
 * (01) BufferedOutputStream的作用就是为“输出流提供缓冲功能”。
 *(02) DataOutputStream 是用来装饰其它输出流，将DataOutputStream和DataInputStream输入流配合使用，“允许应用程序以与机器无关方式从底层输入流中读写基本 Java 数据类型”。
 *(03) PrintStream 是用来装饰其它输出流。它能为其他输出流添加了功能，使它们能够方便地打印各种数据值表示形式。
 *
 **/
public class FilterOutputStreamDemo  {

}
