package dev.michaelnapoleon.restassureddemo.controllers;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Builder
@Data
class Result {
  private String resultText;
}

@RestController
public class RADemoController {

  @GetMapping("/test")
  public ResponseEntity<Result> test() {
    Result result = Result.builder()
        .resultText("test result")
        .build();

    return ResponseEntity.ok().body(result);
  }
}
