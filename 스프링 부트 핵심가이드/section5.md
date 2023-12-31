# 컨트롤러 클래스 설정
- 어노테이션

1. @RestController
2. @RequestMapping("/api/v1/get-api")

# URI와 URL의 차이

- URL은 우리가 흔히 말하는 웹 주소를 의미하며, 리소스가 어디에 있는지 알려주기 위한 경로를 의미 

- URI는 특정 리소스를 식별할 수 있는 식별자를 의미

웹에서 URL을 통해 리소스가 어느 서버에 위치해 있는지 알 수 있으며, 그 서버에 접근해서 리소스에 접근하기 위해서는 대부분 URI가 필요

# DTO란?

- Data Transfer Object. 다른 레이어 간의 데이터 교환에 활용됨.

- 각 클래스 및 인터페이스를 호출하면서 전달하는 매개변수로 사용되는 데이터 객체

>DTO와 VO의 차이
>
>DTO: 데이터 전송을 위해 사용되는 데이터 컨테이너. 같은 애플리케이션 내부에서 사용되는 것이 아니라 다른 서버(시스템)로 전달하는 경우에 사용됨
>
>VO: 데이터 그 자체로 의미가 있는 객체를 의미. VO의 가장 특징적인 부분은 읽기 전용으로 설계한다는 것. 값을 변경할 수 없게 데이터의 신뢰성을 유지해야 함
>
>DAO: 데이터베이스의 data에 접근하기 위한 객체. DateBase에 접근 하기 위한 로직, 비지니스 로직을 분리하기 위해 사용.

# JSON이란

- JavaScript Object Notation. 자바스크립트의 객체 문법을 따르는 문자 기반의 데이터 포맷.

- 문자열 형태로 작성되기 때문에 파싱하기도 쉽다는 장점이 있음

# Response Entity

- HttpEntity 상속받아 구현
  
- 서버에 들어온 요청에 대해 응답 데이터를 구성해서 전달할 수 있게 해줌
  
- HttpEntity와 HttpHeaders와 Body를 가지고 자체적으로 HttpStatus를 구현

- 응답 코드 변경은 물론 Header와 Body를 더욱 쉽게 구성할 수 있음

# SWAGGER
- Rest API를 편리하게 문서화 해주고, 이를 통해서 관리 및 제 3의 사용자가 편리하게 API를 호출해보고 테스트 할 수 있는 프로젝트

- Spring Boot에서는 springfox-boot-starter를 gradle dependecies에 추가 함으로 사용 가

# 로깅 라이브러리

- 로깅: 애플리케이션이 동작하는 동안 시스템의 상태나 동작 정보를 시간순으로 기록하는 것

- 로그를 잘 남기면 오류가 발생했을 때 디버깅이 용이해지고 시스템 에러가 어떤 부분이서 발생했는지 추적해서 확인 가

- 특징

  1. 5개의 로그 레벨 설정 가능
  2. 실제 운영 환경과 개발 환경에서 각각 다른 출력 레벨을 설정해서 로그를 확인 가능
  3. Logback의 설정 파일을 일정 시간마다 스캔해서 애플리케이션을 재가동하지 않아도 설정을 변경할 수 있음
  4. 별도의 프로그램 지원 없이도 자체적으로 로그 파일을 압축할 수 있음
  5. 저장된 로그 파일에 대한 보관 기간 등을 설정해서 관리 가능















