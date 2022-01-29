var byteSize = 64;
var buffer = new ArrayBuffer(byteSize);
var i32View = new Int32Array(buffer);
i32View[0] = 45;
console.log(i32View);
