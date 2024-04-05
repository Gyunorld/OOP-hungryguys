# 🚗 주차 걱정 끝! 스마트 주차 시스템

- 차량 종류에 따른 맞춤형 주차
- 실시간 주차 가능 대수 확인
- 편리한 입출차 관리
- 주차 위치 한눈에 확인

## 🔍 주요 기능

- **주차 자리 배치 시스템**
  - 주차 가능 대수 출력
  - 입차, 출차, 주차 위치 조회, 종료 중 실행할 기능 선택
  - 주차장의 차량 배치 출력
  - 주차 위치 조회 기능

- **입차 시스템**
  - 차량 종류에 따라 일반 주차장 또는 주차타워로 분류
  - 주차가 완료되면 주차자리에 차량을 출력

- **출차 시스템**
  - 차량 번호 입력을 통한 출차 진행
  - 출차가 완료되면 주차자리에 초록색 네모칸을 출력
    
## ⚙️ 핵심 기술 스택

- Java
- Git & GitHub

## 💻 실행 과정

### 입차
  1. 차량 번호 입력
  2. 차량의 종류 선택
  3. 차량의 종류에 따라서 차량 주차장 지정
  4. 각 주차장의 빈자리에 차량 주차

### 출차
  1. 차량 번호 입력
  2. 차량 번호와 일치하는 차량 확인
  3. 출차 진행

### 주차 위치 조회
  1. 차량 번호 입력
  2. 차량이 주차된 주차장 확인
  3. 차량이 주차된 주차 위치 확인
  4. 차량이 주차된 주차장과 주차 위치 출력

```bash
git clone https://github.com/kevin0591/OOP-hungryguys.git
```

## 👴 프로젝트 후기

### 김민규

 - 기획과 협업이 처음으로 이루어진 프로젝트였습니다. 그동안 과제만 하는 것과 많은 차이가 있었습니다. 처음으로 기획을
   진행했는데 프로젝트에서 기획의 중요성을 알게 되었습니다. 프로그램의 구조를 어떻게 작성하고 표현할 것인지가 중요하다
   는 것을 알게 되었습니다. DTO와 기능들에 대한 이름을 정하는 것이 여러 명이 함꼐 작업할 때 꺠달았습니다. 혼자서
   작업하는 것이 아니기 때문에 공통의 규칙과 기본적인 구조를 상세히 설명하고 공유하는 것이 중요했습니다. 팀원들 사이의
   의사소통과정이 중요하다는 것도 인지했습니다. 현재의 팀원들과 의사소통이 활발해질수록 코드를 작성하는 것이 수월해지고
   에러를 수정할 때도 많은 도움을 얻었습니다. 다음 협업에서는 계획적으로 툴을 이용해서 구체적인 기획을 통해서 발전할
   수 있도록 개선해야 할 것 같습니다.

### 육슬찬

  - 프로젝트라고 하기 민망한 미니프로젝트였지만 많은 것을 겪고 배울 수 있어 좋았습니다.
    간단한 기능이라고 생각했던 것이 클래스를 나누고 역할을 분담하면서 생각보다 복잡했었고, 시행착오를 겪으면서 기본기를
    다질 수 있었습니다. 시간적 공간적 제약으로 어려움도 있었지만 항상 적극적으로 임하는 조원들과 함께 프로젝트를 진행하며
    협업의 즐거움을 느낄 수 있었습니다.

### 좌상현 

 - <좋았던 점>
    기초적으로 사람들과 어떻게 협업을 해서 결과를 도출하는지 연습이 되는 좋은 경험이였습니다. 서로의 의견이 다를 때
    제가 어떻게 대처를 하고 조율 하는지 알 수 있게 되었고 바뀌어야 되겠다고 생각한 부분도 있다고 느꼈습니다.
    무엇보다 사람들과 의견을 주고 받으면서 같이 무언가를 만드는 것이 재밌다고 느껴졌습니다.

 - <아쉬운 점>
   프로젝트를 시작하기 앞서서 여러 다이어그램들을 만들어 보면서 전체적인 구조를 구성하고, 클래스들의 필드와 메소드를
   어떻게 만들 것인지 충분히 논의했어야 했는데 이 부분이 미흡했던 것 같습니다. 이러한 사전 준비가 부족하다보니 전체적인
   진행이 더뎌진다는 것이 느껴졌습니다.

   이번 기회를 통해 제가 부족했던 부분을 알 수 있어서 유익한 시간이였고 앞으로 더 보완해서 추후 프로젝트에는 더 좋은 
   결과를 만들고 싶다고 생각했습니다

### 추형진 

  - 조가 만들어지고 프로젝트 주제를 정할 때 저희 조는 거의 10분도 안되서 주제를 정했던 것 같았음. 저는 뭐든 무슨 주제든
    도전해보고 싶었고 그렇게 주차장 시스템이라는 주제가 정해지고 난 후, 그 당시에는 이 미니-미니-프로젝트가 내 잠을 가불할
    정도로 매달려서 질질 끌려다닐줄은 몰랐었습니다..
    입차의 기능을 담당하면서 초반에 생각했던 것 처럼 막상 쉽게 생각보다 코드를 바로 짤 수 없었으며, 지금까지 배웠던 것을
    써먹어야 했는데 복습을 꾸준히하지 않아서 어떤 메소드에 어떤 것을 쓸지 바로바로 떠오르지가 않았습니다..  이때는 정말 말하는 감자가
    되어 복습을 꾸준히 안 했던 것을 후회를 했었네요.

    이번 미니미니프로젝트 경험을 통하여 대학교에서는 이렇게 진지하게 해보지 못 했었던 처음으로 소박하지만 본격적인 프로젝트였고,
    기능들을 구현하면서 수많은 버그들이 있었지만 분석하면서 내가 짠 코드를 더 이해하고 마지막에 정상적으로 작동이 잘 되었을 때의
    그 짜맀했던 쾌감, 밤 늦게까지 모여서 쩔쩔 개발을 했던 그 순간들을 바탕으로 보상을 받았던 기분이였습니다.
    
    부족한 점도 매우 많은 제 의견을 따라주고 추천해주고 도와주웠던 조원 형님들에게 촥촥한 감사의 말씀을 드립니다~!
