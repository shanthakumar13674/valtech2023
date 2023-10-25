package com.valtech.training.day4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.valtech.training.day1.Point;

public class SerialTest {
	
	public static void main(String[] args)throws Exception {
		Point p = new Point(2,3);
		System.out.println(p);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("objects")));
		oos.writeObject(p);
		oos.flush();
		oos.close();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("objects")));
		Point p1 = (Point) ois.readObject();
		System.out.println(p1);
		System.out.println(p == p1);
	}

}

// create table employee(
//		name varchar(20),
//		age int,
//	    experience int,
//	    seniority int,
//	    salary int);

// insert into employee (name,age,experience,seniority,salary) values ('Abc',23,1,1,20000);
// insert into employee (name,age,experience,seniority,salary) values ('Def',32,12,3,50000);

// alter table employee add id int primary key auto_increment;


















