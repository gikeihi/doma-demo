package com.example.domademo;

import com.example.domademo.entity.TaEntity;
import com.example.domademo.entity.TdEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TestController {
    private final TestRepository testRepository;

    @GetMapping
    public List<TaEntity> test() {
        return testRepository.get();
    }

    @GetMapping("/td")
    public List<TdEntity> testTd() {
        return testRepository.getTd();
    }
}
