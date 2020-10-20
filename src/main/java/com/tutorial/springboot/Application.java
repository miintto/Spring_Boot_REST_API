package com.tutorial.springboot;

/*
  SpringBootApplication
      - 하위 어노테이션을 포함하여 구성
      Configuration : 메인 클래스 정의
      EnableAutoConfiguration : 추가 설정들을 자동으로 등록
      ComponentScan : 메인 클래스를 기준으로 component, config, service 탐색

  ApplicationArguments

  ApplicationRunner
      - SpringBoot가 실행하는 것을 제어

  ApplicationPidFileWriter
      - Process ID를 제어
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * <pre>
 * :Description
 *     메인 실행 class
 * </pre>
 */
@SpringBootApplication(scanBasePackages="com.tutorial.springboot")
public class Application {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);
        app.run(args);
    }

}
