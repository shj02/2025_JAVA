[print format]
- %s : 문자열
- %d : 정수
- %f : 실수
- %c : 문자

[데이터 타입]
정수 데이터
|자료형|크기|
|:---:|:---:|
|byte|1byte|
|char|2byte|
|short|2byte|
|int|4byte|
|long(L)|4byte|
||
|float(f)|4byte|
|double|8byte|
||
|boolean|1byte|

[타입 변환]
- 강제타입변환 : 小 -> 大
  cData = **(char)**iData;
  iData = (int)dData; -> 소수점 이하 부분 데이터 손실 발생
