package com.soft1841.demo1;

/**
 * 枚举类型示例
 * 2019.3,21
 */
enum Weeks{
    MON("周一"),TUE("周二"),WED("周三"),THU("周四"),FRI("周五");
    String weekname;
    Weeks(String weekname){
        this.weekname = weekname;
    }
    public String getWeekname(){
        return weekname;
    }

//定义一个静态方法，根据一个简称得到完整的工作日名称
     public static Weeks getResult(String input) {
       switch (input) {
           case "MON":
            return Weeks.MON;
           case "TUE":
            return Weeks.TUE;
           case "WED":
            return Weeks.WED;
           case "THU":
            return Weeks.THU;
           case "FRI":
            return Weeks.FRI;
       }
         return null;
     }
}


    public class WeekDay {
        public static void main(String[] args) {
            Weeks weeks =Weeks.getResult("MON");
            System.out.println(weeks+"   "+weeks.getWeekname());
        }
    }

