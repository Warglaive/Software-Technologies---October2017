function main(numArr) {

    numArr = numArr.sort(function (a, b) {
        return b - a
    });

    while (numArr.length > 3) {
        let lastPosition = numArr.length;
        (numArr.splice(-1));
    }
    for (let obj of numArr) {
        console.log(obj);
    }
}