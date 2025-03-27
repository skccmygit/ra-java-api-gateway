# SKCC KMS AI - RA-JAVA-API-GATEWAY

## 소개

[RA-JAVA-API-GATEWAY]에 오신 것을 환영합니다! 이 프로젝트 문서는 프로젝트 설정을 안내하여 빠르게 시작할 수 있도록 도와드립니다
이 프로젝트는 게이트웨이가 작동하는지 확인하는 데 사용됩니다.

## 사전 요구사항

- JDK 17 이상
- Lombok
- Docker 및 Docker Compose
- Gradle 8.3 (또는 포함된 Gradle wrapper 사용)

## 프로젝트 구조

프로젝트는 다음 모듈로 구성됩니다:

- `api-gateway` - 게이트웨이의 활동 상태를 확인하고 게이트웨이 서비스를 종료합니다.

## 설치 및 설정

1. 저장소 복제:

```bash
git clone <repository-url>
cd api-gateway
```

2. 프로젝트 빌드:

```bash
./gradlew clean build
```
## 애플리케이션 실행

1. 서비스 시작:

```bash
./gradlew :api-gateway:bootRun
```

2. 게이트웨이 헬스:

- 헬스 확인: http://localhost:9102/api/v1/gw/health/check

![헬스 확인](docs/imgs/gateway-up.png)

- 게이트웨이 종료: http://localhost:9102/api/v1/gw/health/down

![게이트웨이 종료](docs/imgs/gateway-down.png)

## 관련 저장소

- [ra-java-framework-common](https://github.com/skccmygit/ra-java-framework-common)
- [ra-java-framework-work-batch](https://github.com/skccmygit/ra-java-framework-work-batch)
- [ra-java-framework-account](https://github.com/skccmygit/ra-java-framework-account)

## 문제 해결

- 자세한 오류 메시지는 debug.log 확인
