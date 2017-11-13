function main(arr) {
    let result = new Array();
    let objects = arr.map(JSON.parse);
    for (let obj of objects) {

        if (obj.town in result) {
            result[obj.town] += obj.income;
        }
        else {
            result[obj.town] = obj.income;
        }
    }
    let sort = Object.keys(result).sort();
    for (let obj of sort) {
        console.log(`${obj} -> ${result[obj]}`)
    }
}