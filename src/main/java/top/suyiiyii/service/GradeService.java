package top.suyiiyii.service;

import org.springframework.stereotype.Service;
import top.suyiiyii.dto.GradeDto;
import top.suyiiyii.mapper.GradeMapper;
import top.suyiiyii.model.Grade;

import java.util.List;

@Service
public class GradeService {

    private final GradeMapper gradeMapper;

    public GradeService(GradeMapper gradeMapper) {
        this.gradeMapper = gradeMapper;
    }

    public List<GradeDto> getAllGrades() {
        List<Grade> grades = gradeMapper.getAllGrades();
        return grades.stream().map(grade -> new GradeDto(grade.getStudentid(), grade.getGrade())).toList();

//        return List.of(new GradeDto("20180001", 90), new GradeDto("20180002", 80), new GradeDto("20180003", 70));
    }

    public GradeDto getGrade(String studentid) {
        // TODO: Implement this method to return the grade of a specific student
        return new GradeDto("20180001", 90);
    }

    public GradeDto addGrade(GradeDto grade) {
        // TODO: Implement this method to add a new grade
        return grade;
    }
}