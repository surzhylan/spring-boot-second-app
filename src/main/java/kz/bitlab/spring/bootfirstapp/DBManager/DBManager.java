package kz.bitlab.spring.bootfirstapp.DBManager;

import kz.bitlab.spring.bootfirstapp.model.Students;

import java.util.ArrayList;

public class DBManager {
    private static ArrayList<Students> students = new ArrayList<>();
    private static Long id = 7L;

    static {
        students.add(new Students(1L,"Ilyas","Zhuanyshev",88,"B"));
        students.add(new Students(2L,"Nurzhan","Bolatov",48,"F"));
        students.add(new Students(3L,"Serik","Erikov",91,"A"));
        students.add(new Students(4L,"Erik","Serikov",65,"C"));
        students.add(new Students(5L,"Sabina","Assetova",33,"F"));
        students.add(new Students(6L,"Partick","Zuckerberg",100,"A"));
    }

    public static ArrayList<Students> getAllStudents(){
        return students;
    }

    public static void addStudent(Students student){
        student.setId(id);
        students.add(student);
        id++;
    }
}
