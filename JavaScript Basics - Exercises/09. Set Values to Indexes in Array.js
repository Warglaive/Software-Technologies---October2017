function main(arr) {
    let n = Number(arr[0]);
    let result = new Array(n).fill(0);
    for (i = 1; i < arr.length; i++) {
        let currentNum = arr[i].split(' ');

        let index = Number(currentNum[0]);
        let value = Number(currentNum[2]);
        result[index] = value;
    }
    for (let obj of result) {
        console.log(obj);
    }
}