package com.workintech.jpa_services.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.workintech.jpa_services.entity.Course;
import com.workintech.jpa_services.entity.Instructor;
import com.workintech.jpa_services.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class StudentCourseRequest {

    private Student student;

    private List<CourseRequestDto> courseList;



}
