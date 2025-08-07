// 변수 (es6기준)
let a = 10; // 변수
const b = '가나다'; // 상수
var c = true; // 프로퍼티(Window)

console.log(console);

// var console = 'abcd';
// console.log(console);

console.log(10 + 20); // 상수풀

// 자바스크립트 데이터 타입
console.log(typeof 10);
console.log(typeof 10.1);
console.log(typeof '12345');
console.log(typeof true);
console.log(typeof function () {});
console.log(typeof ((i) => i));
console.log(typeof {});
console.log(typeof []);
console.log(typeof aaaa);

// 자바스크립트 연산
console.log(1 + '2');
console.log('1' + 2);
console.log('1' / 2);
console.log('1' * 1 + 2);

// 템플릿 문자열
console.log(`1+2=${1 + 2}`);

// 비교 연산자
console.log(123 == '123'); // 값
console.log(123 === '123'); // 값, 타입

// 형변환
console.log(Number('1') + 2);
console.log(Number(true) + 2);
console.log(Number('abcd'));
console.log(Number('123abcd'));
console.log(isNaN(Number('123abcd')));

// 구조분해할당
let arr = [1, 2, 3];
let [d, e, f] = arr;
console.log(d, e, f);

let [g = 0, h = 0, i = 0] = [1, 2];
console.log(g, h, i);

let { p1, p2, p3 } = {
    p1: 1,
    p2: 'str',
    p3: true,
};
console.log(p1, p2, p3);
