function main(strArr) {
    str = strArr.toString();
    let splitPattern = /[\.\, #]/g;
    let temp = [];
    let result = [];
    temp = str.split(splitPattern);
    for (let word of temp) {
        let strResult = "";

        for (let letter of word) {
            if (letter.charCodeAt(0) >= 65 && letter.charCodeAt(0) <= 90) {
                strResult += letter;
                if (strResult.length === word.length) {
                    result.push(strResult);
                }
            }
        }
    }
    console.log(result.join(", "))
}