let obj1 = { name:"박문수", age:29 };
let obj2 = { ...obj1, email:"mspark@gmail.com" };  //새로운 속성 추가
console.log(obj2);

let arr1 = [ 100, 200, 300 ];
let arr2 = [ 'hello', ...arr1, 'world'];
console.log(arr1);      
console.log(arr2);   
