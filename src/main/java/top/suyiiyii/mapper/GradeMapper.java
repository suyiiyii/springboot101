package top.suyiiyii.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;
import top.suyiiyii.model.Grade;

import java.util.List;

@Mapper
public interface GradeMapper {

    List<Grade> getAllGrades();

    List<Grade> getAllGrades(RowBounds rowBounds);

    Grade getGradeById(String studentid);

    void addGrade(Grade grade);
}
