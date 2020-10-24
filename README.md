### Spring Boot REST API

# 1. Description
## 1.1 File Directory

~~~
$> tree -d
.
├─ main
│   ├─ java
│   │   └─ com
│   │       └─ tutorial
│   │           └─ springboot
│   │               │   Application.java            # 메인 실행 class
│   │               ├─ common
│   │               │       CommonResponse.java     # 공통 response format
│   │               └─ api
│   │                   ├─ controllers
│   │                   ├─ services
│   │                   ├─ repository
│   │                   ├─ responses
│   │                   ├─ dto
│   │                   └─ models
│   └─ resources
│       └─ application.yml                          # Properties 관리 파일
└─ test
    └─ java
~~~

## 1.2 Architecture

- controllers : 유저의 HTTP request 값을 받아서 service 에 전달
- services    : 비즈니스 로직을 처리
- repository  : DB에 접근하여 데이터 가져옴
- responses   : 반환 할 response 처리
- dto         : DTO - 계층간 교환되는 데이터를 처리할 객체
- models      : DAO - DB 테이블에 접근할 데이터 형태

# 2. Run Server

main class 실행 후 http://localhost:8080/ 에 접속

