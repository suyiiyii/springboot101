package top.suyiiyii.service;

import org.springframework.stereotype.Service;
import top.suyiiyii.dto.GradeDto;

import java.util.List;

@Service
public class GradeService {

    public List<GradeDto> getAllGrades() {
        // TODO: Implement this method to return all grades
        return List.of(new GradeDto("20180001", 90), new GradeDto("20180002", 80), new GradeDto("20180003", 70));
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