package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

   StudentList studentList;
   Student s1, s2;

    @BeforeEach
    void init(){
        studentList = new StudentList();
        studentList.addNewStudent("6xxxxxxxx0","winner");
        studentList.addNewStudent("6xxxxxxxx1", "winwin");
        s1 = new Student("6xxxxxxxx0", "winner",80);
        s2 = new Student("6xxxxxxxx1", "winwin",60);

    }



    @Test
    void testFindStudentById()
    {
        assertEquals(s1.getId(),studentList.getStudents().get(0).getId());
        assertEquals(s2.getId(),studentList.getStudents().get(1).getId());
    }

    @Test
    void testGiveScoreToId(){
        studentList.getStudents().get(0).addScore(80);
        studentList.getStudents().get(1).addScore(60);

        assertEquals(s1.getScore(),studentList.getStudents().get(0).getScore());
        assertEquals(s2.getScore(),studentList.getStudents().get(1).getScore());
    }

    @Test
    void testViewGradeOfId()
    {
        studentList.getStudents().get(0).addScore(80);
        studentList.getStudents().get(1).addScore(60);

        assertEquals(s1.grade(),studentList.getStudents().get(0).grade());
        assertEquals(s2.grade(),studentList.getStudents().get(1).grade());
    }
}