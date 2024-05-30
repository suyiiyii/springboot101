package top.suyiiyii.controller;

import org.springframework.web.bind.annotation.*;
import top.suyiiyii.dto.GradeDto;

import java.util.List;

@RestController
public class GradeController {


    @GetMapping("/all_grades")
    List<GradeDto> allGrades() {
        return List.of(new GradeDto("20180001", 90), new GradeDto("20180002", 80), new GradeDto("20180003", 70));
    }

    @GetMapping("/grade")
    public GradeDto getGrade(@RequestParam String studentid) {
        return new GradeDto("20180001", 90);
    }

    @PostMapping("/add_grade")
    public GradeDto addGrade(@RequestBody GradeDto grade) {
        return grade;
    }
}
