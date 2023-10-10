function randomRange(myMin, myMax) {
    // Only change code below this line
    let x = Math.floor(Math.random() * (myMax - myMin + 1)) + myMin;
    let y = (myMax - myMin + 1) + myMin;
    console.log("y: " + y);
    console.log("x: " + x);
    return x;
    // Only change code above this line
}

//console.log("its " + randomRange(20,100));
console.log("r: " + randomRange(1, 100));