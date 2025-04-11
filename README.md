# SKCC KMS AI - RA-JAVA-API-GATEWAY

## 소개

이 프로젝트는 게이트웨이가 작동 중인지 확인하는 데 사용됩니다.

## 사전 요구사항

- JDK 17 이상
- Lombok
- Gradle 8.3 (또는 포함된 Gradle wrapper 사용)

## 프로젝트 구조

이 프로젝트는 다음 모듈로 구성되어 있습니다:

- `api-gateway` - 게이트웨이의 활동 상태를 확인하고 게이트웨이 서비스를 종료합니다.

## 설정 및 설치

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
> `./gradlew: Permission denied` 오류가 발생할 경우 아래 명령어 중 하나를 실행합니다.
>
>    -``sudo chmod +x ./gradlew``
>    
>    -``git update-index --chmod=+x gradlew``
>
> 실행이 완료되면 위의 2단계(프로젝트 빌드)부터 다시 시도합니다.

## 애플리케이션 실행

1. 서비스 시작:

```bash
./gradlew :api-gateway:bootRun
```

> [!NOTE]
> 
> IntelliJ, Eclipse 등 IDE에서 프로젝트를 실행할 수도 있습니다.
> 프로젝트 시작 시 오류가 발생하면 아래 항목을 확인하세요:
> - JDK 버전
> - Gradle 설정
> - 프록시 차단
> - 프로젝트 내부의 '.gradle' 폴더를 삭제하고 2단계(프로젝트 빌드)에서 Gradle을 다시 빌드

2. 게이트웨이 상태 확인:

- 상태 확인: http://localhost:9102/api/v1/gw/health/check

![health check](docs/imgs/gateway-up.png)

- 게이트웨이 종료: http://localhost:9102/api/v1/gw/health/down

![shutdown gateway](docs/imgs/gateway-down.png)

## 관련 저장소

- [ra-java-framework-common](https://github.com/skccmygit/ra-java-framework-common) API 관리 / 메뉴관리 / 코드관리 / 파일관리 / 기타
- [ra-java-framework-work-batch](https://github.com/skccmygit/ra-java-framework-work-batch) API 로그 / 계정권한 관련 배치

## 문제 해결

- IDE 콘솔 또는 프로젝트 디렉토리에 생성된 파일에서 자세한 오류 메시지를 확인하세요.

![gradle error](docs/imgs/gradle-log.png)