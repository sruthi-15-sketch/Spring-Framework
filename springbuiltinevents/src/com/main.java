package com;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
public static void main(String[] args)
{
	AbstractApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
	context.start();
	context.refresh();

}
}