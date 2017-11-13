let numArr = [10, 30, 15, 20, 50, 5];
let result = new Array();
numArr = numArr.sort(function (a, b) {
    return b - a
});

while (numArr.length > 3) {
    let lastPosition = numArr.length;
    result.push(numArr.splice(1))
}
console.log(result);