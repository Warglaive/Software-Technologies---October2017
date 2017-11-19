function main(inputLine) {
    for (let obj of inputLine) {
        if (obj === 'Stop') {
            break;
        }
        else {
            console.log(obj);
        }
    }
}