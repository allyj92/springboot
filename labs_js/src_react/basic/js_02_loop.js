// 배열
let arr = [100, 200, 300, 400, 500];

for (let i = 0; i < arr.length; i++) {
    console.log('original: ' + arr[i]);
}

for (let i in arr) {
    // in -> index
    console.log('in: ' + arr[i]);
}

let obj = {
    a: 100,
    b: 200,
    c: 300,
};

for (let i of arr) {
    console.log('of: ' + i);
}

arr.forEach(function (item) {
    console.log('forEach: ' + item);
});

arr.forEach((item) => console.log('arrow: ' + item)); // 화살표 함수
arr.map((x) => x * 2).forEach((item) => console.log('map-arrow: ' + item));
// map, filter, reduce, some, every
let total = arr.filter((x) => x >= 300).reduce((tot, x) => (tot += x));
console.log('filter-reduce : ' + total);

let result = arr.some((x) => x >= 500);
console.log('some: ' + result);

// while문 직접 확인
