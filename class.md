# Java

[TOC]

## Part 01. Java Basic

### Chapter 1. 자바 프로그래밍 언어

#### - 자바의 특징

1. 단순하다 (Simple)
   1. 포인터 연산이 없다. (메모리상의 임의의 주소에 액세스 할 수 있는 기능)
   2. 구조체를 사용하지 않는다
   3. 타입 선언을 사용하지 않는다. (클래스가 타입의 의미를 가진다.)
   4. 전처리를 사용하지 않는다.
   5. 다중 상속을 허용하지 않는다. (인터페이스라는 개념으로 제공한다.)
   6. String 클래스를 제공한다
   7. 메모리 할당과 회수 시스템을 제공한다
   8. 예외처리 기능을 제공한다.
2. 객체지향 (Object Oriented)
   * 인터페이스를 명확히 정의하여 재사용 가능한 코드를 만들 수 있다.
3. 네트워크 기반(Network-Savvy)
   * TCP/IP 프로토콜을 처리하는 많은 라이브러리를 제공하낟.
4. 견고하다(Robust)
5. 안전하다
6. 아키텍처로부터 독립
7. 이식성
8. 고성능
9. 다중 쓰레드
10. 동적 결합

#### - Java Virtual Machine

* `JVM` : 자바 바이트 코드를 실행 할 수 있는 주체



### Chapter 2. 자바 프로그래밍 입문

#### Main Method

* `메인 메소드` : 실행 명령인 java를 실행 시 가장 먼저 호출 되는 부분
  * if main() 메소드가 없다면 실행 될 수 없음.
  * Application의 시작 = 특정 클래스의 main()실행

```java
public static void main(String[] args){
    
}
```



#### 출력문

* `print` :
* `println` :
* `printf` : %d, %f, %c, %s



#### 변수(variable)

* ##### 정의 : 데이터를 저장할 메모리의 위치를 나타내는 이름

  * 메모리 상에 데이터를 보관할 수 있는 공간을 확보

 * `선언` : 자료형 변수명;
 * `초기화` : 변수명 = 저장할 값;
 * `선언 & 초기화 동시에` : 자료형 변수명 = 저장할 값;

```java
int age; 	String name;
age = 30;	name = '철수';
int age = 30;	String name = '철수';
```

##### 	* 주의할 점

​	대소문자 구분, 공백 x, 숫자로 시작x, 예약어 x

#### Class

* 자바 프로그램의 최소 구성 단위
* 선언된 클래스 내부에 실행에 필요한 변수나 메서드 등의 정의 ({} 내에 작성)



#### java application

* 바이트 코드로 번역된 후에 바로 실행할 수 있는 일반 프로그램
* 클래스 내에 java라는 명령어로 프로그램을 실행할 때, 자동으로 호풀되어 프로그램을 시작하는 main() 메서드를 가지고 있어야함

```java
public class JavaApp{
    // 변수 선언
    // 메서드 선언
    public static void main(String args[]){
        // 실행될 프로그램 코드
        System.out.println("첫번째로 작성한 자바 프로그램")
    }
}
```



#### Data Type

| 표현 형태 | 데이터타입 |    크기     |      표현범위       |
| :-------: | :--------: | :---------: | :-----------------: |
|  논릿값   |  boolean   | 1bit만 사용 |   true 또는 false   |
| 단일 문자 |    char    |    2byte    | '\u0000' - '\uffff' |
|   정수    |    byte    |    1byte    |     -128 ~ 127      |
|   정수    |   short    |    2byte    |   -2^15 ~ 2^15-1    |
|   정수    | int (기본) |    4byte    |   -2^31 ~ 2^31-1    |
|   정수    |    long    |    8byte    |   -2^63 ~ 2^63-1    |
|   실수    |   float    |    4byte    |                     |
|   실수    |   double   |    8byte    |                     |

* 데이터 타입의 범위를 초과하는 값을 저장하면 컴파일시 오류 발생





#### 데이터 타입의 변환

* 변수의 타입을 다른 타입으로 변경
* `Promotion (묵시적 형변환)` : 작은 데이터 타입 => 큰 데이터 타입
  * 데이터 손실의 우려가 없어 자동 캐스팅
  * 형변환 현산자를 사용하지 않아도 자동으로 형변환이 이루어 지는 경우
* `Demotion (명시적 형변환)` : 큰 데이터 타입 => 작은 데이터 타입

  * 데이터 손실의 우려로 명시적 캐스팅
* 데이터 타입이 축소되어 변환된 후에도 **해당 값을 표현**할 수 있어야 함



#### 자바 연산자 (기본 문법)

* 산술연산자
  * 정수형, 실수형에 사용됨
    * 단항 연산자: ++, == (++3, 3++)
    * 다항 연산자: +, =, *, /, %
* 비교연산자
  * 대소비교, 타입비교
  * True or False를 반환
    * \>, >=, <, <=, ==, !=, instanceof

* 논리연산자
  * boolean 데이터 타입에 적용
  * True or False 반환
    * &, &&, |, ||, !
    * && : 값 1이 False인 경우 값 2를 수행하지 않고 False 리턴
    * || : 값 1이 True인 경우 값 2를 수행하지 않고 True 리턴



#### 제어문 (조건문)

* if 문:

```java
if (조건식1) {		// 조건식 자리는 반드시 참과 거짓 구분
    실행문장;
} else if (조건식2) {		// 문장이 여러개일 때는 블록처리 해주어야 한다.  
    실행문장;
} else {	      // else절은 필요에 따라
    실행문장
}
```



* switch 문:

```java
switch (수식) {
    case 값1:
        처리문장들;
        break;	// break 없으면 찾을 때 가지 선택된 case문 아래의 모든 문장을 실행
    case 값2:
        처리문장들;
        break;	
    default: 	// else와 같은 역할
        묵시적으로 처리해야하는 문장들;
}
```



#### 제어문 (반복문)

* for 문:

```java
for (초기값;조건;증감){
    반복할 문장들;
}
반복문 빠져나옴;
```



* while 문: 조건이 참인동안 반복

```java
while(조건절){
    반복문장들;
}
```



* do ~ while 문: 일단 do 블럭 내의 문장 실행 후 조건이 참이면 반복

```java
do {
    반복할 문장들
} while(조건절);
```



* break:
  * switch문에서 벗어나는데 사용
  * 반복문에서 반복 루프를 벗어나는데 사용
  * 중접된 반복문에서 반복문을 한번에 빠져나갈때 사용

```java
int i = 1;
while(i<100){
    if(i==10)break;
    System.out.print(i+"자바의 세계로 오세요!");
    i++;
}
```

```java
int i,j;
for(i=1;i<=5;i++){
    for(j=1;j<=i;j++){
        if (j>3) break; // 내포된 반복문만 벗어난다.
        System.out.print("*");
    }
    System.out.println();
}
```

```java
int i,j;
first: for(i=1;i<=5;i++){
    for (j=1;j<=i;j++){
        if (j>3) break first; // first라는 이름의 블록을 벗어난다.
        System.out.print("*");
    }
    System.out.println();
}
```



* continue
  * 반복문의 특정지점에서 제어를 반복문의 처음으로 보낸다.

```java
class ContinueTest{
    public static void main(String args[]){
        for(int i=0;i<10;i++){
            if(i%2==0) continue;
            System.out.println(i+"자바의 세계로 오세요!");
        }
    }
}
```



#### 배열

- **같은 종류의 데이터**를 저장하기 위한 자료구조
- **크기 고정** (한번 생성된 배열은 크기를 바꿀 수 없다.)
- 배열을 객체로 취급

* `선언`: 타입 [] 배열이름
* `생성`
  * `1차원 배열` : 배열의 이름 = new 배열유형 [배열크기];
  * `2차원 배열` : 배열의 이름 = new 배열유형\[1차원 배열개수\]\[*1차원배열의크기\];
* 배열이 생성되면 자동적으로 배열 요소는 기본값으로 초기화
* `초기화` : 배열이름[인덱스]*[인덱스] = 값;
  * 배열의 인덱스는 0부터 시작
  * 배열의 크기: 배열이름.length

# 

```java
//배열의 생성
int [] iArr; // 하나의 값을 저장할 수 있는 메모리 생성
int [][] aptInfoList; //하나의 값을 저장할 수 있는 메모리 생성

//배열의 초기화
int[] iArr = new int[3];
```



## Chapter 3. 상속 (Inheritance)

* 상속: 기존 클래스의 자산(멤버, `변수 및 메서드`)을 자식 클래스에서 재사용하기 위한 것
  * 부모의 생성자와 초기화 블록은 상속하지 않는다.
* 기존 클래스의 멤버를 물려 받기 때문에 코드의 절감
  * 부모의 코드를 변경하면 모든 자식들에게도 적용 => 유지 보수성 향상
* 상속의 적용
  * extends 키워드 사용

```java
public class Person{
    String name;
    
    void eat(){}
    void jump(){}
}

public class SpiderMan extends Person{
    boolean isSpider;
    void fireWeb()
}
```



