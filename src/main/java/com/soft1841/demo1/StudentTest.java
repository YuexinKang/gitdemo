package com.soft1841.demo1;

import java.util.*;

public class StudentTest {
    public static void main(String[] args) {
        List<Student> list1=new ArrayList<>();
        list1.add(new Student(06,"郭瑞昌"));
        list1.add(new Student(26,"张攀华"));
        List<Student> list2=new ArrayList<>();
        list2.add(new Student(30,"亢悦昕"));
        list2.add(new Student(36,"姚思佳"));
        Map<String,List<Student>> map =new HashMap<>();
        map.put("男生",list1);
        map.put("女生",list2);
        Iterator<Map.Entry<String,List<Student>>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,List<Student>> entry =iterator.next();
            System.out.println(entry.getKey());
            List<Student> list = entry.getValue();
            for (Student s:list
                 ) {
                System.out.println(s.getId()+"    "+s.getName());
            }


            }

        }

    }

