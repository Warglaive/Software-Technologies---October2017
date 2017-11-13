let arr = ['{"town":"Sofia","income":200}', '{"town":"Varna","income":120}', '{"town":"Pleven","income":60}', '{"town":"Varna","income":70}'];
let result = new Array();
let sum = 0;
for (let i = 0; i < arr.length; i++) {
    let s = arr[i];
    let pairs = JSON.parse(s);

    let town = pairs.town;
    let income = pairs.income;
    if (!result.hasOwnProperty(town)) {
        result.push(town);
    }

    result[town] = income;
}

console.log(result);