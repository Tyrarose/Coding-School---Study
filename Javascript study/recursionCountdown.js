// Only change code below this line
function countdown(n) {
    console.log("out:  " + n);
    if (n < 1) {
        console.log("if:   " + n)
        return [];
    } else {
        console.log("else: " + n)
        const countArray = countdown(n - 1);
        console.log("\t\tvar: " + countArray);
        countArray.push(n);
        console.log("\tpush: " + n)
        countArray.unshift(n);
        console.log("\tunshift: " + n)
        return countArray;
    }
}
(countdown(5));
// Only change code above this line