package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("")
    public String hello() {
        return """
               <h1>Giới thiệu nhóm</h1>
               <p><b>Nhóm:</b> Nhóm Đại đại</p>
               <p><b>Thành viên:</b></p>
           <ul>
               <li>Huỳnh Thanh Ngân </li>
               <li>Lưu Viễn Dương</li>
               <li>Hồ Như Trâm</li>
               <li>Phetsaninda</li>
               <li>Somphone</li>
           </ul>
               <p><b>Đề tài demo:</b> Triển khai ứng dụng Spring Boot lên Cloud</p>
               <p><b>Môn học:</b> Điện toán đám mây</p>
               """;
    }
}