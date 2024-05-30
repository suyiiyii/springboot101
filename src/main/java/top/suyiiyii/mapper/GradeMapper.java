package top.suyiiyii.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.suyiiyii.model.Grade;

import java.util.List;

@Mapper
public interface GradeMapper {

    List<Grade> getAllGrades();

    Grade getGradeById(String studentid);

    void addGrade(Grade grade);
}
