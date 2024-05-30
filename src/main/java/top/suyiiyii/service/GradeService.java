package top.suyiiyii.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import top.suyiiyii.dto.GradeDto;
import top.suyiiyii.mapper.GradeMapper;
import top.suyiiyii.model.Grade;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GradeService {

    private final GradeMapper gradeMapper;
    private final ModelMapper modelMapper = new ModelMapper();

    public GradeService(GradeMapper gradeMapper) {
        this.gradeMapper = gradeMapper;
    }

    public List<GradeDto> getAllGrades() {
        List<Grade> grades = gradeMapper.getAllGrades();
        return grades.stream().map(grade -> modelMapper.map(grade, GradeDto.class)).toList();

//        return List.of(new GradeDto("20180001", 90), new GradeDto("20180002", 80), new GradeDto("20180003", 70));
    }

    public GradeDto getGrade(String studentid) {
        return modelMapper.map(gradeMapper.getGradeById(studentid), GradeDto.class);
    }

    public GradeDto addGrade(GradeDto grade) {
        gradeMapper.addGrade(modelMapper.map(grade, Grade.class));
        return grade;
    }
}