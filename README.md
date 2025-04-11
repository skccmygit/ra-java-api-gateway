# SKCC KMS AI - RA-JAVA-API-GATEWAY

## 소개

[RA-JAVA-API-GATEWAY]에 오신 것을 환영합니다! 이 프로젝트 문서는 프로젝트 설정을 안내하여 빠르게 시작할 수 있도록 도와드립니다
이 프로젝트는 게이트웨이가 작동하는지 확인하는 데 사용됩니다.

## 사전 요구사항

- JDK 17 이상
- Lombok
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

> [!NOTE]
>
> `./gradlew: Permission denied` 오류가 발생할 경우 다음 명령들 중에 하나를 실행해 보시면 됩니다.
>
>  -``sudo chmod +x ./gradlew``
>
>  -``git update-index --chmod=+x gradlew``

실행 완료 후 2번 스탭을 다시 진행하시면 됩니다. 

## 애플리케이션 실행

1. 서비스 시작:

```bash
./gradlew :api-gateway:bootRun
```

> [!NOTE]
>
> IntelliJ, Eclipse 등과 같은 IDE로 프로젝트를 실행할 수도 있습니다.
> 해당 프로젝트 시작 시 오류가 발생할 경우는 프로젝트 구성을 확인해야 합니다.
> - JDK 버전
> - Gradle 구성
> - 프로시 차단
> - '.gradle' 폴더를 프로젝트에서 제거하여 2번 스탭 (프로젝트 빌드)로 돌아가서 gradle를 다시 빌드하면 됩니다.


2. 게이트웨이 헬스:

- 헬스 확인: http://localhost:9102/api/v1/gw/health/check

![헬스 확인](docs/imgs/gateway-up.png)

- 게이트웨이 종료: http://localhost:9102/api/v1/gw/health/down

![게이트웨이 종료](docs/imgs/gateway-down.png)

## 관련 저장소

- [ra-java-framework-common](https://github.com/skccmygit/ra-java-framework-common) API 관리 / 메뉴관리 / 코드관리 / 파일관리 / 기타 / 인증 / 인가 / 계정관리 / 이력관리
- [ra-java-framework-work-batch](https://github.com/skccmygit/ra-java-framework-work-batch) API 로그 / 계정권한 관련 배치

## 문제 해결

- IDE의 Console에 나와 있는 오류 로그를 통해 상세 오류 메시지를 확인하거나 프로젝트 폴더에 생성된 파일을 확인합니다.

![gradle error](docs/imgs/gradle-log.png)