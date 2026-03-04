package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return """
               <h1>Giới thiệu nhóm</h1>
               <p><b>Nhóm:</b> Nhóm 3</p>
                <p><b>Thành viên:</b></p>
           <ul>
               <li>Nguyễn Văn A</li>
               <li>Trần Thị B</li>
               <li>Lê Văn C</li>
           </ul>
               <p><b>Đề tài demo:</b> Triển khai ứng dụng Spring Boot lên Cloud</p>
               <p><b>Môn học:</b> Điện toán đám mây</p>
               """;
    }
}