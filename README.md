# 공통기능(대규모) - API 게이트웨이

## 소개

공통기능(대규모) - API 게이트웨이 재활용 모듈은 인증, 라우팅, 요청 필터링 및 API 권한 체크 등 다양한 관문 역할을 하며, 클라이언트와 백엔드 사이의 중추 역할을 합니다.

- 로컬 환경에서 Docker를 통해 실행 가능하며 Swagger UI를 통해 API를 확인 할 수 있습니다.
- 서비스 간 통합 API 호출 제어, 보안 필터링, 공통 응답 처리등에 사용할 수 있습니다.
- 인증 필터 및 Redis 기반 권한 검증 기능이 내장되어 있습니다.

> **이 모듈은 소규모 프로젝트에 적용이 용이하도록 경량화된 버전으로도 배포될 예정입니다 (2025년 6월 이후).**

주요 기능:
- **인증 및 인가**: JWT 기반 인증 및 역할 기반 접근 제어를 구현하여 안전한 API 접근을 보장합니다.
- **요청 필터링**: IP 화이트리스트 및 토큰 검증을 기반으로 들어오는 요청을 필터링합니다.
- **중앙화된 API 관리**: 모든 API 요청에 대한 단일 진입점을 제공하여 서비스 통합 및 관리를 간소화합니다.
- **상태 모니터링**: 게이트웨이의 상태를 확인하고 필요 시 종료할 수 있는 엔드포인트를 제공합니다.
- **확장성과 유연성**: 높은 트래픽을 처리할 수 있도록 설계되었으며 RA-JAVA 프레임워크의 다른 구성 요소와 원활하게 통합됩니다.

## 사전 준비 사항

- JDK 17 이상
- Lombok
- Gradle 8.3 (또는 포함된 Gradle wrapper)

## 프로젝트 구조

다음 모듈로 구성되어 있습니다:

- `api-gateway` - 게이트웨이의 동작 상태를 확인하고, 게이트웨이 서비스를 종료합니다.

## 설치 및 설정

1. 저장소를 클론합니다:

```bash
git clone <repository-url>
cd api-gateway
```

2. 프로젝트를 빌드합니다:

```bash
./gradlew clean build
```

> [!NOTE]
>
> 만약 `./gradlew: Permission denied` 오류가 발생한다면, 아래 명령어 중 하나를 실행한 뒤
>
>    -``sudo chmod +x ./gradlew``
>    
>    -``git update-index --chmod=+x gradlew``
>
> 다시 2단계(프로젝트 빌드)를 진행해 보세요.

## 애플리케이션 실행

1. 서비스를 시작합니다:

```bash
./gradlew :api-gateway:bootRun
```

> [!NOTE]
>
> IDE(예: IntelliJ, Eclipse 등)에서 프로젝트를 실행할 수도 있습니다.  
> 실행 시 오류가 발생한다면 다음 설정을 확인해 보세요:  
> - JDK 버전  
> - Gradle 설정  
> - 프록시 차단 여부  
> - 프로젝트 내부 `.gradle` 폴더 제거 후, 2단계(프로젝트 빌드) 다시 실행

2. 게이트웨이 헬스체크:

- 헬스체크: http://localhost:9102/api/v1/gw/health/check

![health check](docs/imgs/gateway-up.png)

- 게이트웨이 종료: http://localhost:9102/api/v1/gw/health/down

![shutdown gateway](docs/imgs/gateway-down.png)

## 관련 저장소

- [ra-java-framework-common](https://github.com/skccmygit/ra-java-framework-common) API 관리 / 메뉴 관리 / 코드 관리 / 파일 관리 / 기타
- [ra-java-framework-work-batch](https://github.com/skccmygit/ra-java-framework-work-batch) API 로그 / 계정 권한 관련 배치

## 문제 해결

- IDE 콘솔 또는 프로젝트 디렉터리에 생성된 파일의 에러 로그를 확인해 자세한 에러 메시지를 파악합니다.

![gradle error](docs/imgs/gradle-log.png)
