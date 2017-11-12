function main(arr) {
    let i = 1;
    let num = Number(arr[0]);
    while (i <= num) {
        let currentNumber = i.toString().split("").reverse().join("");
        if(i == Number(currentNumber)) {
            console.log(i);
        }
        i++;
    }
}