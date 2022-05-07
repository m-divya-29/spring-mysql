package com.example.accessdatamysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class EducationController {
    @Autowired
    EducationRepository educationRepository;
    @GetMapping("/all/Education")
    public @ResponseBody Iterable<Education> getAllEducation(){
        return educationRepository.findAll();
    }
    @PostMapping("/addEducation")
    public @ResponseBody String addEducation(@RequestParam Map<String, String> requestParams){
        try {
            String title = requestParams.get("title");
            String percentage = requestParams.get("percentage");
            String year = requestParams.get("year");
            Education education = new Education();
            education.setPercentage(Float.valueOf(percentage));
            education.setTitle(title);
            education.setYear(Integer.valueOf(year));
            educationRepository.save(education);
            return "Successfully saved";
        } catch (Exception e){
            return "Invalid data, nothing saved "+ e;
        }
    }
}