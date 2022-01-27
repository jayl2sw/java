class ExDate{
    String year;
    String month;
    String day;
    ExDate(){
        year = "2021";
        month = "4";
        day = "01";
    }

    ExDate(int y, int m, int d){
        year = Integer.toString(y);
        month = Integer.toString(m);
        day = Integer.toString(d);
    }

    void showDate(){
        System.out.println(this.year +"년 "+ this.month+"월 "+ this.day+"일");

    }
}
public class ExDateMain{
    public static void main(String[] args) {
        ExDate ex01 =  new ExDate();
        ex01.showDate();
        ExDate ex02 = new ExDate(2021, 8, 11);
        ex02.showDate();
       
    }
}