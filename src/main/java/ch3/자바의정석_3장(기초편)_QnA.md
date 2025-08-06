# Java 기초 개념 핵심 정리

## 1. Java 메인 메서드 구조

```java
public static void main(String args[])
```

| 키워드 | 의미 | 이유 |
|--------|------|------|
| `public` | 공개 | JVM이 어디서든 접근 가능해야 함 |
| `static` | 정적 | 객체 생성 없이 호출 가능해야 함 |
| `void` | 무반환 | 프로그램 시작점이므로 반환값 불필요 |
| `main` | 메인 | JVM이 찾는 고정된 메서드명 |
| `String args[]` | 인수 | 명령행 매개변수 |

## 2. static 키워드 활용

### static을 사용하는 경우
- **유틸리티 메서드**: `MathUtils.add(5, 3)`
- **상수**: `Constants.MAX_USERS = 1000`
- **공유 데이터**: 전체 객체가 공유하는 카운터
- **팩토리 메서드**: `User.createAdmin("관리자")`

### 판단 기준
- 객체의 상태와 무관한 기능 → static
- 모든 객체가 공유해야 하는 데이터 → static
- 특정 객체에 속한 기능 → 일반 메서드

## 3. 정수 타입 오버플로우

### 순환 원리
```java
byte a = 10, b = 30;
byte c = (byte)(a * b);  // 300 → 44
```

**과정**: `300 % 256 = 44` (byte는 256개 값 순환)

### 모든 정수 타입 적용
| 타입 | 비트 | 순환 크기 | 범위 |
|------|------|-----------|------|
| byte | 8 | 256 | -128 ~ 127 |
| short | 16 | 65,536 | -32,768 ~ 32,767 |
| int | 32 | 4,294,967,296 | -21억 ~ +21억 |
| long | 64 | 2^64 | 매우 큰 범위 |

## 4. signed int와 비트 해석

### signed int 특징
- 최상위 비트 = 부호 비트 (0=양수, 1=음수)
- 나머지 31비트 = 크기 표현
- 오버플로우 시 음수로 변환 가능

### 발생 시점
1. **오버플로우** (모듈로 연산): 연산 시점에 하드웨어가 처리
2. **비트 해석** (signed 변환): 값 사용 시점에 소프트웨어가 해석

## 5. int×int→long 할당 문제

```java
int x = 1_000_000, y = 2_000_000;
long z = x * y;  // ❌ 이미 int로 연산되어 오버플로우
```

**해결책**: 연산 전 미리 형변환
```java
long z = (long)x * y;  // ✅ long 연산으로 처리
```

## 6. Java 클래스 구조 규칙

### 클래스 내부 가능 요소
- ✅ 필드 (변수 선언)
- ✅ 메서드
- ✅ 생성자
- ✅ 초기화 블록
- ❌ 직접 실행문 (`System.out.println()` 등)

### 실행문 위치
```java
class Example {
    // System.out.println();  // ❌ unexpected token
    
    public void method() {
        System.out.println();  // ✅ 메서드 안에서
    }
}
```

## 7. String 객체 생성과 메모리

### 생성 방식 차이
```java
String str1 = "abc";              // String Pool 사용
String str2 = new String("abc");  // Heap에 새 객체 생성
```

### 메모리 구조
- **둘 다 변수에는 객체 주소만 저장**
- 차이점: 어느 메모리 영역의 객체를 가리키느냐
- `str1 == str2`: false (다른 객체)
- `str1.equals(str2)`: true (같은 내용)

## 8. String 비교 메서드

### equals vs equalsIgnoreCase
```java
str.equals("ABC")           // 대소문자 구분
str.equalsIgnoreCase("ABC") // 대소문자 무시
```

**equalsIgnoreCase 동작**: 각 문자를 소문자로 통일하여 비교 (실제 문자열 변환 없이)

## 9. 문자 범위 검사

```java
char ch = 'C';  // 대문자
ch < 'a' || ch > 'z'  // 소문자 범위 밖인가? → true
```

**ASCII 순서**: `A(65)...Z(90)...a(97)...z(122)`
- 대문자는 소문자보다 ASCII 값이 작음
- `'C' < 'a'` → `67 < 97` → true

## 10. 형변환 규칙

### 자동 형변환 (생략 가능)
- **확장 변환**: `byte → short → int → long → float → double`
- **업캐스팅**: 자식 클래스 → 부모 클래스
- **Autoboxing**: `Integer i = 10`
- **String 연결**: `"값: " + 123`

### 명시적 형변환 (생략 불가)
- **축소 변환**: `int → byte`, `double → float`
- **다운캐스팅**: 부모 클래스 → 자식 클래스

## 핵심 원칙

1. **메모리 효율성**: static으로 불필요한 객체 생성 방지
2. **타입 안전성**: 컴파일러가 체크할 수 있는 명확한 타입 사용
3. **오버플로우 주의**: 큰 수 연산 시 미리 큰 타입으로 변환
4. **참조 vs 값**: Java 객체는 모두 참조로 관리
5. **코드 구조**: 실행문은 반드시 메서드/생성자/초기화 블록 안에