package top.suyiiyii.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import top.suyiiyii.model.Grade;

import java.util.List;

@Mapper
public interface GradeMapper {

    List<Grade> getAllGrades();
}
