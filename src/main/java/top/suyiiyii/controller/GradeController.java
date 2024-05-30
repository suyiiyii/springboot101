package top.suyiiyii.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.suyiiyii.dto.GradeDto;
import top.suyiiyii.service.GradeService;

import java.util.List;

@RestController
public class GradeController {

    private final GradeService gradeService;

    @Autowired
    public GradeController(GradeService gradeService) {
        this.gradeService = gradeService;
    }

    @GetMapping("/all_grades")
    List<GradeDto> allGrades(@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int size) {
        return gradeService.getAllGrades(page, size);
    }

    @GetMapping("/grade")
    public GradeDto getGrade(@RequestParam String studentid) {
        return gradeService.getGrade(studentid);
    }

    @PostMapping("/add_grade")
    public GradeDto addGrade(@RequestBody GradeDto grade) {
        return gradeService.addGrade(grade);
    }
}