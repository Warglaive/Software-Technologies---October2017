function main(arr) {

    let X = Number(arr[0]);
    let Y = Number(arr[1]);
    let Z = Number(arr[2]);


    if (X < 0 && Y < 0 && Z > 0) {
        console.log('Positive');
    }


    else if (X < 0 || Y < 0 || Z < 0) {
        console.log('Negative');
    }


    else if (X > 0 && Y > 0 && Z > 0) {
        console.log('Positive');
    }


    else {
        console.log('Negative');
    }
}