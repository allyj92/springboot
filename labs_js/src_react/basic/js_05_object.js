/* 리터럴 */
const calc = {
    a: 1,
    b: 2,
    add: function () {
        return this.a + this.b;
    },
};

console.log(calc.add());

calc.b = 3;

console.log(calc.add());

calc.c = 3;

calc.add = function (a, b, c) {
    return this.a + this.b + this.c;
};
console.log(calc.add());

console.test = function () {
    console.log('Test');
};

console.test();

/* 생성자 */
function calc3(a, b) {
    this.a = a;
    this.b = b;
}
calc3.prototype.add = function () {
    return this.a + this.b;
};

let obj3 = new calc3(1, 2);
console.log(obj3.add());

// class
class Polygon {
    constructor(height, width) {
        this.height = height;
        this.width = width;
    }
    // set area(param)
    get area() {
        return this.height * this.width;
    }

    print() {
        console.log('면적:' + this.area);
    }
}

let poly = new Polygon(10, 20);
console.log(poly.area);
poly.print();

class Square extends Polygon {
    constructor(length) {
        super(length, length);
    }
}

let square = new Square(10);
console.log(square.area);
poly.print();
